SELECT A.CAR_ID, A.CAR_TYPE, CONVERT(A.DAILY_FEE*30*((100-B.DISCOUNT_RATE)*0.01),UNSIGNED) AS FEE
FROM (SELECT A.CAR_ID, A.CAR_TYPE, A.DAILY_FEE, MAX(B.END_DATE) AS END_DATE
FROM CAR_RENTAL_COMPANY_CAR A LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B
ON A.CAR_ID = B.CAR_ID
WHERE A.CAR_TYPE IN ('SUV','세단') 
GROUP BY B.CAR_ID
HAVING '2022-11-01' > MAX(B.END_DATE) OR END_DATE IS NULL) A JOIN (SELECT CAR_TYPE, DISCOUNT_RATE
FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN 
WHERE DURATION_TYPE LIKE "30%"
    AND CAR_TYPE IN ('세단', 'SUV')) B
ON A.CAR_TYPE = B.CAR_TYPE
WHERE A.DAILY_FEE*30*((100-B.DISCOUNT_RATE)*0.01) BETWEEN 500000 AND 2000000
ORDER BY FEE DESC, 2, 1 DESC
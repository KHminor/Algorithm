SELECT T2.ANIMAL_ID, T2.NAME
FROM ANIMAL_INS T1 JOIN ANIMAL_OUTS T2
ON T1.ANIMAL_ID = T2.ANIMAL_ID
ORDER BY DATEDIFF(T2.DATETIME, T1.DATETIME)+1 DESC
LIMIT 2
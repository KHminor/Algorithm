SELECT T1.REST_ID, T1.REST_NAME, T1.FOOD_TYPE, T1.FAVORITES, T1.ADDRESS, ROUND(AVG(T2.REVIEW_SCORE),2) AS SCORE
FROM REST_INFO T1 JOIN REST_REVIEW T2 ON T1.REST_ID = T2.REST_ID
WHERE T1.ADDRESS LIKE '서울%'
GROUP BY 1
ORDER BY 6 DESC, 4 DESC
SELECT T2.INGREDIENT_TYPE, SUM(T1.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF T1, ICECREAM_INFO T2 
WHERE T1.FLAVOR = T2.FLAVOR 
GROUP BY T2.INGREDIENT_TYPE
ORDER BY SUM(T1.TOTAL_ORDER)
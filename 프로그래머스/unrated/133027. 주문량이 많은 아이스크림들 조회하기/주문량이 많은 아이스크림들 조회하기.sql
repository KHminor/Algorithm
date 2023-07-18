SELECT T2.FLAVOR
FROM FIRST_HALF T1, JULY T2
WHERE T1.FLAVOR = T2.FLAVOR
GROUP BY T2.FLAVOR
ORDER BY SUM(T2.TOTAL_ORDER)+T1.TOTAL_ORDER DESC
LIMIT 3

SELECT T1.ID, COUNT(T2.PARENT_ID) AS CHILD_COUNT
FROM ECOLI_DATA T1 LEFT JOIN ECOLI_DATA T2
    ON T1.ID = T2.PARENT_ID
GROUP BY T1.ID 
ORDER BY 1
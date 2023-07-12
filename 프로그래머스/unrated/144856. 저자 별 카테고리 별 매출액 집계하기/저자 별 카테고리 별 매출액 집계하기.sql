SELECT T1.AUTHOR_ID, T2.AUTHOR_NAME, T1.CATEGORY, SUM(T1.PRICE*T3.SALES) AS TOTAL_SALES
FROM BOOK T1, AUTHOR T2, BOOK_SALES T3 
WHERE T1.AUTHOR_ID = T2.AUTHOR_ID AND T1.BOOK_ID = T3.BOOK_ID AND T3.SALES_DATE LIKE '2022-01%'
GROUP BY T1.AUTHOR_ID, T1.CATEGORY
ORDER BY T2.AUTHOR_ID, T1.CATEGORY DESC
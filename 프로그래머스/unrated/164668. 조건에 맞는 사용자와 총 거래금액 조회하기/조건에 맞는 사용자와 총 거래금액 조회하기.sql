SELECT T2.USER_ID, T2.NICKNAME, SUM(PRICE) AS TOTAL_SALES
    FROM USED_GOODS_BOARD T1, USED_GOODS_USER T2
    WHERE T1.WRITER_ID = T2.USER_ID AND T1.STATUS = 'DONE'
    GROUP BY USER_ID
    HAVING TOTAL_SALES >= 700000
    ORDER BY TOTAL_SALES
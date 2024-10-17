-- 코드를 입력하세요
SELECT 
    TITLE, 
    A.BOARD_ID AS BOARD_ID, 
    REPLY_ID, 
    B.WRITER_ID AS WRITER_ID, 
    B.CONTENTS AS CONTENTS, 
    TO_CHAR(B.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
FROM USED_GOODS_BOARD A 
    INNER JOIN USED_GOODS_REPLY B
    ON A.BOARD_ID = B.BOARD_ID
WHERE TO_CHAR(A.CREATED_DATE, 'YYYY-MM') = '2022-10'
ORDER BY 6, 1
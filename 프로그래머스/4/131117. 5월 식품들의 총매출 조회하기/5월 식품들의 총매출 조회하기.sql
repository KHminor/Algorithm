# SELECT A.PRODUCT_ID, A.PRODUCT_NAME, (A.PRICE*SUM(B.AMOUNT)) AS TOTAL_SALES
# FROM FOOD_PRODUCT A JOIN FOOD_ORDER B
# ON A.PRODUCT_ID = B.PRODUCT_ID
#     AND B.PRODUCE_DATE LIKE '2022-05-%'
# GROUP BY B.PRODUCT_ID
# ORDER BY 3 DESC, 1


SELECT A.PRODUCT_ID, A.PRODUCT_NAME, (A.PRICE*B.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT A JOIN (SELECT PRODUCT_ID, PRODUCE_DATE, SUM(AMOUNT) AS AMOUNT
                            FROM FOOD_ORDER
                            WHERE PRODUCE_DATE LIKE '2022-05-%'
                            GROUP BY PRODUCT_ID
                         ) B
ON A.PRODUCT_ID = B.PRODUCT_ID
ORDER BY 3 DESC, 1
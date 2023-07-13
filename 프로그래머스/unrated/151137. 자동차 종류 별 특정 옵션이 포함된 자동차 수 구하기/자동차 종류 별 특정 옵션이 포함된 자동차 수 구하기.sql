# SELECT CAR_TYPE, COUNT(OPTIONS) AS CARS
#     FROM CAR_RENTAL_COMPANY_CAR 
#     GROUP BY CAR_TYPE
#     HAVING CARS IN ('통풍시트', '열선시트', '가죽시트' )

SELECT CAR_TYPE, COUNT(*) AS CARS
    FROM CAR_RENTAL_COMPANY_CAR
    WHERE OPTIONS LIKE '%통풍%' 
        OR OPTIONS LIKE '%열선%'
        OR OPTIONS LIKE '%가죽%'
    GROUP BY CAR_TYPE
    ORDER BY CAR_TYPE
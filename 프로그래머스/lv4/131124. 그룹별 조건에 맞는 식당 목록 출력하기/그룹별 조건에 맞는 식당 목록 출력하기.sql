SELECT T1.MEMBER_NAME, T2.REVIEW_TEXT, DATE_FORMAT(T2.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
    FROM MEMBER_PROFILE T1 JOIN REST_REVIEW T2
        ON T1.MEMBER_ID = T2.MEMBER_ID
    WHERE T1.MEMBER_ID = (SELECT MEMBER_ID
                        FROM REST_REVIEW 
                        GROUP BY MEMBER_ID
                        ORDER BY COUNT(MEMBER_ID) DESC
                        LIMIT 1
                          )
    ORDER BY 3, 2 
# Write your MySQL query statement below
SELECT visited_on , amount , ROUND(amount / 7 , 2) AS average_amount
FROM (
    SELECT visited_on , 
            SUM(amount) OVER(order by visited_on
                             ROWS BETWEEN 6 PRECEDING AND CURRENT ROW) as amount,
            ROW_NUMBER() OVER(ORDER BY visited_on) AS rn    
    FROM(
        SELECT visited_on , SUM(amount) as amount
        FROM Customer 
        GROUP BY visited_on
    ) daily

) t
WHERE rn >= 7
ORDER BY visited_on;

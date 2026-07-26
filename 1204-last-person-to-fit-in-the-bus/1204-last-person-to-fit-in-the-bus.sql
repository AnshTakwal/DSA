SELECT person_name
FROM (
    SELECT person_name , turn ,
    SUM(weight) OVER ( 
        ORDER BY turn 
    ) as running_total
    FROM Queue
    
) t
WHERE running_total <= 1000
ORDER BY turn DESC 
LIMIT 1;

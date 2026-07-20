# Write your MySQL query statement below
Select w.id from Weather w
join Weather we
on w.recordDate = DATE_ADD(we.recordDate, INTERVAL  1 DAY)
where w.temperature > we.temperature;
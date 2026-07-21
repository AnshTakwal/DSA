# Write your MySQL query statement below
select p.product_id ,
        CASE WHEN 
        Count(u.units) = 0  THEN 0 ELSE
                round(SUM(u.units*p.price)/SUM(u.units),2) 
                END as average_price
from Prices p 
left join UnitsSold u  
on u.product_id = p.product_id 
    and p.start_date<= u.purchase_date 
    and u.purchase_date <= p.end_date
group by p.product_id;

# Write your MySQL query statement below
SELECT
        ROUND(
            SUM(
                CASE WHEN 
                d.order_date = d.customer_pref_delivery_date
                THEN 1 ELSE 0 END)*100/COUNT(*)
            ,2) AS immediate_percentage
FROM Delivery d
JOIN
 (select customer_id, 
            MIN(order_date) as first_date from Delivery group by customer_id) first_order
ON d.customer_id = first_order.customer_id
AND d.order_date = first_order.first_date;

SELECT  s.product_id , s.year as first_year, s.quantity , s.price 
from Sales s
where (s.product_id,s.year) IN(
    SELECT  product_id , MIN(year)
    from Sales
    group by product_id
)
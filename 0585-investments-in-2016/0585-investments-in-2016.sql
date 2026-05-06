SELECT ROUND(SUM(tiv_2016),2) AS tiv_2016
FROM Insurance
WHERE tiv_2015 IN(
    SELECT tiv_2015
    from Insurance
    Group by tiv_2015
    Having count(*)>1
)
AND
(lat,lon) IN(
    Select lat,lon
    from Insurance 
    GROUP BY lat , lon
    HAVING COUNT(*) = 1
)
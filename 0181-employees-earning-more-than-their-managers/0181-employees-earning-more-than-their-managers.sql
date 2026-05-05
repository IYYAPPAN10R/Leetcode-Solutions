# Write your MySQL query statement below
SELECT A.name AS Employee
FROM Employee A
WHERE A.salary > (select B.salary from Employee B where A.managerId = B.id)
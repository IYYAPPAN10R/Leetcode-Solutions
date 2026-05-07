SELECT D.name AS Department , E.name AS Employee , E.salary AS Salary
FROM Employee E JOIN Department D
ON E.departmentId = D.id
Where E.salary = (
    Select MAX(salary)
    From Employee
    Where departmentId = E.departmentID
)
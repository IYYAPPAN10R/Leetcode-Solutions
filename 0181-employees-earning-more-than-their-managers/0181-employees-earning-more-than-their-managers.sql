select E.name as Employee
from Employee as E
where E.salary > (
    select a.salary from Employee as a
    where E.managerId = a.id
)

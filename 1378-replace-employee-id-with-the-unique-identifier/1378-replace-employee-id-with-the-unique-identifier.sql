select E.unique_id , A.name 
from Employees as A
left join EmployeeUNI as E
on E.id  = A.id;
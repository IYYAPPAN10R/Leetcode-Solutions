select project_id , ROUND(AVG(experience_years),2) as average_years from Employee E join Project P on E.employee_id = p.employee_id
group by project_id 
# Write your MySQL query statement below
select u.unique_id as unique_id, e.name as name
from employees as e
left join employeeUNI as u
on e.id = u.id;
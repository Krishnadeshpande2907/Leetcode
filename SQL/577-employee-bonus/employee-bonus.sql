# Write your MySQL query statement below
SELECT e.name, b.bonus
FROM employee as e
LEFT JOIN bonus as b
on e.empID = b.empID
WHERE b.bonus < 1000 or b.bonus is null
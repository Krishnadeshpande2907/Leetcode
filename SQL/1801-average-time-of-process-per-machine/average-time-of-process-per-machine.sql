# Write your MySQL query statement below
select act1.machine_id, Round(avg(act2.timestamp - act1.timestamp), 3) as processing_time
from activity as act1
join activity as act2
on act1.process_id = act2.process_id
and act1.machine_id = act2.machine_id
and act1.timestamp<act2.timestamp
group by act1.machine_id;
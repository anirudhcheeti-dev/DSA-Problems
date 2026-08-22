# Write your MySQL query statement below
select s.user_id,round(ifnull (avg(c.action='confirmed'),0),2) as confirmation_rate
# if null is used to consider the null values as 0 
#here avg directly checks for any values which are confirmenf and also for timeout values and does avg
from Signups as s
left join Confirmations as c on s.user_id=c.user_id
group by s.user_id;
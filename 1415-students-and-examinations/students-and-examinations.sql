# Write your MySQL query statement below
select s.student_id,s.student_name,sub.subject_name,count(e.student_id) as attended_exams
#we cound e.student id because there are children who might have not given an exam 
from Students as s
cross join Subjects as sub 
# cross join used to connect every student to every subject
left join Examinations as e on s.student_id=e.student_id and sub.subject_name=e.subject_name
# left join used to consider even the possibility of 0 exams 
group by s.student_id,s.student_name,sub.subject_name
order by s.student_id , sub.subject_name;
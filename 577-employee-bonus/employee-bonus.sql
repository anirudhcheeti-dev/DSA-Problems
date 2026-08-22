# Write your MySQL query statement below
select E.name,B.bonus from Employee as E
left join bonus as B on E.empId=B.empId
where bonus<1000 or bonus is null;
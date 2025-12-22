# Write your MySQL query statement below

select a.firstName, a.lastName, b.city, b.state 
 from Person a 
 left join Address b on a.personId = b.personId;
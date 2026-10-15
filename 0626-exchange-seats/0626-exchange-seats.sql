# Write your MySQL query statement below
Select 
 case
  when id % 2 = 1 And id<(Select MAX(id) from seat)
    then id+1
  when id % 2 = 0
    then id-1
 ELSE id
 END as id, student
 from seat
 order by id; 
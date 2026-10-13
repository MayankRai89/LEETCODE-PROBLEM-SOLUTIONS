# Write your MySQL query statement below
select max(num) 
 as num
  from (Select num 
   FROM MyNumbers
   GROUP By num
   having Count(*) = 1
   ) AS single_numbers;
# Write your MySQL query statement below
SELECT
    user_id,
 COUNT(follower_id) AS followers_count
FROM Followers
group by user_id
order by user_id ASC;
 
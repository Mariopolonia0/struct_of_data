--New York Restaurants
--We have put together a table of restaurants 
--called nomnom and we need your help to answer some questions.
--Use the SQL commands you just learned and find the best dinner spots in the city.
--The schema of this table is available here.
--Let’s begin!

--If you get stuck during this project or would like to see an
--experienced developer work through it, click “Get Unstuck“ 
--to see a project walkthrough video.

--Start by getting a feel for the nomnom table:
select * from nomnom 

--What are the distinct neighborhoods?
SELECT DISTINCT neighborhood
FROM nomnom;

--What are the distinct cuisine types?
select distinct cuisine 
from nomnom;


--Suppose we would like some Chinese takeout.
--What are our options?
select * from nomnom
where cuisine = 'Chinese';

--Return all the restaurants with reviews of 4 and above.
select * from nomnom
where review >= 4;

--Suppose Abbi and Ilana want to have a fancy dinner date.
--Return all the restaurants that are Italian and $$$.
select * from nomnom
where cuisine  = 'Italian' and price = '$$$';

--Your coworker Trey can’t remember the exact name of a restaurant he
--went to but he knows it contains the word ‘meatball’ in it.
--Can you find it for him using a query?
SELECT * FROM nomnom
WHERE name LIKE '%meatball%';


--Let’s order delivery to the house!
--Find all the close by spots in Midtown, Downtown or Chinatown.
--(OR can be used more than once)
select * from nomnom
where neighborhood = 'Midtown' 
   or neighborhood = 'Downtown'
   or neighborhood = 'Chinatown'

--Find all the health grade pending restaurants (empty values).
select * from nomnom
where health  is null

--Create a Top 10 Restaurants Ranking based on reviews.
select * from nomnom 
order by review desc limit 10

--Use a CASE statement to change the rating system to:
--review > 4.5 is Extraordinary
--review > 4 is Excellent
--review > 3 is Good
--review > 2 is Fair
--Everything else is Poor
--Don’t forget to rename the new column!
SELECT name,
 CASE
  WHEN review > 4.5 THEN 'Extraordinary'
  WHEN review > 4 THEN 'Excellent'
  WHEN review > 3 THEN 'Good'
  WHEN review > 2 THEN 'Fair'
  ELSE 'Poor'
 END AS 'Review'
FROM nomnom;

# Write your MySQL query statement below
select 'Low Salary' as category,count(if(income<20000,1,null)) as accounts_count
from Accounts
Union All
select 'Average Salary' , count(if(income >= 20000 and income<=50000,1,null)) from Accounts
Union All
select 'High Salary', count(if(income>50000,1,null)) from Accounts;
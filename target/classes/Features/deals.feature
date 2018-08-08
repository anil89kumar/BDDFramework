Feature: Deal data creation

Scenario: Free CRM Create a new deals scenario

Given user is already at Login Page
When title of login page is Free CRM
#using data driven thing so we won't user angular brackets
Then user enters username and password
|naveenk | test@123 |
Then user clicks on Login button
Then user is on Home Page 
Then user moves to new deal page
Then user enters deal details title and amount and probability and commission
| test deal | 1000 | 50 | 10 |
| test deal2 | 2000| 80 | 20 |
Then close the browser
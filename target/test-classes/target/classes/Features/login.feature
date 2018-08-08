Feature: Free CRM Login Feature


#(Without Examples Keyword)
#Scenario: Free CRM Login Test Scenario
#
#Given user is already at Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on Login button
#Then user is on Home Page 
#Then close the browser


#(With Examples Keyword)
Scenario Outline: Free CRM Login Test Scenario

Given user is already at Login Page
When title of login page is Free CRM
#below step is parametrized with angular brackets
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on Home Page 
Then close the browser


#we can create different sets of data here
Examples:
        | username | password |
        | naveenk  | test@123 |
        | tom      | test456  |  

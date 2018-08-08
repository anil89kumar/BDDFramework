Feature: Free CRM Create Contacts


Scenario Outline: Free CRM Create a New Contact Scenario

Given user is already at Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on Home Page 
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser


#we can create different sets of data here
Examples:
        | username | password | firstname | lastname  | position |
        | naveenk  | test@123 | Santosh   | Jigajini  | Manager  |
        | naveenk  | test@123 | Santosh1  | Jigajini1 | Director |

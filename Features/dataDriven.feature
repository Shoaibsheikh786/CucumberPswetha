Feature: Login with multiple data
Scenario Outline: verify that user is not able to login with invalid credent
Given user open edge 
When user enter this url "facebook.com"
And user enter username as <username>
And user enters password as <password>
Then user will be on login page only 
Examples:
|username|password|
|"abc1"|"pass1"|
|"abc2"|"xkdkd"|
|"abc33"|"kdkjd"|



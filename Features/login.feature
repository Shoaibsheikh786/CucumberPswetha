Feature: Login feature 

Scenario: Verify the login with valid credentials
Given open chrome
When user enters url "https://www.youtube.com" 
When user enters username abc@gmail.com
When user enters password abc@aapas
When user clicks on login 
Then user is redirected to logout page
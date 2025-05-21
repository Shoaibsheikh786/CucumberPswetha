Feature: mynewFeature2

Background:
Given user opens firefox
When user enters to this url "abc.com"

@regression
Scenario: verify that user is able to click on search button
Then use is redirected to the login page

@smoke
Scenario: verify that user is able to click on search button
Then use is redirected to the logout page

Scenario: verify that user is able to click on search button
Then use is redirected to the abc page

Scenario: verify that user is able to click on search button
Then use is redirected to the xyz page
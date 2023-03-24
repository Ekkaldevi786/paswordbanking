Feature: Test Login Functionality of Facebook

Scenario: Test Valid Login Cretdntial

Given user is on Facebook page
When user enters Username
And user enters Passord
And user click on login button
Then user should be navigate to HomePage
Feature: Test Login Functionality of Facebook


Background:
Scenario: Test Valid Login FB Cretdntial
Given user is on FB page
When user enters FB Username
And user enters FB Passord
And user click on FB login button
Then user should be navigate to FB HomePage


Scenario: Check The Marketplace Functionality
Given User should be on Marketplace page
When User click on Marketplace button
And User search the Car
Then User should be on car page
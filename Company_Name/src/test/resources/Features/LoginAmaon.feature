Feature: Test Login Functionality of orangeHRM

Scenario: Test Valid Login Cretdntial

Given user is on Amazon page
When user click on account section
And user click on signin button
When user enters username and password
And click on login button
Then user should land on Home page
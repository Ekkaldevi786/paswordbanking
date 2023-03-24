Feature: orange HRM Login Functionality

Scenario Outline: Test Orange HRM Login Functionality With Different Creadential
Given user is on orangeHRM Login page
When user enters orangeHRM Login use "<Username>"
And user enters orangeHRM Login pwd "<Password>"
And user click on orangeHRM login button
Then user should be navigate to orangeHRM Login HomePage

Examples:
|Username|Password|
|admin|admin123|
|admin1|admin1234|

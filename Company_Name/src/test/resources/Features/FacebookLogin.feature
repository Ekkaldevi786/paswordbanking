Feature: Facebook Login Feature

Scenario Outline: Test Login Functionality With Different Creadential
Given user is on Facebook Lgin page
When user enters Facebook Login "<Username>"
And user enters Facebook Login pwd "<Password>"
And user click on Facebook login button
Then user should be navigate to Facebbok Login HomePage

Examples:
|Username|Password|
|purushottamekkaldevi@rediffmail.com|Uttam@123|
|ekkaldevinikita@gmail.com|Nikita@123|
|Shard@gmail.com|Shard|

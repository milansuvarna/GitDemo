Feature: Login to Burrp

Scenario: Positive Test Validating Login
Given Initialize the browser with chrome
And Navigate to "https://www.burrp.com" site
And Click on SignIn link to Open Signin Window
And Click on Google Sign Option
When User enters "milan.suvarna@burrp.com" password "aditya1987" click on Login
Then Verify that user is successfully logged in

Scenario: Negative Test Validating Login
Given Initialize the browser with chrome
And Navigate to "https://www.burrp.com" site
And Click on SignIn link to Open Signin Window
And Click on Google Sign Option
When User enters "milan.suvarna@burrp.com" password "test" click on Login
Then Verify that Login is Failed





Feature: login page
Scenario: user login with valid credintials

Given user navigates to open browser "https://practicetestautomation.com/practice-test-login/"
When user enter the valid username "student"
And valid passwod "Password123"
Then user should get home page with login 
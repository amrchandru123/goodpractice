Feature: entry field

Scenario: user able to registor with valid information

Given user open the browser
When user enter the url "https://demoqa.com/text-box"
And valid name "chandru" and password "12345678"
Then user should get home page

And browser should close

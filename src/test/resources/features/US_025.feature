 @US_025
Feature: A test of access to the Agileswiftcargo homepage
  @TC_2501
Scenario:A test of access to the Agileswiftcargo homepage
    Given  Enters the "homepageUrl"
    Then Verifies access to homepage
    Then Verifies homepage load successfully
    Then Verifies that there is a "Login" button in the header section of the page
    Then Clicks of the "Login" button
    And When the login button is clicked, it tests that you are directed to the "loginpageUrl" page
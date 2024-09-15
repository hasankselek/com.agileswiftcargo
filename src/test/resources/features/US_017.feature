@login
Feature: As a merchant, I would like to have an administration panel available to perform administrative tasks and log in to the administration panel with the registered email or phone number and password.

  @log1
  Scenario: TC_1701




  @log5
  Scenario: TC_1705 Successful login test with correct informations

    Given Enters the "loginpageUrl"
    Then Enters row 2 in Email Address textbox
    Then Enters row 2 in Password textbox
    And  Clicks Sign In button
    Then Verifies Merchant Dashboard page opens







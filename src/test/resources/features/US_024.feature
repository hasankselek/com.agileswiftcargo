@US_024
Feature: As a merchant, I want to view my invoices.

  @TC_2401
  Scenario: Invoice Menu Visibility and and access test

    Given Go to page "homepageUrl"
    Then Clicks the login button
    Then Enters row 7 in Email Address textbox
    Then Enters row 7 in Password textbox
    Then Clicks Sign In button
    Then Clicks Accounts menu on left side
    Then Verify that the Invoice link under Accounts is visible and clickable.
    Then Clicks Invoice section under Accounts
    Then Verify invoice list is displayed


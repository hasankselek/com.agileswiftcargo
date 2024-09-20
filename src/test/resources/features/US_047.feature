
  Feature: As a user, I want to check the status of the cargo using the 'Track Now' field.

    Background: Common steps
      Given Enters the "loginpageUrl"
      Then Enters row 4 in Email
      Then Enters row 4 in Password
      Then Clicks Sign In button
      And Click on the Accounts button

    @TC_4701
    Scenario:Fund Transfer list visibility test
      Given Tests that the Fund Transfer tab is visible in the drop-down menu
      @TC_4702
      Scenario: Test of filtering using Date, From Account, and To Account fields

        Given In the menu that opens, click on the Fund Transfer tab
      And Filtering is done by filling in the relevant fields on the page
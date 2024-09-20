

  Feature: As an administrator, I want to view, update, add and delete information on the 'Accounts' page.
    Background: Common steps
      Given Enters the "loginpageUrl"
      Then Enters row 4 in Email
      Then Enters row 4 in Password
      Then Clicks Sign In button
      And Click on the Accounts button

    @TC_4601
    Scenario:Account Heads list visibility test

      Given Tests that the "Account Heads" list is visible in the drop-down menu

      @TC_4602
      Scenario: Account list visibility test
        Given Accconts Heads link is cklickabale
        @TC_4603
        Scenario: Filter should be done with Holder Name, Account No and Bank Name
          Given Accconts Heads link is cklickabale
         Then After filtration, the search results are seen

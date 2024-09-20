@US_050
Feature:As an administrator, I want to view, update, add and delete information on the 'Salary Generate' page.

  Background:Common Steps
   Given Enters the "loginpageUrl"
   And Enters row 8 in Email
   And Enters row 8 in Password
   And Clicks Sign In button
   And Click on the Payroll link in the left menu.
   And Click on the Salary Generate link in the left menu.

  Scenario:Salary Generate' list should be visible.
    And  Verify Salary Generate button directed to Salary Generate
    When Verify visibility and activity of Salary Generate List

  Scenario: A salary list should be created with the Auto Generate link on the right of the Salary Generate list.
    Then Verify Auto Generate link is not visible and clickable

  Scenario: Salary should be created using the Add link to the right of the Salary Generate list.
    Then Verify Add link is not visible and clickable

  Scenario: Salary information should be updated using the Actions menu in the Salary Generate list
    Then Verify Actions link is not visible and clickable

  Scenario: Salary information should be deleted using the Actions menu in the Salary Generate list
    Then Verify Delete link is not visible and clickable

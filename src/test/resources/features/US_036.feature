@branchs
Feature:As an administrator, I want to access, update, add and delete 'Branch' information on the 'Branch Manage' page.


  Background: Common Steps

    Given Enters the "loginpageUrl"
    Then  Enters row 2 in Email
    Then  Enters row 2 in Password
    Then  Clicks Sign In button
    Then  Opens branch page

  @br1
  Scenario Outline: TC_3601 Filter and clear button visibility and functionality test

    And  Verifies filter button visibility
    Then Verifies clear button visibility
    And  Enters "<hubs>" search box
    Then Verifies filter works
    And  Clicks " Clear" button
    And  Verifies filter cleaned
    Examples:
      | hubs |
      |New York City|
      |Orlando |


  @br2
  Scenario: TC_3602 Redirection test to 'Create Branch' page

    Then Verifies plus sign to the right of the branch list
    Then Clicks plus sign
    And  Verifies Create Branch page opens


  @br3
  Scenario: TC_3603 Branch actions visibility and functionality test

  Then Clicks actions dropdown menu
  Then Verifies " View" option displayed
  Then Verifies that the View option redirects to the relevant page
  Then Returns to branch page
  Then Clicks actions dropdown menu
  Then Verifies " Edit" option displayed
  Then Verifies that the Edit option redirects to the relevant page
  Then Returns to branch page
  Then Clicks actions dropdown menu
  Then Verifies " Mange In-Charge" option displayed
  Then Verifies that the Mange In-Charge option redirects to the relevant page
  Then Returns to branch page
  Then Clicks actions dropdown menu
  And  Verifies " Delete" option displayed
  And  Verifies delete the branch







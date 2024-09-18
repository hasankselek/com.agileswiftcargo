Feature:As an administrator, I want to access, update, add and delete 'Merchant' information on the 'Merchant Manage' page.

  Background: Common Steps

    Given Enters the "loginpageUrl"
    And Enters row 1 in Email
    And Enters row 1 in Password
    And Clicks Sign In button

  @TC_3801
  Scenario:Merchant Manage/Merchants Search Box Tests

    And Click on the "Merchant Manage" link in the left menu.
    And Click on the "Merchants" link in the left menu.
    Then Verifies that the search box is visible
    Then Verifies that the search box is functional
    And Inputs "Hasan Kucukselek" data to the search box
    Then Verifies that the correct data is displayed













Feature:As an administrator, I want to access, update, add and delete 'Merchant' information on the 'Merchant Manage' page.

  Background: Common Steps

    Given Enters the "loginpageUrl"
    And Enters row 1 in Email
    And Enters row 1 in Password
    Then Clicks the login button

  Scenario:Merchant Manage/Merchants Search Box Tests

    And Click on "Merchant Manage"
    And Click on "Merchant"
    Then Verifies that the search box is displayed









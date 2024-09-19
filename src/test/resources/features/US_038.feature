@US_038
Feature:As an administrator, I want to access, update, add and delete 'Merchant' information on the 'Merchant Manage' page.

  Background: Common Steps

    Given Enters the "loginpageUrl"
    And Enters row 1 in Email
    And Enters row 1 in Password
    And Clicks Sign In button
    And Click on the "Merchant Manage" link in the left menu.
    And Click on the "Merchants" link in the left menu.

  @TC_3801
  Scenario:Merchant Manage/Merchants Search Box Tests

    Then Verifies that the search box is visible
    Then Verifies that the search box is functional
    And Inputs "Hasan Kucukselek" data to the search box
    Then Verifies that the correct data is displayed

  @TC_3802
  Scenario:Merchant List Visibility Tests

    Then Verifies that merchant list is visible


  @TC_3803
  Scenario: + Button Functionality Testing

    Then Verifies that + Button is visible and functional
    And Click on the + Button
    Then Verifies that the Create Merchant page has been opened

  @TC_3804
  Scenario:Actions Dropdown Visibility Test

    And Clicks on the Actions button
    Then Verifies View,Edit and Delete buttons are visible

  @TC_3805
  Scenario:User information update test with correct information

    And Clicks on the Actions button
    Then Clicks on the Edit button
    And Fills in the "HSNKCKSLK" "Hasan Kucukselek" "09123123123123" "Orlando" "Active" "Orlando/USA" requested information
    And Clicks on the Save Change button
    Then Verifies that all changes have been successfully saved


  @TC_3806
  Scenario:User information update test with empty information

    And Clicks on the Actions button
    Then Clicks on the Edit button
    And Fills in the " " " " " " "Los Angeles" "Inactive" " " requested information
    And Clicks on the Save Change button
    Then Verifies that the error messages is displayed


  @TC_3807
  Scenario:User information update test with incorrect information

    And Clicks on the Actions button
    Then Clicks on the Edit button
    And Fills in the "HKS" "Hasan Kucukselek" "1231" "Orlando" "Active" "Orlando/USA" requested information
    And Clicks on the Save Change button
    Then Verifies that the wrong phone number error messages is displayed

  @TC_3808
  Scenario:User information update test with empty information

    And Clicks on the Actions button
    Then Clicks on the Delete button
    And Clicks of the "Yes" button
    Then Verifies that all changes have been successfully saved



















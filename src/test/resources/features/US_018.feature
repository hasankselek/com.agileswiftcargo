@US_018
Feature:As a merchant, I want to view and update my profile information.

  Background: Common Steps

    Given Enters the "loginpageUrl"
    Then Enters row 1 in Email Address textbox
    Then Enters row 1 in Password textbox
    And  Clicks Sign In button
    And Click profile icon

  @TC_1801
  Scenario:Verify ‘Profile, Payment Information, Change password, Logout’ links test

    Then Verifies "Profile" "Payment Information" "Change password" "Logout" links are displayed


  @TC_1802
  Scenario: Account information visibility test

    And Clicks "Profile" button
    Then Verifies that user "hasan kucukselek" "hasan.merchant@agileswiftcargo.com" "75396548963" "hasan kucukselek" "New York City" information is displayed

  @TC_1803 @positive
  Scenario Outline: Edit Account Correct information test

    And Clicks "Profile" button
    Then Clicks " Edit" button
    Then Verifies that user name, address and profile photo are displayed
    Then The user confirms that they can change their "<name>", "<adress>" and "<image>"
    And Clicks Save Change button
    Then Verifies that all changes have been successfully saved

    Examples:
      | name             | adress        | image  |
      | Hasan Kselek     | Izmir         | image1 |
      | Hasan Kucukselek | New York City | image2 |







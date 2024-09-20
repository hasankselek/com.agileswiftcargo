@US_037
Feature:  As an administrator I would like to access,update, add and delete 'Payment' informationen the 'Branch Manage' page.

  Background: Common Steps
    Given Enters the "homepageUrl"
    And  Clicks the login button
    And Click the Login button as administrator and enter the system

  @TC_3701
  Scenario:Branch Payment List' list is visible
    And Click on Branch Manage
    And Click on the Payments Icon
    And Test the visibility of the Branch Payment list

  @TC_3702
  Scenario: The plus (+) sign in the list to the right of the
  Payment list must be visible and functional.
    And Click on Branch Manage
    And Click on the Payments Icon
    And Test the visibility of the + sign in the upper right corner of the list
    And Click on the Plus button
    And test the visibility of the Create Payment page

  @TC_3703
  Scenario: Links in the action menu of the Payment list are visible and functional
    And Click on Branch Manage
    And Click on the Payments Icon
    And Test the visibility of the Actions Icon
    And Click on the ActionsMenu Button
    And Clicks on the Actions button
    And test the visibility of links in the menu





@US_033
Feature: As an administrator, I want to update my password.

  Background: Common Steps
    Given Enters the "homepageUrl"
    And  Clicks the login button
    Then  Enters row 9 in Email
    And Enters row 9 in Password
    And Clicks Sign In Button Admin

  @TC_3301
  Scenario: Clicking on the profile icon in the top bar of the admin panel
  opens a window with links to 'Profile', 'Change Password' and 'Logout'
    Then  visibility of the Profile icon in the box that appears
    And Click the Profile button
    And  visibility of the icon of the Change password link
    And  visibility of the Logout icon

  @TC_3302
  Scenario: when the 'Change Password' link is clicked, a page with 'Old Password', 'New Password', 'Confirm Password' text boxes
  and a 'Save Change' button is opened, these are visible and functional
    Given  Click the Profile button
    Given Click on the icon of the Change password link
    And visibility of the Old Password box on the opened page
    And visibility of the New Password box
    And visibility of the Confirm Password box
    And visibility of the Save Change button

  @TC_3303
  Scenario: On the 'Change Password' page, the password registered in the system can be entered in the 'Old Password' text box,
  the new password can be entered in the 'New Password' text box, and
  the new password can be re-entered in the 'Confirm Password' text box
    Given  Click the Profile button
    Given Click on the icon of the Change password link
    Given On the Change Password page, enter the password registered in the system in the Old password box
    And   Enter a new password in the New Password box
    And   Enter the new password in the Confirm Password box
    Then Test that passwords are entered correctly

  @TC_3304
  Scenario: Verifying that the password has changed when the 'Save Change' button is clicked
    Given  Click the Profile button
    Given Click on the icon of the Change password link
    Given On the Change Password page, enter the password registered in the system in the Old password box
    And   Enter a new password in the New Password box
    And   Enter the new password in the Confirm Password box
    Given  Click on the Save Change
    Then   test whether the old password and the new password have changed
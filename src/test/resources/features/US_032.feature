Feature: As an administrator, I want to access and update my profile information.

  @TC_3201
  Scenario: Admin profile icon should be clickable and the profile should be updatable.
    Given Go to page "homepageUrl"
    Then Clicks the login button
    Then Enters row 7 in Email
    Then Enters row 7 in Password
    Then Clicks Sign In Button Admin
    Then Click the Profile button
    Then visibility of the Profile icon in the box that appears
    Then Click profile under profile icon
    Then Validate Name, salary, role, department information is visible
    Then Verify Admin Profile Edit button is visible
    Then Click Admin profile Edit button
    Then Edit Name as "TestName" and click Save Change
    Then Verify Success Message
    Then Click Admin profile Edit button
    Then Edit Name as "Emrah" and click Save Change
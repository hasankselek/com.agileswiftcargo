@US_031
Feature:As an administrator, I want an admin panel to be available to perform administrative tasks and
        to be able to log in to the admin panel with registered email and password
    Background: Common Steps
      Given Enters the "homepageUrl"
      And  Clicks the login button
  @TC_3101
  Scenario:Redirect to homepage when the logo is clicked
    Then Click on the logo
    Then User is redirected to the homepage

  @TC_3102
Scenario: Visibility and functionality of email, password fields, and sign in button
    Then Enters row 9 in Email
    And Enters row 9 in Password
    And Clicks Sign In button
    Then Verifies Admin Dashboard page opens

  @TC_3103
  Scenario:Visibility and Functionality Test of the Sing Up here link and icons on the page

    Given Click on Sign Up Here Icon
    Then  Verifies Business Name, Full Name,Select Hub, Mobile, Password, Address
    Then Verifies Business Name, Full Name, Mobile, Password, Address able to enter
    Then Click on the Business Name and enter the info
    And Click on the Full Name and enter the info
    And Click on Select Hub and enter the info
    And Click on the Mobile box and enter the info
    And Click on the Password box and enter the info
    And Click on the Address box and enter the info
    And Clicks Privacy Policy & Terms.
    And Clicks Register Account button




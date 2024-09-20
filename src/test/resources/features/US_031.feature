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
    Scenario: Verification that there is a 'Facebook' button and when
              clicked it redirects to the Facebook page
    #this test runned by manual
    And Als Admin,Verifies "Facebook" button is visible and redirect to "Facebook".
  @TC_3104
    Scenario:Google button and redirecting to Google page when clicked
    And Als Admin,Verifies "Google" button is visible and redirect to "Google".


  @TC_3105
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
    @TC_3106
    Scenario: Clicking on the 'Forgot Password' link opens a page with an 'Email Address' text box
              and a 'Send Password Reset Link' button, and these are visible and functional
      And test the visibility of the Forgot Password icon on the opened page
      And Click on the Forgot Password icon
      And test the visibility of the Email Address text box
      And Test the visibility of the `Send Password Reset Link` Icon
      And enter a new Email Address and click on the link

@TC_3107
      Scenario: verifying that an email was sent to the entered email address
      And Click on the Forgot Password icon
      And enter a new Email Address and click on the link
      And Test that Verifies email has been sent to the entered email address
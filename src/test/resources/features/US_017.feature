@login
Feature: As a merchant, I would like to have an administration panel available to perform administrative tasks and log in to the administration panel with the registered email or phone number and password.

  @log1
  Scenario: TC_1701 Login form visibility and functionality test

    Given Enters the "loginpageUrl"
    Then Verifies logo visibility
    Then Clicks the logo and verifies redirect to homepage
    And  Returns to login page
    Then Verifies Enter Email or Mobile, Password text boxes and Sign In button visibility and functionality

  @log2
  Scenario: TC_1702 Social Media icons visibility and redirection test
    #this test runned by manual

    Given Enters the "loginpageUrl"
    Then  Verifies "Facebook" button is visible and redirect to "Facebook".
    And   Verifies "Google" button is visible and redirect to "Google".


  @log3
  Scenario: TC_1703 Redirection test  to 'Registration Form' page

    Given Enters the "loginpageUrl"
    Then  Clicks "Sign up here" link
    Then  Verifies Business Name, Full Name, Mobile, Password, Address box visibility
    Then  Verifies Select Hub dropdown visibilty
    And   Verifies Register My Account button visibilty


  @log4
  Scenario: TC_1704 'Forgot Password ' link redirection test

    Given Enters the "loginpageUrl"
    And  Verifies Forgot Password link visiblity
    Then Clicks "Forgot Password" link
    Then  Verifies  Email Address textbox and Send Password Reset Link visibilty
    Then  Enters "existingEmail" in Email Address textbox
    And   Clicks "Send Password Reset Link" link
    Then  Verifies email has been sent to the entered email address


  @log5
  Scenario: TC_1705 Successful login test with correct informations

    Given Enters the "loginpageUrl"
    Then Enters row 2 in Email Address textbox
    Then Enters row 2 in Password textbox
    And  Clicks Sign In button
    Then Verifies Merchant Dashboard page opens


  @log6
  Scenario: TC_1706 Unsuccessful login test with wrong email

    Given Enters the "loginpageUrl"
    Then Enters row 10 in Email Address textbox
    Then Enters row 2 in Password textbox
    And  Clicks Sign In button
    Then Verifies Merchant Dashboard page can't opens

  @log7
  Scenario: TC_1707 Unsuccessful login test with wrong password

    Given Enters the "loginpageUrl"
    Then Enters row 2 in Email Address textbox
    Then Enters row 10 in Password textbox
    And  Clicks Sign In button
    Then Verifies Merchant Dashboard page can't opens








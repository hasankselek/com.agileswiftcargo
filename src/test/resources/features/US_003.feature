@register
Feature: As a user, I want to be able to register on the page in order to perform faster transactions on the site and access more features.

  @reg1
  Scenario: TC_0301 'Register' button visibility and functionality test

    Given Enters the "homepageUrl"
    Then  Verifies register button is displayed
    Then  Clicks register button and verifies register page opens


  @reg2
  Scenario: TC_0302 'Registrations form' visibility and functionality test

    Given Enters the "homepageUrl"
    Then Clicks register button
    Then Verifies Business Name, Full Name, Mobile, Password, Address box visibility
    Then Verifies Business Name, Full Name, Mobile, Password, Address box able to entering
    Then Verifies I agree to Agile Swift Cargo Privacy Policy & Terms checkbox visibilty
    Then Verifies I agree to Agile Swift Cargo Privacy Policy & Terms  text redirect to Privacy Policy & Terms page


  @reg3
  Scenario: TC_0303 Successful registration test

    Given Enters the "homepageUrl"
    Then Clicks register button
    Then Enters into Business Name box
    Then Enters into Full Name box
    And  Selects hub
    And  Enters into Mobile box
    Then Enters into Password box
    Then Enters into Address box
    When Clicks Privacy Policy & Terms. checkbox
    Then Clicks Register My Account button
    And  Verifies login page opens


  @reg4
  Scenario: TC_0304 Unsuccessful registration test

    Given Enters the "homepageUrl"
    Then Clicks register button
    Then Enters into Business Name box
    Then Enters into Full Name box
    And  Selects hub
    And  Enters into Mobile box
    Then Enters wrong format password into Password box
    Then Enters into Address box
    When Clicks Privacy Policy & Terms. checkbox
    Then Clicks Register My Account button
    And  Verifies warning message visiblty






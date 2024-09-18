@US_025
Feature: A test of access to the Agileswiftcargo homepage
  @TC_2501
  Scenario:A test of access to the Agileswiftcargo homepage
    Given  Enters the "homepageUrl"
    Then Verifies access to homepage
    Then Verifies homepage load successfully
    Then Verifies that there is a "Login" button in the header section of the page
    Then Clicks of the "Login" button
    And When the login button is clicked, it tests that you are directed to the "loginpageUrl" page
  @TC_2502
  Scenario: User logs in and validates input fields
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then When the login button is clicked, it tests that you are directed to the "loginpageUrl" page
    And the user should see the message "Please enter your user information."
  @TC_2503
  Scenario: User logs in and validates input fields
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then When the login button is clicked, it tests that you are directed to the "loginpageUrl" page
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    Then Verifies Merchant Dashboard page opens
  @TC_2504
  Scenario: User logs in and navigates to the Parcels page
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then When the login button is clicked, it tests that you are directed to the "loginpageUrl" page
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    Then Verifies Merchant Dashboard page opens
    And the "Parcels" link should be visible in the dashboard menu
    When the user clicks on the "Parcels" link
    Then the opened page should be the "Parcels" page
  @TC_2505
  Scenario: User logs in and navigates to the Parcels page
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then When the login button is clicked, it tests that you are directed to the "loginpageUrl" page
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    Then Verifies Merchant Dashboard page opens
    And the "Parcels" link should be visible in the dashboard menu
    When the user clicks on the "Parcels" link
    Then the opened page should be the "Parcels" page
    And the parcels List should be visible on the opened page
  @TC_2506
  Scenario Outline: User logs in and filters customer data on the Parcels page
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    And the text boxes in the filter section should be clickable and editable
    When the user enters the date "<Enter Date>" and customer name "<Customer Name>" in the filter inputs
    And the user applies the filter
    Examples:
      |Enter Date | Customer Name|
      |17/09/2024 |Sultan        |
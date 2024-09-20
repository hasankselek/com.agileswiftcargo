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
    @TC_2507
  Scenario: User logs in and validates the Parcels page
      Given Enters the "homepageUrl"
      When Clicks of the "Login" button
      Then Enters row 4 in Email Address textbox
      Then Enters row 4 in Password textbox
      Then Clicks Sign In button
      And   the user clicks on the "Parcels" link
      Then the parcels table should be visible under the parcels heading
      And the "Excel" and "CSV" buttons should be visible on the parcels list
      And the "Excel" and "CSV" buttons should be functional
    @TC_2508
  Scenario: User logs in and navigates to Create Parcel page
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    And the user clicks on the "Add" button on the parcels page
    Then the user should be redirected to the Create Parcel page
  @TC_2509
  Scenario: User logs in, creates a parcel and verifies it in the parcels list
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    And the user clicks on the "Add" button on the parcels page
    Then Fill in the cargo creation form under the text Creat parcels
    Then the user clicks on the "Save" button
    @TC_2510
  Scenario: User logs in and imports parcels
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    And the user clicks on the "Import" button on the parcels page
    Then the user should be redirected to the import page
  @TC_2511
  Scenario: Checking visibility and functionality of the "Download Sample" button
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    And the user clicks on the Import button on the parcels page
    Then the "Download Sample" button should be visible
    And  the "Download Sample" button should be functional
  @TC_2512
  Scenario: Importing parcels using the "Import" button and validating the file
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    And the user clicks on the Import button on the parcels page
    And the user clicks the "Choose" File button to upload a file
    Then the user uploads a parcels import Excel file
    And the user verifies that the uploaded file contains the list of parcels
  @TC_2513
  Scenario: Checking if the "View" link is visible and functional for a parcel
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    When the user clicks the "°°°" button for a parcel
    Then the user should see the "View" link for a parcel
    And the "View" link should be functional
  @TC_2514
  Scenario: Viewing parcel logs and checking updates
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    When the user clicks the "°°°" button for a parcel
    And the user selects "Parcel Logs" from the menu
    Then the user should see the location and status updates of the parcel on the page
  @TC_2515
  Scenario: Cloning a parcel from the dashboard
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    When the user clicks the "°°°" button for a parcel
    And the user selects "Clone" from the menu
    Then the user should see a new copy of the parcel created
  @TC_2516
  Scenario: Editing a parcel from the dashboard
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    When the user clicks the "°°°" button for a parcel
    And the user selects "Edit" from the menu
    Then the "Edit" option should be functional
  @TC_2517
  Scenario: Deleting a parcel from the dashboard
    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 4 in Email Address textbox
    Then Enters row 4 in Password textbox
    Then Clicks Sign In button
    And   the user clicks on the "Parcels" link
    When the user clicks the "°°°" button for a parcel
    And the user selects "Delete"

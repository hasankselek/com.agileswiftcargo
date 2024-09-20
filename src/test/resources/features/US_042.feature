Feature: [US_042] As an administrator, I want to view, update, add and delete information on the 'Parcels' page.

  Scenario: [TC_4201] Parcels List Display

    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    And Verify that the table headers "###","Tracking ID", "Recipient Info", "Merchant", "Amount", "Status", "Status Update", "Payment" is displayed correctly.

  Scenario: [TC_4202] Parcels List Filter Functionality
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Enter a date "Yesterday" in the Date field.
    Then Select as "Delivered" status in the Status field.
    Then Enter a merchant name "Burhan Akyuz" in the Merchant field.
    Then Enter a delivery man name "Burhan Akyuz" in the Delivery Man field.
    Then Enter a pickup man name "Burhan Akyuz" in the Pickup Man field.
    Then Enter a invoice ID "1234567890" in the Invoice ID field.
    Then Click on the Filter button.
    And Verify that all filters should filter the list with correct results.


  Scenario: [TC_4203] Search Functionality
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Enter "Burhan Akyuz" in the Search field.
    Then Press the search button.
    And Verify that results should be displayed correctly based on the entered information.

  @abc
  Scenario: [TC_4204] View Parcel Details
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the ... menu.
    Then Select the "View" option.
    And Verify that parcel details should be displayed successfully.

  Scenario: [TC_4205] View Parcel Logs

    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the ... menu.
    Then Select the "Parcel Logs" option.
    And Verify that the "Parcel Logs" option redirects to the correct page

  @abc
  Scenario: [TC_4206] Clone Parcel
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the ... menu.
    Then Select the "Clone" option.
    Then Click on the 'Submit' button after editing.
    And Verify that a new parcel copy should be created with the same information.

  Scenario: [TC_4207] Print Parcel
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the ... menu.
    Then Select the "Print" option.
    And Verify that the "Print" option redirects to the correct page

  Scenario: [TC_4208] Print Label
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the ... menu.
    Then Select the "Print Label" option.
    And Verify that the "Print Label" option opens printing page

  Scenario: [TC_4209] Edit Parcel
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the ... menu.
    Then Select the "Edit" option.
    Then Click on the "Save Change" button after editing.
    And Verify that a new parcel copy should be created with the same information.

  Scenario: [TC_4210] Delete Parcel
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the ... menu.
    Then Select the "Delete" option.
    Then Confirm the deletion.
    And Verify that the parcel should be deleted successfully.








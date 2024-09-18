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

  @abc
  Scenario: [TC_4203] Search Functionality
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Enter "Burhan Akyuz" in the Search field.
    Then Press the search button.
    And Verify that results should be displayed correctly based on the entered information.

  Scenario: [TC_4204] View Parcel Details
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Parcels" link in the left menu.
    Then Click on the '###' menu.
    Then Select the 'View' option.
    And Verify that parcel details should be displayed successfully.
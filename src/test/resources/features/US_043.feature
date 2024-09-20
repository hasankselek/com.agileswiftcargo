@qwe
Feature: [US_043] As an administrator, I want to view, update, add and delete information on the 'Offers' page.

  Scenario: [TC_4301] Offers List Display
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Offers" link in the left menu.
    And Verify that the "Offers" page loads correctly by checking the page title and URL.


  Scenario: [TC_4302] Add New Offer
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Offers" link in the left menu.
    Then Click on the plus + icon located in the top right corner of the page.
    And Verify that the "Add Offers" page loads correctly by checking the page title and URL.
    # Then Fill in the new offer details.
    # Then Click the "Save" button.
    # And Verify that new offer is displayed successfully.


  Scenario: [TC_4303] Update Offer Details
    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Offers" link in the left menu.
    Then Click the Actions menu next to the offer you want to edit.
    Then Select "Edit" option.
    And Verify that the "Edit Offer" page loads correctly by checking the page title and URL.
    # Edit the offer details and save.
    # Verify that the offer is editted successfully

  Scenario: [TC_4304] Delete Offer

    Given Go to the "homepageUrl"
    Then Login as an admin
    Then Click on the "Offers" link in the left menu.
    Then Click the Actions menu next to the offer you want to edit.
    Then Select "Delete" option.
    # Then Confirm the deletion.
    # And Verify that the offer is editted successfully
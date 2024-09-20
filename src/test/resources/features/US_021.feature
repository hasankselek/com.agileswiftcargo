@US_021
Feature: As a merchant, I want to access, update, add and delete information on the ticket page.

  Background: Common Steps

    Given Enters the "loginpageUrl"
    Then Enters row 3 in Email Address textbox
    Then Enters row 3 in Password textbox
    Then  Clicks Sign In button
    Then Verifies Merchant Dashboard page opens
    Then Click on Ticket from the sidebar menu
    And On the page that opens, the text Ticket is verified

  @TC_2101
  Scenario: Test to access information on the ticket page as a merchant

    And Verifies registered tickets from the User Info section

  @TC_2102
  Scenario: Test to add a new ticket to the ticket page as a merchant

    Then Click on the + button at the top right
    Then The page is validated with the text Ticket Add
    Then Blank fields in the form are filled in
    Then Click on the Save button
    And The text Success confirms successful registration

  @TC_2103
  Scenario: Test to edit a ticket on the ticket page as a merchant

    Then Click on the dropdown button in the Action section
    Then Click on Edit
    Then The necessary information is organized
    Then Click on the Save Change button
    And The text Success confirms successful registration

  @TC_2104
  Scenario: Test to check a ticket on the ticket page as a merchant

    Then Click on the dropdown button in the Action section
    Then Click on View
    And The opened page is verified with the title text

  @TC_2105
  Scenario: Test of deleting a ticket on the ticket page as a merchant


    Then Click on the dropdown button in the Action section
    Then Click on Delete
    Then Click the Yes button from the alert that opens
    And The text Success confirms successful registration













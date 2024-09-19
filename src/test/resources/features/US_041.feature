@US_041
Feature: As an administrator, I want to view, update, add and delete information on the 'Ticket' page.

  Background: Common Steps

    Given Enters the "loginpageUrl"
    Then  Enters row 3 in Email
    Then  Enters row 3 in Password
    Then  Clicks Sign In button
    And Click on the "Ticket" link in the left menu.
    Then On the page that opens, the text "Ticket" is verified

  @TC_4101
  Scenario: Test to access information on the ticket page as an administrator

    Given Verifies registered tickets from the User Info section

  @TC_4102
  Scenario: Test to add a new ticket to the ticket page as an administrator

    Given Click on the + button at the top right
    Then The page is validated with the text Ticket Add
    Then Blank fields in the form are filled in
    Then Click on the save button to save the ticket.
    And The text Success confirms successful registration

  @TC_4103
  Scenario: Test to edit a ticket on the ticket page as an administrator

    Given Click on the edit button in the drop-down menu
    Then Click on Edit
    Then The necessary information is organized
    Then Click the Save Change button to save the edits.
    And The text Success confirms successful registration

    @TC_4104
    Scenario: Test to check a ticket on the ticket page as an administrator

      Given Click on the edit button in the drop-down menu
      Then Click on View
      And The page that opens is verified

      @TC_4105
      Scenario: Test of deleting a ticket on the ticket page as an administrator

        Given Click on the edit button in the drop-down menu
        Then Click on Delete
        Then Click the Yes button from the alert that opens
        And The text Success confirms successful registration



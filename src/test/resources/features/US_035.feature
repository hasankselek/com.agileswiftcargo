@US_035
Feature:[US_035]As an administrator, I want to access, update, add and delete information on the 'Delivery Man' page.

  Background: Common Step
    Given Go to the "loginpageUrl"
    When Login with admin

  Scenario:[TC_3501]Visibility of filter button in "Delivery Man" page and functionality by correct entered information.
    When Verify visibility and activity of filter button
    Then Verify enters for filter the used information shows in result

  Scenario:[TC_3502] Verifying nonfunctionality of filter button in Delivery Man page by enterd Correct information.
    When Click on the filter button.
    Then Enters for filter the unused information for parameters Name Email and phone and assert the search result contains 0

  Scenario:[TC_3503] Visibility and functionality of 'Clear' button on 'Delivery Man' page.
    When Verify visibility and activity of Clear button

  Scenario:[TC_3504]Visibility and functionality of Edit button in Delivery Man page .
    When Verify visibility and activity of edit button
    Then Click on the edit button
    And Verify Edit button directed to Edit Delivery Man


  Scenario:[TC_3505]Verifying plus button directed to Create Delivery Man
    When Verify visibility and activity of Plus button
    Then Click on the plus button
    Then Verifying plus button directed to Create Delivery Man
    Then For plus new deliveryMan enters the unused information for Email and phone
    And Assert the name and Email address in first row is equal to the last filled values

  Scenario:[TC_3506]Verifying the visibility of Action button and Edit link and Edit functionality by updating.
    When Verify visibility and activity of action button
    Then Click on the action button
    When Verify visibility and activity of edit button


  Scenario: [TC_3507]Verifying visibility of Delete link in Action dropdown.
    When Verify visibility and activity of delete button

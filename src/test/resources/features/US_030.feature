Feature:As a merchant, I want to view, update, add, and delete pickup points
  Background: Common Step
    Given Go to the "dashboardUrl"
    When Login as a merchant
    Then Click on the Setting button
  @t365
  Scenario:[TC_3001]Verifying visibility of 'Pickup Point' link in Setting dropdown
    Then Assert visibility and activity of Pickup Point link

  Scenario:[TC_3002]Verifying visibility of 'Pickup Point' title in directed page
    Then Click on the Pickup Point link
    When Assert the directed page address contains Pickup Point item
    Then Assert the directed page title contains Pickup Point

  Scenario:[TC_3003]Verifying visibility of a table with six column.
    Then Click on the Setting button
    Then Click on the Pickup Point link
    When Assert visibility of a list table


  Scenario: [TC_3004]Verifying visibility and functionalty of plus button in 'Pickup Point' page
    Then Click on the Setting button
    Then Click on the Pickup Point link
    When Assert visibility and activity of Plus button
    And Click on the Plus button
    Then Assert the directed page title is equal to Create Pickup Point

  Scenario: [TC_3005]Verifying visibility of added row
    Then Click on the Setting button
    Then Click on the Pickup Point link
    And Click on the Plus button
    When Fills parameters of Nme, Contact, Address and Status
    And Clicks on save button
    Then Assert increasing the row size of table


  Scenario:[TC_3006]Verifying visibility of Edit link in Actions dropdown and related page
    Then Click on the Setting button
    Then Click on the Pickup Point link
    And Click on the Actions button
    When Assert visibility and activity of Edit link

  Scenario: [TC_3007]Verifying functionality of 'Edit' link in Actions dropdown
    Then Click on the Setting button
    Then Click on the Pickup Point link
    And Click on the Actions button
    And Click on Edit link
    When Changes the value of parameters
    Then Click on Save Changes button
    When Assert changed values are equal to changed row values

  Scenario: [TC_3008]Verifying visibility and functionality of 'Delete' link in Actions dropdown
    Then Click on the Setting button
    Then Click on the Pickup Point link
    And Click on the Actions button
    When Assert visibility and activity of Delete link
    And Click on Delete link
    When Assert displayed popup contains Delete
    When Click on Yes button
    Then Assert displayed message contains Pickup Point successfully deleted

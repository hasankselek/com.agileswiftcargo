@t05

Feature:[US_028]As a merchant, I want to view all reports related to shipments
  Background: Common Step
    Given Go to the "dashboardUrl"
    When Login as a merchant


  Scenario:[TC_2801]Verifying visibility of 'Total Summary' link in the 'Reports' dropdown
    When Assert visiblility and clickablility of'Total Summery'link.

  Scenario:[TC_2802]Verifying title of the 'Total Summary' page
    Then Click on Total Summery link.
    When Assert visibility of title of directed page is equal to Total Summery.


  Scenario:[TC_2803]Verifying visibility and activity of 'Filter' button and 'Enter Date' box
    Then Click on Total Summery link.
    When Assert visibility and activity of filter button.
    When Assert visibility and activity of Enter Date box.

  Scenario: [TC_2804]Verifying visibility of Reports of Total Sammary
    Then Click on Total Summery link.
    And Click on the Enter Date box.
    When Click on one item on the Enter Date box dropdown.
    Then Assert the date is displayed Enter Date box.
    And Click on the filter button.
    Then Assert displayed a table .

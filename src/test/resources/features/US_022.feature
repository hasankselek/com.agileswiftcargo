Feature: [US_022] As a merchant, I want to view revenue data

  Scenario: [TC_2201] Payment Received Menu Visibility

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    And Verify that the "Payment Received" link under Accounts is visible and clickable.


  Scenario: [TC_2202] Payment Received Page Navigation

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payment Received" link in the left menu.
    And Verify that the "Payment Received" page loads correctly by checking the page title and URL.

  Scenario: [TC_2203] Payment Received List Display

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payment Received" link in the left menu.
    And Verify that "Payment Received List" table is displayed
    And Verify that the table headers "#", "Card Type", "From Account", "Transaction Id", "Amount (Tk)" is displayed correctly.





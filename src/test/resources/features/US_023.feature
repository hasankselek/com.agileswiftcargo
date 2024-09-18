Feature: [US_023] As a merchant, I want to view expense data and make payments.

  Scenario: [TC_2301] Payout Menu Visibility
    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    And Verify that the "Payout" link under Accounts is visible and clickable.

  Scenario: [TC_2302] Payout Page Navigation
    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payout" link in the left menu.
    Then Verify that the "Payout" page loads correctly by checking the page title and URL.

  Scenario: [TC_2303] Payout List Display

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payout" link in the left menu.
    And Verify that the table headers "#", "Card Type", "To Account", "Transaction Id", "Amount (Tk)" is displayed correctly.
    And Verify that Payout List have at least 3 data

  Scenario: [TC_2304] Stripe Link Visibility and Functionality

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payout" link in the left menu.
    Then Verify if the Stripe logo is visible
    And Verify that the Stripe link is visible and clickable.
    Then Click on the Stripe link.
    And Verify that Stripe link redirected to the relevant page.

  Scenario: [TC_2305] Stripe Payout Details Visibility

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payout" link in the left menu.
    Then Click on the Stripe link.
    And Verify that the To Account and Amount fields are visible and allow data input.

  Scenario: [TC_2306] Pay Now Button Functionality

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payout" link in the left menu.
    Then Click on the Stripe link.
    Then Enter valid data into the To Account and Amount fields on the Stripe Payout Details page.
    Then Click the Pay Now button.
    And Verify that the Merchant Payment window opens.
    Then Fill in the Email, Card number, MMYY, and CVC information, then click the Pay button.
    And Verify that the payment is processed successfully.


  Scenario: [TC_2307] Empty Data Negative Pay Now Button Functionality
  # miswritten notification-last step
    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payout" link in the left menu.
    Then Click on the Stripe link.
    Then Enter valid data into the To Account but do not enter any data into the Amount field.
    Then Click the Pay Now button.
    And Verify that the "Amount feild is required." notification is displayed.


  Scenario: [TC_2308] Incorrect Data Negative Pay Now Button Functionality

    Given Go to the "homepageUrl"
    Then Login as an merchant
    Then Click on the "Accounts" link in the left menu.
    Then Click on the "Payout" link in the left menu.
    Then Click on the Stripe link.
    Then On the Stripe Payout Details page, enter non-numeric data into the Amount field while leaving the To Account field valid.
    Then Click the Pay Now button.
    And Verify that the "Oops! Something went wrong." notification is displayed.










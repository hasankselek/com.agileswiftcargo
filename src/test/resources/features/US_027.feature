Feature: As a merchant, I want to view reports related to the statuses of products.

  @TC_2701
  Scenario: Parcel Status Report Menu Visibility and and access test

    Given Go to page "homepageUrl"
    Then Clicks the login button
    Then Enters row 7 in Email Address textbox
    Then Enters row 7 in Password textbox
    Then Clicks Sign In button
    Then Clicks Reports menu on left side
    Then Verify parcel status reports menu is displayed
    Then Clicks parcel status reports menu
    Then Verify page contains filter button

  @TC_2702
  Scenario: Parcel Status Report data export and print buttons should be visible and clickable

    Given Go to page "homepageUrl"
    Then Clicks the login button
    Then Enters row 7 in Email Address textbox
    Then Enters row 7 in Password textbox
    Then Clicks Sign In button
    Then Clicks Reports menu on left side
    Then Clicks parcel status reports menu
    Then Clicks date filter box
    Then Clicks Last thirty days option
    Then Clicks filter button
    Then Verify export export and print options are enabled
Feature:E2E Test

  @e2e
  Scenario: User adds parcel from excel

    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 1 in Email Address textbox
    Then Enters row 1 in Password textbox
    And  Clicks Sign In button
    When the user clicks on the "Parcels" link
    And  the opened page should be the "Parcels" page
    And the user clicks on the " Import" button on the parcels page
    Then the user should be redirected to the import page
    And Click profile icon
    And Clicks Logout button
    When Clicks "Tracking" button
    Then Enter tracking id wrong TrackID in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that error messages
    Then Enter tracking id trackID in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that cargo information is displayed



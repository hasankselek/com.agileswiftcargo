Feature:E2e Test

@e2e
  Scenario: User adds parcel from excel

    Given Enters the "homepageUrl"
    When Clicks of the "Login" button
    Then Enters row 1 in Email Address textbox
    Then Enters row 1 in Password textbox
    And  Clicks Sign In button
    When the user clicks on the "Parcels" link
    Then the opened page should be the "Parcels" page
    And the user clicks on the " Import" button on the parcels page
    Then the user should be redirected to the import page


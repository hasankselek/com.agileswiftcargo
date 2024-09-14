@US_004
Feature:As a user, I want to check the status of the cargo using the 'Track Now' field.

  @TC_0401
  Scenario:

    Given Enters the "homepageUrl"
    Then Verifies that the text box labelled Enter tracking id is displayed
    Then Verifies that data can be entered in the Text Box

  @TC_0402
  Scenario:

    Given Enters the "homepageUrl"
    When Enter tracking id "AS726353160C464" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that it redirects to the Tracking page


  @TC_0403
  Scenario:

    Given Enters the "homepageUrl"
    When Enter tracking id "AS726353160C464" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that the entered Tracking Id "AS726353160C464" matches the Parcel Tracking No


  @TC_0404
  Scenario:

    Given Enters the "homepageUrl"
    When Clicks "Tracking" button
    Then Verifies that the text box labelled Enter tracking id is displayed
    Then Verifies that data can be entered in the Text Box


  @TC_0405
  Scenario:

    Given Enters the "homepageUrl"
    When Clicks "Tracking" button
    Then Enter tracking id "AS726353160C464" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that cargo information is displayed




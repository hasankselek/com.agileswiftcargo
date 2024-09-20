@US_004
Feature:As a user, I want to check the status of the cargo using the 'Track Now' field.

  Background: Common Steps
    Given Enters the "homepageUrl"

  @TC_0401
  Scenario:Homepage Tracking ID textbox visibility test

    Then Verifies that the text box labelled Enter tracking id is displayed
    Then Verifies that data can be entered in the Text Box

  @TC_0402
  Scenario:Homepage Tracking ID text box functionality test

    When Enter tracking id "AS726353160C464" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that it redirects to the Tracking page


  @TC_0403
  Scenario:Homepage Correct Tracking ID test

    When Enter tracking id "AS726353160C464" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that the entered Tracking Id "AS726353160C464" matches the Parcel Tracking No


  @TC_0404
  Scenario Outline:Homepage incorrect Tracking ID test

    When Enter tracking id "AS726353160C464" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that the entered Tracking Id "<TrackingID>" matches the Parcel Tracking No
    Then Verifies that error messages
    Examples:
      | TrackingID |
      | 1231231231 |
      | asdasdasda |
      | !'^+%&/(=) |


  @TC_0405
  Scenario:Tracking page text box functionality test

    When Clicks "Tracking" button
    Then Verifies that the text box labelled Enter tracking id is displayed
    Then Verifies that data can be entered in the Text Box


  @TC_0406
  Scenario:Correct Tracking ID test

    When Clicks "Tracking" button
    Then Enter tracking id "AS726353160C464" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that cargo information is displayed


  @TC_0407
  Scenario Outline:Incorrect Tracking ID test

    When Clicks "Tracking" button
    Then Enter tracking id "<TrackingID>" in the Enter tracking id box
    And Clicks "Track Now" button
    Then Verifies that error messages

    Examples:
      | TrackingID      |
      | AS726353160C464 |
      | asdasdasda      |
      | !'^+%&/(=)      |






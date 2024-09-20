@US_009
Feature: As a user, I want to see reference companies

  @TC_0901
  Scenario: Partners Display Test

    Given Go to page "homepageUrl"
    Then Scroll to Our Partners area.
    Then Swipe to slide 3.
    Then Swipe to slide 1.
    Then Verify that the logos list is displayed successfully.
    Then Swipe to slide 1.
    Then Verify that first slide is selected.
    Then Swipe to slide 2.
    Then Verify that second slide is selected.
    Then Swipe to slide 3.
    Then Verify that third slide is selected.

  @TC_0902
  Scenario: Partners logos should be clickable and take you to correct URL.
    #Tested on USA websites with USA browser, results may change in other locations
    Given Go to the "homepageUrl"
    Then Scroll to Our Partners area.
    Then Swipe to slide 3.
    Then Swipe to slide 1.
    Then Click on logo 1
    Then Verify new tab title is correct for "logo1"
    Then Click on logo 2
    Then Verify new tab title is correct for "logo2"
    Then Click on logo 3
    Then Verify new tab title is correct for "logo3"
    Then Click on logo 4
    Then Verify new tab title is correct for "logo4"
    Then Click on logo 5
    Then Verify new tab title is correct for "logo5"
    Then Click on logo 6
    Then Verify new tab title is correct for "logo6"
    Then Click on logo 7
    Then Verify new tab title is correct for "logo7"
    Then Click on logo 8
    Then Swipe to slide 3.
    Then Verify new tab title is correct for "logo8"
    Then Click on logo 9
    Then Verify new tab title is correct for "logo9"
    Then Click on logo 10
    Then Verify new tab title is correct for "logo10"

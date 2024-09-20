@US_005
Feature: As a user I want to view information in the 'Our Sevices' field.

  @ser1
  Scenario: TC_0501 'Our Service' panel visibility test

    Given Enters the "homepageUrl"
    Then  Verifies Our Service header visibilty
    Then  Verifies "E-Commerce delivery", "Pick & Drop", "Packageing", "Warehousing" headers visibility
    And   Verifies an arrow visible under the services and is clickable


  @ser2
  Scenario: TC_0502 To 'Service Details' page redirect test

    Given Enters the "homepageUrl"
    Then  Clicks arrow under the "Pick & Drop"
    Then  Verifies service details page opens


  @ser3
  Scenario: TC_0503 'Last Services' area visibilty and redirect test

    Given Enters the "homepageUrl"
    Then  Clicks arrow under the "Pick & Drop"
    Then  Verifies "E-Commerce delivery", "Pick & Drop", "Packageing", "Warehousing" headers visibility
    And   Verifies an arrow visible under the last services and is clickable
    Then  Clicks arrow under the last service "E-Commerce delivery"
    And   Verifies arrows redirect to "E-Commerce delivery" page











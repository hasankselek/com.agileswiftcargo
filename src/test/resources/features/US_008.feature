
@US_008
Feature: As a user, I want to see customer satisfaction data.
  Background: Common Steps
    Given Enters the "homepageUrl"
    Then Verifies access to homepage

  @TC_0801
  Scenario:Verify that "Happy Achievement" is visible in the Body section of the Home Page

    Then It is verified that "Happy Achievement" is visible in the Body section of the Home Page

  @TC_0802
  Scenario:In the Body section of the Home Page, under "Happy Achievement", it is verified that "Branches" is visible

    Then It is verified that "Branches" is visible in the Body section of the Home Page

  @TC_0803
  Scenario:It is verified that "Parcel Delivered" is visible under "Happy Achievement" in the Body section of the Home Page

    Then It is verified that "Parcel Delivered" is visible in the Body section of the Home Page

  @TC_0804
  Scenario:It is verified that "Happy Merchant" is visible under "Happy Achievement" in the Body section of the Home Page

    Then It is verified that "Happy Merchant" is visible in the Body section of the Home Page

  @TC_0805
  Scenario:It is verified that "Positive Reviews" is visible under "Happy Achievement" in the Body section of the Home Page

    Then It is verified that "Positive Reviews" is visible in the Body section of the Home Page
@US_002
Feature:

  Background: Common Steps
    Given Enters the "homepageUrl"

  @TC_0201
  Scenario: This test checks the visibility and functionality of the Home text on the home page.

    Then In the upper section of the home page, the inscription "Home" is verified.
    Then Click on "Home"
    And The page that opens is verified as "homepageUrl"

  @TC_0202
  Scenario:This test checks the visibility and functionality of the Pricing text on the home page.

    Then In the upper section of the home page, the inscription "Pricing" is verified.
    Then Click on "Pricing"
    And The page that opens is verified as "pricingUrl"

  @TC_0203
  Scenario:This test checks the visibility and functionality of the Tracking text on the home page.

    Then In the upper section of the home page, the inscription "Tracking" is verified.
    Then Click on "Tracking"
    And The page that opens is verified as "trackingUrl"

  @TC_0204
  Scenario:This test checks the visibility and functionality of the Blogs text on the home page.

    Then In the upper section of the home page, the inscription "Blogs" is verified.
    Then Click on "Blogs"
    And The page that opens is verified as "blogsUrl"

  @TC_0205
  Scenario:This test checks the visibility and functionality of the About text on the home page.

    Then In the upper section of the home page, the inscription "About" is verified.
    Then Click on "About"
    And The page that opens is verified as "aboutUrl"

  @TC_0206
  Scenario:This test checks the visibility and functionality of the FAQ text on the home page.

    Then In the upper section of the home page, the inscription "FAQ" is verified.
    Then Click on "FAQ"
    And The page that opens is verified as "faqUrl"

  @TC_0207
  Scenario:This test checks the visibility and functionality of the Contact text on the home page.

    Then In the upper section of the home page, the inscription "Contact" is verified.
    Then Click on "Contact"
    And The page that opens is verified as "contactUrl"

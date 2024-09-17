

Feature:Home page access test
   @TC_001
  Scenario: The visitor navigates to a page and verifies it loads correctly
    Given  Enters the "homepageUrl"
    Then Verifies access to homepage
    Then Verifies homepage load successfully
  @TC_002
  Scenario:The visitor should be able to access the footer section on the homepage
    Given  Enters the "homepageUrl"
    Then Verifies access to homepage
    Then Verifies homepage load successfully
    Then On the homepage, it goes all the way down to the footer section
    @TC_003
  Scenario:It should be verified that the 'Subscribe Us' heading is visible in the footer section of the homepage
    Given  Enters the "homepageUrl"
    Then Verifies access to homepage
    Then Verifies homepage load successfully
    Then On the homepage, it goes all the way down to the footer section
    And  Tests the visibility 'Enter Email' text
@TC_004
  Scenario:Usability test of the text box
    Given  Enters the "homepageUrl"
    Then Verifies access to homepage
    Then Verifies homepage load successfully
    Then On the homepage, it goes all the way down to the footer section
    And  Tests the visibility 'Enter Email' text
    Then  Enters "swift@gmail.com" in the textbox
    And  Confirms that registration has been done in a successful


@US_006
Feature:As a user, I want the information in the 'Why Agile Swift Cargo' field to be displayed.

  @TC_0601
  Scenario:Verifying that the headings in the ‘Why Agile Swift Cargo’ field are visible

    Given Enters the "homepageUrl"
    When User goes to the Why Agile Swift Cargo title
    Then User verifies that the headers are displayed

  @TC_0602
  Scenario:Verifying that the images in the ‘Why Agile Swift Cargo’ field are visible

    Given Enters the "homepageUrl"
    When User goes to the Why Agile Swift Cargo title
    Then User verifies that the images are displayed
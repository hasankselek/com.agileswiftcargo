Feature:[US_006]As a user, I want the information in the 'Why Agile Swift Cargo' field to be displayed.

  @TC_0601
  Scenario: Verifying that the headings in the ‘Why Agile Swift Cargo’ field are visible
    
    Given Enters the "homepageUrl"
    When The user goes to the Why Agile Swift Cargo section
    Then The user verifies that the headers are displayed

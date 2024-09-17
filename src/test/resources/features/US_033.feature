@US_033
  Feature: As an administrator, I want to update my password.
    Background: Common Steps
      Given Enters the "homepageUrl"
      And  Clicks the login button
      Then Enters row 9 in Email
      And Enters row 9 in Password
      And Clicks Sign In button
    @TC_3301
      Scenario: Clicking on the profile icon in the top bar of the admin panel
                opens a window with links to 'Profile', 'Change Password' and 'Logout'
                Then  visibility of the Profile icon in the box that appears
                And Click the Profile button
                And  visibility of the icon of the Change password link
                And   visibility of the Logout icon

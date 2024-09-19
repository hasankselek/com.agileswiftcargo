@US_034
  Feature: As an administrator, I would like the information in the 'Dashboard' to be displayed.
    Background: Common Steps
      Given Enters the "homepageUrl"
      And  Clicks the login button
      And Click the Login button as administrator and enter the system
    @TC_3401
    Scenario: Verifying that the information headings in the Dashboard are displayed
      And Test the visibility of the Total Parcel information banner in the dashboard
      And Test the visibility of the Total User information banner on the dashboard
      And Test the visibility of the Total Merchant information banner on the dashboard
      And Test the visibility of the Total Delivery Man information banner on the dashboard
      And Test the visibility of the Total Branch information banner on the dashboard
      And Test the visibility of the Total Accounts information banner on the dashboard
      And Test the visibility of the Total Partial Deliverd information banner on the dashboard
      And Test the visibility of the Total parcels deliverd information banner on the dashboard
      And Test the visibility of the Delivery Man Statements information box in the dashboard
      And Test the visibility of the Merchant Statements information box in the dashboard
      And Test the visibility of the Branch Statements information box in the dashboard

   @TC_3402
   Scenario: The graph in the 'Income/Expense' field is visible and functional
     And page scrolls down once
     And Test the visibility of the graph in the Income-Expense field
    @TC_3403
    Scenario: Calendar is visible and up to date
      And Test the visibility of the date time
      And  the calendar is tested for timeliness


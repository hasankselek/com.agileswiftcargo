@55
Feature:[US_010]As a user I want to view block posts.

  Background: Common Step
    Given  Enters the "homepageUrl"

  Scenario: [TC_1001]Verifying visibility and activity of 'Blogs' link in top bar of Homepage
    When Assert visibility of Home link.
    When Assert visiblility and clickablility of'Blogs'link.


  Scenario:[TC_1002]Verifying clicked 'Blogs' link is directed to blogs page.
    Then Clicks on Blogs button in homepage.
    Then Assert directed page title equals to Blogs.

  Scenario:[TC_1003]Verifying the block text are same Before and after clicking
    Then Clicks on Blogs button in homepage.
    And Entry block text of selected blog.
    When Click on entried text Blog.
    Then Assert opened blog block text equals to enterd block text.

  Scenario:[TC_1004]Verify increasing size of block text
    Then Clicks on Blogs button in homepage.
    And Entry text count of selected Blog.
    When Click on entried text Blog.
    Then Assert count of clicked Blog text is bigger than entryed text count.

  Scenario: [TC_1005]Verifying the blogs in Latest Blogs area are visible and clickable
    Then Clicks on Blogs button in homepage.
    Then Click on the selected Blog.
    And Assert visibility and activity of list of blogs in the Latest Blogs area.
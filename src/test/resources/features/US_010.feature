@t1
Feature: US_010 As a user the 'Blogs' link in the top bar of the homepage must be visible and clickable.

  Background: Common Steps
    Given Enters the "homepageUrl"

  Scenario: [TC_1001] Verifying visibility and activity of 'Blogs' link in top bar of Homepage
    When Assert visibility of Home link.
    When Assert visiblility and clickablility of'Blogs'link.
    Then Click on the Blogs button.
    Then Assert directed page title equals to Blogs.

  Scenario: [TC_1002]Verifying the block text are same Before and after clicking
    Then Click on the Blogs button.
    And Entry block text of selected blog.
    When Click on the selected blog.
    Then Assert opened blog block text equals to entried block text.

  Scenario: [TC_1003]Verify increasing size of block text
    Then Click on the Blogs button.
    And Entry row count of selected Blog.
    When Click on the selected blog.
    Then Assert row size of clicked Blog is bigger than entryed row size.

  Scenario:[TC_1004]Verifying the blogs in Latest Blogs area are visible and clickable
    Then Click on the Blogs button.
    When Click on the selected blog.
    And Assert visibility and activity of list of blogs in the Latest Blogs area.

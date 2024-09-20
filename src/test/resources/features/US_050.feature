 Feature:As an administrator, I want to view, update, add and delete information on the 'Salary Generate' page.


Scenario :Salary Generate' list should be visible.
  And  Verify Salary Generate button directed to Salary Generate
  When Verify visibility and activity of Salary Generate List
Scenario: A salary list should be created with the Auto Generate link on the right of the Salary Generate list.
  Given Verify "Auto Generate" link is not visible and clickable
Scenario: Salary should be created using the Add link to the right of the Salary Generate list.
  Given Verify Add link is not visible and clickable
Scenario: Salary information should be updated using the Actions menu in the Salary Generate list
  Given Verify Actions link is not visible and clickable
Scenario: Salary information should be deleted using the Actions menu in the Salary Generate list
  Given Verify Delet link is not visible and clickable

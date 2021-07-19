Feature:
  Task 5: Data tables task

  Scenario:Verifying search results
  Given user is on the login page
    When user enters librarian username as "librarian13@library"
    And user enters librarian password as "9rf6axdD"
    And user clicks on the login button
    When user clicks on "Users" link in the landing page
    Then table should have following columns:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |

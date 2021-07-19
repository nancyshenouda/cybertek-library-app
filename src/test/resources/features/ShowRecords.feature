
Feature: Verifying show records dropdown
  Task 4: Datatables task

  Scenario: Verifying show records dropdown
    Given user is on the login page
    When user enters librarian username as "librarian13@library"
    And user enters librarian password as "9rf6axdD"
    And user clicks on the login button
    When user clicks on "Users" link in the landing page
    Then Show records dropdown value should be 10 by default
    And show records should have following options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |

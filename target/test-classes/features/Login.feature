
Feature:
  Agile Story: User should be able to login with user name and password
  using two different user accounts Student and Librarian

  Background: Assuming user is on the login page
    Given user is on the login page

  Scenario: User login as a student user
    When user enters the student correct username
    And user enters the student correct password
    And user clicks on the login button
    Then books should be displayed

  Scenario: User login as a librarian user
    When user enters the librarian correct username
    And user enters the librarian correct password
    And user clicks on the login button
    Then dashboard should be displayed
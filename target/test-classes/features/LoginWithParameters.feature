@all
Feature: User login with parameters
  Agile Story: user should be abe to login with two different credentials as student and librarian


  Background: Assuming users are on the login page
    Given user is on the login page

  Scenario: User login as student12 with parameters

    When user enters student username as "student12@library"
    And user enters student password as "UC0LC9Hj"
    And User clicks on the login button
    Then books should be displayed



  Scenario: User login as librarian13 with parameters

    When user enters librarian username as "librarian13@library"
    And user enters librarian password as "9rf6axdD"
    And User clicks on the login button
    Then dashboard should be displayed


    Scenario: Login as librarian in the same line
      Given user is on the login page
      When user enters "librarian14@library" as username and "87x8afWY" as password
      And user clicks on the login button
      And there should be 5561 of users there
Feature:
  As a user, I should be able to login with different users using their correct emails and passwords.
  when I login, I should be able to see username in the account username section.

  @ScenarioOutline
  Scenario Template: logging in with different <username>
    Given user is on the login page
    When user enters librarian username as "<username>"
    And user enters librarian password as "<password>"
    And user clicks on the login button
    And user should be able to see "<name>" in the account username section.
    @student
    Examples:

      | username          | password | name            |
      | student11@library | tScBPCUr | Test Student 11 |
      | student14@library | 6SW236ia | Test Student 14 |

  @librarian
    Examples:

      | username                   | password | name              |
      | librarian13@library | 9rf6axdD | Test Librarian 13 |
      | librarian20@library | XXJTMgzA | Test Librarian 20 |


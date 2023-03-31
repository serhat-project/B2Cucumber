Feature: login orangeHRM


  Scenario: login functionality
    Given user on page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

    When user fill the login form as follows
      | username | Admin    |
      | password | admin123 |

    Then login should be successful
    And  quit driver


  Scenario: login status
    Given user on page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

    When user tries to login as follows, conclution should be as in status
      | username | password  | status |
      | Admin1   | admin123  | false  |
      | Admin    | admin1234 | false  |
      | Admin    | admin123  | true   |
      | Admin1   | admin123  | false  |
      |          |           | false  |
      | Admin    |           | false  |
      |          | admin123  | false  |

    Then quit driver




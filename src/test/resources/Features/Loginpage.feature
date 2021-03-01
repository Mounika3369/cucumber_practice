Feature orangehrm login feature
  @HRM
  Scenario: login orangehrm
    Given open the url
    When Enter username and password
    And Enter email
    And click on login button
    Then user should login successfully

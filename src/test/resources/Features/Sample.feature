Feature: Sample
  @login
  Scenario: login form
    Given the user open application
    When Enter first name
    And Enter last name
    And Enter phone number
    And Enter country name
    And Enter city name
    And Enter Email address
    And Select gender
    And Select check box
    And Select drop down
    And Submit form
    Then validate for successful login


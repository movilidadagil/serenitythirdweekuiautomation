Feature: Signup page

  @signup
  Scenario: n11 mark signup
    Given user launch browser and open the main page
    When user logged in with valid credentials
    Then user logged in successfully

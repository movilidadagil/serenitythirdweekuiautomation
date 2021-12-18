Feature: n11 login


  @Enes
  Scenario: n11 login
    Given user is on the n11 main page
    When user clicks on giris yap button
    Then user verifies that login page appeared
    When user sends a valid email address
    And user send a valid password
    Then user clicks giris yap button
    And user verifies that logged in successfully.




  @Kaan
  Scenario: n11 login
    Given user open the n11 main page
    When user clicks on giris yap button
    Then user verifies that login page appeared
    When user types email address on email box
    And  user types password on password box
    And  user clicks giris yap button
    Then user verifies that user page appeared.



   @login
   Scenario: n11 mark login
     Given user launch browser and open the main page
     When user logged in with valid credentials
     Then user logged in successfully





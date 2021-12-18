Feature: Cocoads Login

  @cocoadslogin
  Scenario: cocoads login with screenplay
    Given Hasan continues in english
    When Hasan logs in to cocoads
    Then he should see information about his account in cocoads

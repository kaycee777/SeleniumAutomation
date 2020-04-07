@accountManagement
Feature: Account Management

  @createAccount
  Scenario: Create an account with a valid email address
    Given User on create an account page
    When User enters first name
    And User enters last name
    And User enters email address
    And User enters password
    And User enters confirm password
    And User clicks on create account
    Then account should be created successfully





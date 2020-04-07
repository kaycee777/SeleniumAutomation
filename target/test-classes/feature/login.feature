@accountManagement
Feature: Login
  @login
  Scenario: Account login-Registered Customer
    Given User on log in page
    When User their enters email Address
    And User their enters password
    And User clicks on log in
    Then my account dashboard is displayed
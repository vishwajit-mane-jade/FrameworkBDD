Feature: Feature to test login functionality

  Scenario Outline: Check if login is successful with valid credentials
    Given user is on login page
    When user enters <Username> and <Password>
    And User clicks on login button
    Then User is navigated to home page

    Examples: 
      | Username | Password     |
      | student  | Password123  |
      | student  | Password1234 |

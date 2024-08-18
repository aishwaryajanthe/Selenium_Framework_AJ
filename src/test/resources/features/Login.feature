Feature: Verify Login Functionality
  verifying all the login functionality all negative and positive scenarios
  Scenario: Negative scenario -  invalid password and verify the error message
    Given Enter the user name details
    And Enter the password details
    When Click the login button
    Then Verify the error message
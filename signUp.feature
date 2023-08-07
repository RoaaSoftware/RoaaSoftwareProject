Feature: Sign up
  Actor: An outsider to the system

  Scenario: The sign up is successful
    Given that the user "nonexistent" is  not logged in
    And they do not have an account in the system
    Then the sign up succeeds
    And the user is redirected to the login page

  Scenario: The sign up is unsuccessful
    Given that the user "roaa" is  not logged in
    And they have an account in the system
    Then the sign up fails
    And the user is prompted to try again

  Scenario: The sign up is unsuccessful
    Given that the user "roaa" is  not logged in
    And they do have an account in the system
    Then the sign up fails
    And the user is prompted to try again
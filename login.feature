
Feature: Login
  Actor: User
  Description: The User's login process to the system

  Scenario: Tenant can login
    Given that the tenant "roaa" is not logged in
    When tenant tries to login
    And username is "Roaa" and password is "1234e"
    Then the tenent login succeeds
    And the tenent is logged in

  Scenario: tenent cannot login
    Given that the tenent "roaa" is not logged in
    When tenent tries to log in
    And username is "Roaa" and password is "wrongpassword"
    Then the tenent login fails
    And the tenent is not logged in

  Scenario: Admin can login
    Given that the admin "Ahmad" is not logged in
    When admin tries to log in
    And username is "Ahmad" and password is "1196"
    Then the admin login succeeds
    And the admin is logged in

  Scenario: Admin cannot login
    Given that the admin "Ahmad" is not logged in
    When admin tries to log in
    And username is "Ahmad" and password is "wrongpassword"
    Then the admin login fails
    And the admin is not logged in


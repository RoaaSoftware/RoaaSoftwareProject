Feature: Viewing User's Personal Data
  Actor: User
  Description: User could see his personal information

  Scenario: The User view's his personal data successfully
    Given that the user "roaa" is logged in and booked a house
    Then a control panel will appear
  And the user could see his personal data (successfully)

  Scenario: The User view's his personal data unsuccessfully
    Given that the user "roaa" is logged in and didn't book a ahouse
    Then the control panel won't appear
    And the user is prompted to try again
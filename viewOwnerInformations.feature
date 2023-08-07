Feature:  Viewing The name of the residence owner and his contact information
  Actor: User
  Description:  The user could view the name of the residence owner and his contact information

  Scenario: The User view  the name of the residence owner and his contact information successfully
    Given that the user "roaa" is logged in and booked a house 
    Then a cotrol panel will appear
    And the user could see  The name of the residence owner and his contact information

  Scenario: The User view the name of the residence owner and his contact information unsuccessfully
    Given that the user "roaa" is logged in but didnt book a house
    Then a cotrol panel wont appear
    And the user is prompted to try again
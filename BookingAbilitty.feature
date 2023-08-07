
Feature: Booking
  The abilitty of tenent to book a house via the app

  
  Scenario:The tenent books a house successfully
   Given that the tenant logged in and the house is available
Then tenant books this house
And a control panel will appear

 Senario : The tenent books a house unsuccessfully
Given that the tenant logged in and the house is unavailable
Then tenant couldnt book this house
And A note appears to try again

   

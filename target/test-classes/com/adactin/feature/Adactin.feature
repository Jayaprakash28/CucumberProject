Feature: Booking functionality of Adactin 	Application


@SmokeTest
  Scenario Outline: Verify the user is able to login  the application
    Given user launches the application
    When user enters the valid "<username>" in the username field
    And user enters valid "<password>" in the password field
    And User clicks on the login button
    Then user verfies loginpage navigates to search hotel page
    
 Examples:
      |username|password|
      |AAA|111|
      |BBB|222|
      |prakashr|673743|
      
      
          
    

@RegressionTest
Scenario: Verify the user is able to SearchHotel page
    When User select the location "Brisbane" as "value" in the select location field
    And User select the Hotel "Hotel Hervey" as "value" in the select hotel field
    And User select the room type "Standard" as "value" in the select room type field
    And User select the number of room "2" as "value" in the select number of room field 
    And User enter the check in date "21/12/2020" in the select check in date
    And User enter the check out date "22/12/2020" in the select check out date
    And User select the adult per room "3" as "value" in the select adult per room
    And User select the children per room "4" as "value" in the select children
    And User click search button
    Then User verifies Search Hotel navigates page to Search Hotel page
  
@SanityTest     
Scenario: Verify the user is able to Select Hotel page
    When User makes hotel selection
    And User click continue button
    Then User verifies Select Hotel navigates page to Select Hotel page
    
 Scenario: Verify the user is able to Book Hotel page
    When User enter the first name "Jaya" in the first name field
    And User enter the last name "Prakash" in the last name field
    And User enter the billing address "No:12th Block, Selva Nagar, Chennai" in the billing address field
    And User enter the credit card no "3216549873216549" in the credit card field
    And User select the credit card type "VISA" as "value" in the credit card type field 
    And User select the Expiry date "4" as "value" in the Expiry date field
    And User select the Expiry year "2013" as "value"  in the Expiry year 
    And User enter the cvv "275"  in the cvv field
    And User clicks in the Booknow button
    Then User verifies Book Hotel navigates to Book Hotel page
    
 Scenario: Verify the user is able to Book Itinerary
    When User click my itinerary button
    And User click logout button 
    Then User verifies Book Itinerary page navigates to Book Itinerary
    
    
    
   
    
    
    
     
  
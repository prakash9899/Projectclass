Feature: Hotel Booking In Adactin Application 

Scenario: login
Given user launch the Application
When user enter the username Field
And enter the Passward field
Then click on Logion button and it Navigate to search hotel page

Scenario: search hotel
When user Select location in Field
And user Select Hotel In Field
And user room Type In Field
And user number of roon in field
And  user Chick In Date In Field
And user chick out date in Field
And user adults select in field 
Then click on search and it navigate to select hotel page 

Scenario: button 
When user selecet the button in Field
Then click on continue and it navigate to book a hotel page

Scenario: book a hotel 
    When user select name in Field
    And user select last name in Field
    And user give address in Field
    And user give card number in Field
    And user select card type in Field
    And user select datein Field
    And user select year in Field
    And user give the cvv number in Field 
    Then click in booknow and navigate tobooking conformation page
    
    Scenario: my itirnerary
    When user click on my itrineryin Field

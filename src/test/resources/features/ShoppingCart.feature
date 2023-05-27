

Feature: Add product to shopping cart


Background:
 	
Given User is on retail website home page
Then User verify retail website title

@smoke
 Scenario: Verify product can be added to shopping cart
 And User searches 'PlayStation 5 Console' in search box 
 And User clicks on search button
 Then User clicks on product in product log
 And Verify product web page is loaded
 Then User adds product to shopping cart 

 

 


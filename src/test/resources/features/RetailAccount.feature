
Feature: Verify User can create an account


 Background:   
 Given User is on retail website home page
 Then User verify retail website title
  
@create
  Scenario: 
  And User clicks on sign in button
  Then User clicks on Create New Account
  And User will enter '<Name>' and '<Email>' and '<Password>' and '<Confirm Password>'
  Then User will click on Sign Up button
  Then User will verify that Account is created
  

 Examples: 
 
 |Name|Email|Password|Confirm Password|
 |Parlo|Parlo2324@gmail.com|Parlo2813!|Parlo2813!|
 |Parlo|Parlo2325@gmail.com|Parlo2813!|Parlo2813!|
 |Parlo|Parlo2326@gmail.com|Parlo2813!|Parlo2813!|

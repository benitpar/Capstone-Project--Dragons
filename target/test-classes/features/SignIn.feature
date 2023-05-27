
Feature: Login

Background:
  Given User is on retail website home page
  Then User verify retail website title
  
 @signin
  Scenario: Verify user can create account on tek retail website
       And User clicks on sign in button
       And User enters '<email>' and '<password>'
       And clicks on Login button
       Then User should see their profile page


    Examples: 
|email|password|
|louieben300@gmail.com|Lou@ons123|
|louieben200@gmail.com|Lou@ons123|

Feature: check the functionality for GreenKart web

Scenario: Add an item on cart, and check if the same item is available in the Top deals page or not 

Given user is on landing page
When user searching for a product "Tom"
Then Product should be displayed
And user should see "Tom" item on Top deals page
And Verify both item name is same



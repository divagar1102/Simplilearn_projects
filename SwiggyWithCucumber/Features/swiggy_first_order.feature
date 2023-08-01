Feature: Swiggy First Order
@TC_101
Scenario: A user must be able to order in Swiggy
Given a user is on the landing page of Swiggy
When he enters delivery location in navigation bar
And he clicks on first available restaurant 
And he clicks on Add button on first listed dish
And he hover over Cart
And he clicks on Check Out in the sub-menu
Then he must be able to order the food successfully
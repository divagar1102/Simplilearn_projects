Feature: Buy Mobile Phone
@TC_101 @product_purchase
Scenario: A usermust be able to buy a mobile phone on Amazon
Given a user is on the landing page of Amazon
When he clicks on Mobiles in the navigator bar
And he hovers the pointer over Mobiles & Accessories
And he clicks on Apple in the sub-menu
And he clicks on the second available phone
And he switches focus on the new tab
And he clicks on Buy Now button
Then he must be able to purchase the mobile phone successfully.

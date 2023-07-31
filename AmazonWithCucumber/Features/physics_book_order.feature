Feature: Physics Books Shopping

 Scenario: Add a 4-star and above physics book to the cart
 Given he open the browser and maximize it
 When he navigate to the application
 And he type 'physics books' in the search box
 And he select the 3rd option from the drop-down
 And he select rating 4 star and above from the left sidebar
 And he click on the first search result
 And he click 'Add to Cart' button
 Then he verify the text 'Added to Cart' is displayed
 And he click on 'Proceed to Buy' button
 Then he verify I am on the Sign in page
 And he close the browser

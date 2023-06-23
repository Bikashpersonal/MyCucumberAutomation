     Feature: Place the order for vegetables
     
     @Smoke
     Scenario Outline: Search experience for product search in both home and offer page
     
    Given User is on greenkart landing page
    When user searched with short name <Names> and extracted actual name of product
    And added "3" items of the selected product to cart
    Then user proceed to checkout and validate the <Names> items in checkout page
    And verify user has ability to enter promo code and place the order
   
Examples:
| Names      |
| Tomato     |
| Beetroot   |
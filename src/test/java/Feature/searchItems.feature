
     Feature: Search and place the order for vegetables 

     @Regression
     Scenario Outline: Title of your scenario
     Given User is on greenkart landing page
     When user searched with short name <Names> and extracted actual name of product
     Then user search for <Names> in offer page
     And Validate product name in offer page matches with the product name in landing page
   
Examples:
| Names      |
| Tomato     |
| Beetroot   |
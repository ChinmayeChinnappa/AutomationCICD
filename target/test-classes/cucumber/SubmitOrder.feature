
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file
	
	Background:
	Given I landed on Ecommerce page
	
  @Regression
  Scenario Outline: Postive test of submitting the order
    Given Logged in with username <name> and password <pass>
    When I  add product <productName> to cart
    And Checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

    Examples: 
      | name                        | pass	         | productName |
      | chinmayechinnu123@gmail.com | Chinmaye@13    | ZARA COAT 3 |
      | shetty@gmail.com            | Iamking@000    | ZARA COAT 3 |

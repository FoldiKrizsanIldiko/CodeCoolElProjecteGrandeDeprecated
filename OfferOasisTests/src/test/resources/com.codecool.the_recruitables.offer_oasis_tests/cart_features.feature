Feature: Cart features
  I can change the number of chosen items,
  I can place an order,
  I can clear my cart

  Background:
    Given I am logged in to browse cart
    And I have two items in my cart
    And I am on My CartInfo page

  Scenario: Increase the quantity of the product ordered
    When I increase the number of first item in my cart
    Then the total sum of my purchase is increased

  Scenario: Place Order
    When I press Place Order button
    Then all the products are deleted from cart
    And I am notified that I placed an order

  Scenario: Clear cart
    When I press Clear Cart button
    Then all the products are deleted from the cart
    And I am notified that I placed an order

    # separate feature?
  Scenario: Items remain available in cart
  After logging out and logging in again my cart has the same items
    When I click Logout button on navbar
    And I login again
    Then my cart have same two items as before








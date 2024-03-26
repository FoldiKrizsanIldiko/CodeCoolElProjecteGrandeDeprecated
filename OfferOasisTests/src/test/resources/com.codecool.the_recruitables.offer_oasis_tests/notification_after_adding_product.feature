Feature: Notification after adding item
  If I add a new product to my cart, I get a notification

  Background:
    Given I am logged in to add products to cart
    And I am on products page

  Scenario Outline: I can add one item to cart
    When I click on Add to Cart button below <product>
    Then I am notified that <product> is added to my cart

  Examples:
    | product            |
    | SmartPhone X       |
    | Laptop Pro         |
    | Coffe Maker Deluxe |

  # same scenario as before, but three times
  #Scenario:
    #Given I can browse products
    #When I click on add button on "third" product 3 times
    #Then I am notified that I added "third" product 3 times





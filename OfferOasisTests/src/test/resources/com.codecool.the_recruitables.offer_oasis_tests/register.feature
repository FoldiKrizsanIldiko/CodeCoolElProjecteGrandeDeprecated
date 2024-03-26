Feature: Register
  I want to register an account on Offer Oasis site

  Background:
    Given I am on registration page

  Scenario: I can register with valid data -TODO:
    When I type valid "email", "username" and "password" to form
    And I click the box to accept Terms and Conditions
    Then my registration is confirmed
    And I can login with "email" and "password"

  Scenario Outline: I can't register with invalid data -TODO:
    When I type <email>, <username> and <password> to form
    And I click the box to accept Terms and Conditions

    #should get different kinds of error messages?
    Then I got warning to fill out all fields

    Examples:
      | email         | username | password   |
      |               | Patrik   | SpongyaBob |
      | Tunyacsap@    |          | RakUr      |
      | Csigusz@cuki. | Plankton |            |








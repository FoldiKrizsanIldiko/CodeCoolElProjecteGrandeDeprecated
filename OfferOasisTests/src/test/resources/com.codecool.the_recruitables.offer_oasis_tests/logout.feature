@logout
Feature: Log out
  I want to log out from Offer Oasis

  Scenario: I can log out from Offer Oasis
    Given I am logged in
    When I click Logout button
    Then I am redirected to login page
    And I am not logged in

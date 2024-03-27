@login
Feature: Login
  I want to log in to Offer Oasis

  Background:
    Given I am on login page


  Scenario: Log in with valid credentials
    When I fill out the Your email field with valid email address
    And I fill out the Password field with valid password
    And I click on Login to your account button
    Then I can see that I am logged in

  Scenario Outline: : Log in with invalid credentials
    When I fill out the Your email field with invalid <email_address>
    And I fill out the Password field with invalid <password>
    And I click on Login to your account button
    Then error message appears


    Examples:
      | email_address      | password      |
      | adminaaa@admin.com | wrongPassword |
      | micimacko          | malacka       |
      | elsa@anna.com      | frozen        |
      | email@email.com    |               |


# Have to handle the empty inputs on Step Definition side? Do empty inputs count as invalid acc/pw?
  #Scenario: Log in with empty fields
   # Given the login page is opened
   # When I click on "Login to your accaunt" button
   # Then warning message appers





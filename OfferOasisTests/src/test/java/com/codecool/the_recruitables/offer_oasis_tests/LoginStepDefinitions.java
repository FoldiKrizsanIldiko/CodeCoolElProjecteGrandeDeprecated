package com.codecool.the_recruitables.offer_oasis_tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("I am on login page")
    public void iAmOnLoginPage() {
    }

    @When("I fill out the Your email field with valid email address")
    public void iFillOutTheYourEmailFieldWithValidEmailAddress() {
    }

    @And("I fill out the Password field with valid password")
    public void iFillOutThePasswordFieldWithValidPassword() {
    }

    @And("I click on Login to your account button")
    public void iClickOnLoginToYourAccountButton() {
    }

    @Then("I can see that I am Logged in as my username")
    public void iCanSeeThatIAmLoggedInAsMyUsername() {
    }

    @When("I fill out the Your email field with {}")
    public void iFillOutTheYourEmailFieldWithInvalidEmailAddress(String arg0) {
    }

    @And("I fill out the Password field with invalid {}")
    public void iFillOutThePasswordFieldWithInvalid(String arg0) {
    }

    @And("I click on Login to your account button")
    public void iClickOnButton(String arg0) {
    }

    @Then("error message appears")
    public void errorMessageAppears() {
    }
}

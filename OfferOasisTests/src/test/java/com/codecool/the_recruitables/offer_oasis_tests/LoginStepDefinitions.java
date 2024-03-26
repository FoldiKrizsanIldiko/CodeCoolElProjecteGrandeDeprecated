package com.codecool.the_recruitables.offer_oasis_tests;

import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.HomePage;
import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.LoginPage;
import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDefinitions {

    WebDriver chromedriver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(chromedriver);

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        loginPage.openLoginPage();
    }

    @When("I fill out the Your email field with valid email address")
    public void iFillOutTheYourEmailFieldWithValidEmailAddress() {
        loginPage.fillOut_emailField("admin@admin.com");
    }

    @And("I fill out the Password field with valid password")
    public void iFillOutThePasswordFieldWithValidPassword() {
        loginPage.fillOut_passwordField("admin123");
    }

    @And("I click on Login to your account button")
    public void iClickOnLoginToYourAccountButton() {
        loginPage.click_LoginButton();
    }

    @Then("I can see that I am logged in")
    public void iCanSeeThatIAmLoggedIn() {
        assertTrue(loginPage.verifyLogin().contains("Logged in as"));
    }

    @When("I fill out the Your email field with invalid {}")
    public void iFillOutTheYourEmailFieldWithInvalidEmailAddress(String arg0) {
    }

    @And("I fill out the Password field with invalid {}")
    public void iFillOutThePasswordFieldWithInvalid(String arg0) {
    }

    @Then("error message appears")
    public void errorMessageAppears() {
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) Utils.makeScreenshot(chromedriver, "Login");
        chromedriver.quit();
    }
}

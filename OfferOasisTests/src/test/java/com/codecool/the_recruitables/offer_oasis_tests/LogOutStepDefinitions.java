package com.codecool.the_recruitables.offer_oasis_tests;

import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.LoginPage;
import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.ProductsPage;
import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogOutStepDefinitions {

    public WebDriver chromedriver = new ChromeDriver();
    private final LoginPage loginPage = new LoginPage(chromedriver);

    @Given("I am logged in")
    public void iAmLoggedIn() {
        loginPage.loginAsAdmin();
    }

    @When("I click Logout button")
    public void iClickLogoutButton() {
        ProductsPage productsPage = new ProductsPage(chromedriver);
        productsPage.clickLogoutButton();
    }

    @Then("I am redirected to login page")
    public void iAmRedirectedToLoginPage() {
        assertTrue(loginPage.verifyPageURL());
    }

    @And("I am not logged in")
    public void iAmNotLoggedIn() {
        assertTrue(loginPage.hasLogoutButton_changedToLogin());
    }

    @After("@logout")
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            Utils.makeScreenshot(chromedriver, "logout");
        }
        chromedriver.quit();
    }
}

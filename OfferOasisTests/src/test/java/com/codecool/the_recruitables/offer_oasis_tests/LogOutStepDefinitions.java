package com.codecool.the_recruitables.offer_oasis_tests;

import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogOutStepDefinitions {

    public WebDriver chromedriver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(chromedriver, Duration.ofSeconds(15));

    @Given("I am logged in")
    public void iAmLoggedIn() {
        LoginPage loginPage = new LoginPage(chromedriver);
        loginPage.loginAsAdmin();
    }

    @When("I click Logout button")
    public void iClickLogoutButton() {
    }

    @Then("I am redirected to login page")
    public void iAmRedirectedToLoginPage() {
    }

    @And("I am not logged in")
    public void iAmNotLoggedIn() {
    }
}

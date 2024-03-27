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

public class NotificationAfterAddingProductStepDefinitions {
    WebDriver chromedriver = new ChromeDriver();
    ProductsPage productsPage = new ProductsPage(chromedriver);
    LoginPage loginPage = new LoginPage(chromedriver);

    @Given("I am logged in to add products to cart")
    public void iAmLoggedInToAddProductsToCart() {
        loginPage.loginAsAdmin();
    }

    @And("I am on products page")
    public void iAmOnProductsPage() {
        assertTrue(productsPage.verifySite());
    }

    @When("I click on Add to Cart button below {}")
    public void iClickOnAddToCartButtonBelow(String productName) {
        productsPage.addItemToCart(productName);
    }

    @Then("I am notified that {} is added to my cart")
    public void iAmNotifiedThatIsAddedToMyCart(String productName) {
        assertTrue(productsPage.ISeeToastForAddingToCart(productName));
        Utils.quitDriver(chromedriver);
    }
    @After("@notification")
    public void tearDown(){
        chromedriver.quit();
    }
}

package com.codecool.the_recruitables.offer_oasis_tests;

import com.codecool.the_recruitables.offer_oasis_tests.pageFactory.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartFeaturesStepDefinitions {
    WebDriver chromedriver = new ChromeDriver();

    @And("I have two items in my cart")
    public void iHaveTwoItemsInMyCart() {
    }

    @And("I am on My CartInfo page")
    public void iAmOnMyCartInfoPage() {
    }

    @When("I increase the number of first item in my cart")
    public void iIncreaseTheNumberOfFirstItemInMyCart() {
    }

    @Then("the total sum of my purchase is increased")
    public void theTotalSumOfMyPurchaseIsIncreased() {
        Utils.quitDriver(chromedriver);
    }

    @When("I press Place Order button")
    public void iPressPlaceOrderButton() {
    }

    @Then("all the products are deleted from cart")
    public void allTheProductsAreDeletedFromCart() {
    }

    @And("I am notified that I placed an order")
    public void iAmNotifiedThatIPlacedAnOrder() {
        Utils.quitDriver(chromedriver);
    }

    @When("I press Clear Cart button")
    public void iPressClearCartButton() {
    }

    @Then("all the products are deleted from the cart")
    public void allTheProductsAreDeletedFromTheCart() {
    }

    @And("I login again")
    public void iLoginAgain() {
    }

    @Then("my cart have same two items as before")
    public void myCartHaveSameTwoItemsAsBefore() {
        Utils.quitDriver(chromedriver);
    }

    @Given("I am logged in to browse cart")
    public void iAmLoggedInToBrowseCart() {
    }

    @When("I click Logout button on navbar")
    public void iClickLogoutButtonOnNavbar() {
    }
}

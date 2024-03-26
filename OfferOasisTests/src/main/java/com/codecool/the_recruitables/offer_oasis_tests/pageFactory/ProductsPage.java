package com.codecool.the_recruitables.offer_oasis_tests.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class ProductsPage {
    WebDriver chromedriver;
    WebDriverWait wait;
    @FindBy(xpath = "//div[@class='Toastify']/div/div/div/div")
    WebElement toast;
    String url = "http://localhost:3000/products";

    public ProductsPage(WebDriver driver) {
        this.chromedriver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(chromedriver, Duration.ofSeconds(10));
    }

    public boolean verifySite() {
        wait.until(ExpectedConditions.urlContains("products"));
        System.out.println(chromedriver.getCurrentUrl());
        return Objects.equals(chromedriver.getCurrentUrl(), url);
    }

    public void addItemToCart(String productName) {
        String xpath = String.format("//button[contains(@id, '%s')]", productName);
        WebElement addToCartButton = chromedriver.findElement(By.xpath(xpath));
        addToCartButton.click();
    }

    public boolean ISeeToastForAddingToCart(String productName) {
        wait.until(ExpectedConditions.visibilityOf(toast));
        return toast.getText().contains(productName);

    }
}

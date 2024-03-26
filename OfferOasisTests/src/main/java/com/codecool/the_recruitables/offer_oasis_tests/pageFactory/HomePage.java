package com.codecool.the_recruitables.offer_oasis_tests.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 WebDriver driver;

 @FindBy(id = "login_register_button")
    WebElement loginButton;

 public HomePage(WebDriver driver){
     this.driver=driver;
     PageFactory.initElements(driver, this);
 }

}

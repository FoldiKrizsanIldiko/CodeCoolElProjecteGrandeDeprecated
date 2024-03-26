package com.codecool.the_recruitables.offer_oasis_tests.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {
    WebDriver driver;

    public MyCartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
}

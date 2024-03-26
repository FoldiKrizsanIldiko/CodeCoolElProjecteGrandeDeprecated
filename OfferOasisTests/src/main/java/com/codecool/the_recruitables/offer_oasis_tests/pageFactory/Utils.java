package com.codecool.the_recruitables.offer_oasis_tests.pageFactory;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utils {

   static int pictureNum = 1;

    public static void makeScreenshot(WebDriver chromeDriver, String name) {
        File screenshot = ((TakesScreenshot) chromeDriver).getScreenshotAs(OutputType.FILE);
        String filename = String.format(".errorPicture/%s%d.png", name, pictureNum);
        try {
            FileUtils.copyFile(screenshot, new File(filename));
            pictureNum++;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

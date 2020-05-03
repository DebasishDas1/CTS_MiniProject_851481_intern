package com_java_methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Pages.addP;

public class Search {
    public static void headphones(WebDriver driver) {
        try {
            String item = ItemToSearch.Item();
            // writing headphones in search bar
            addP.HeadphonesSearch(driver).sendKeys(item);
            Screenshot.takeScreenShot(driver);
            // press enter
            addP.HeadphonesSearch(driver).sendKeys(Keys.ENTER);
        }
        catch (Exception e) {
            System.out.println("The error is : " + e);
        }
    }
}

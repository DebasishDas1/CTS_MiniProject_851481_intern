package com_java_methods;

import org.openqa.selenium.WebDriver;
import Pages.addP;

public class Lonch {
    public static void Flipkart(WebDriver driver) {
        try {
            //opening flipkart
            driver.get("https://www.flipkart.com/");
            Screenshot.takeScreenShot(driver);
            //maximizing the window size
            driver.manage().window().maximize();
            Thread.sleep(500);
            // close login window
            addP.LoginWindow(driver).click();
            // take snapshot
            Screenshot.takeScreenShot(driver);
        }
        catch (InterruptedException e ){
            System.out.println("The error is : " + e);
        }
    }
}


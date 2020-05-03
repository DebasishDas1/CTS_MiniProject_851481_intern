package com_java_main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainClass {
    @Test
    public static void StartChrome() {
        //setup driver
        WebDriver driver = com_java_methods.Chrome_setup.getChrome();
        // adding timeout to synchronize the code
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        // opening the flipkart website
        com_java_methods.Lonch.Flipkart(driver);
        // searching for headphones on flikart
        com_java_methods.Search.headphones(driver);
        // adding filters according to our need
        com_java_methods.add.filter(driver);
        //taking all the elements in the page
        com_java_methods.Open.items(driver);
        // moving to all the items window and get name , cost
        com_java_methods.MoveTo.items(driver);
        //closing all the windows
        driver.quit();
    }
    @Test(priority = 1)
    public static void startFirFox()  {
        //setup driver
        WebDriver driver = com_java_methods.FireFox_setup.getFireFox();
        // adding timeout to synchronize the code
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        // opening the flipkart website
        com_java_methods.Lonch.Flipkart(driver);
        // searching for headphones on flikart
        com_java_methods.Search.headphones(driver);
        // adding filters according to our need
        com_java_methods.add.filter(driver);
        //taking all the elements in the page
        com_java_methods.Open.items(driver);
        // moving to all the items window and get name , cost
        com_java_methods.MoveTo.items(driver);
        //closing all the windows
        driver.quit();
    }
}

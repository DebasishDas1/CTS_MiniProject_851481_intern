package com_java_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import Pages.addP;

import java.util.concurrent.TimeUnit;

public class add {
    public static void filter (WebDriver driver) {
        try {
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            Thread.sleep(500);
            // set minimum limit
            Select min = new Select(addP.Min(driver));
            min.selectByValue("500");
            Thread.sleep(500);
            // set maximum limit
            Select max = new Select(addP.Max(driver));
            max.selectByValue("1000");

            // as their is no option to chose a range between 700 to 1400 so this additional filter
            String old = driver.getCurrentUrl();
            String t = old.replace("500","700");
            String now = t.replace("1000","1400");
            driver.get(now);

            // checking Popularity
            Thread.sleep(500);
            addP.Popularity(driver).click();
        }
        catch (InterruptedException e) {
            System.out.println("The error is : " + e);
        }
    }
}

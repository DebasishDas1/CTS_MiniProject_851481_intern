package com_java_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Pages.addP;

import java.util.List;

public class Open {
    public  static void items(WebDriver driver) {
        try {
            // to loop through the rows
            for (int i = 2; i <3 ; i++) {
                List<WebElement> cols = addP.Column(driver, i);
                // to loop through the cells
                for (int j = 1; j <= cols.size(); j++) {
                    // go to the particular item
                    WebElement A = addP.Item(driver, i, j);
                    // open the link
                    A.findElement(By.tagName("a")).click();
                }
            }
            WebElement e = addP.Item(driver, 3, 1);
            e.findElement(By.tagName("a")).click();
        }
        catch (Exception e) {
            System.out.println("The error is : " + e);
        }
    }
}

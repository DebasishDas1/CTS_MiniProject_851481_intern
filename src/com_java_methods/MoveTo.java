package com_java_methods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import Pages.addP;

public class MoveTo {
    public static void items(WebDriver driver) {
        // make two ArrayList to store name and cost of the items
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> cost = new ArrayList<String>();
        // getting all the address of the window that is open
        Set<String> yo = driver.getWindowHandles();
        // Adding Iterator to move through all the window
        Iterator<String> it = yo.iterator();
        // taking Screenshot of the catalog page
        Screenshot.takeScreenShot(driver);
        it.next();
        // moving through all the other website
        while (it.hasNext()) {
            // moving to next window
            driver.switchTo().window(it.next());
            // taking Screenshot of all the other window
            Screenshot.takeScreenShot(driver);
            // adding the values to ArrayList
            name.add(addP.Name(driver).getText());
            cost.add(addP.Cost(driver).getText());
            // sending the values to store in excel
            AddToExcel.items(name, cost);
        }
    }
}

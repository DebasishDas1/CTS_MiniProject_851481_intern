package com_java_methods;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    static int c = 0 ;
    public static void takeScreenShot(WebDriver D) {
        try {
            c += 1;
            //taking  Screenshot
            File f = ((TakesScreenshot) D).getScreenshotAs(OutputType.FILE);
            //coping it
            FileUtils.copyFile(f, new File("src/Screenshot/" + c + ".jpg"));
        }
        catch (IOException e ) {
            System.out.println("The error is : " + e);
        }
    }
}

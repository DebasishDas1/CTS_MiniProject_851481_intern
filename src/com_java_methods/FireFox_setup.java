package com_java_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_setup {
    public static WebDriver getFireFox() {
        System.setProperty("webdriver.gecko.driver","src/FireFoxDriver/geckodriver");
        return new FirefoxDriver();
    }
}

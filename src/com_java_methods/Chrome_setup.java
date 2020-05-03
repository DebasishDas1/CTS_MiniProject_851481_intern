package com_java_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_setup {
    public static  WebDriver getChrome() {
        System.setProperty("webdriver.chrome.driver", "src/ChromeDriver/chromedriver");
        return new ChromeDriver();
    }
}

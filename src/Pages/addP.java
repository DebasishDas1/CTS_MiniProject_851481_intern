package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class addP {
    public static WebElement Min(WebDriver driver) {
        return driver.findElement(By.xpath("//div[@class='_1qKb_B']//select[@class='fPjUPw']"));
    }
    public static WebElement Max (WebDriver driver) {
        return driver.findElement(By.xpath("//div[@class='_1YoBfV']//select[@class='fPjUPw']"));
    }
    public static WebElement Popularity (WebDriver driver) {
        return driver.findElement(By.xpath("//div[contains(text(),'Popularity')]"));
    }
    public static WebElement LoginWindow (WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
    }
    public static WebElement HeadphonesSearch (WebDriver driver) {
        return driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
    }
    public static WebElement Name (WebDriver driver) {
        String n = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/h1[1]/span[1]";
        return driver.findElement(By.xpath(n));
    }
    public static WebElement Cost (WebDriver driver) {
        String c = "/html/body/div[1]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div[1]";
        return driver.findElement(By.xpath(c));
    }
    public static List<WebElement> Column (WebDriver driver, int i) {
        String c = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]";
        return driver.findElements(By.xpath(c + "/div[" + i + "]/div[1]/div"));
    }
    public static WebElement Item (WebDriver driver , int i , int j) {
        String c = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]";
        return driver.findElement(By.xpath(c + "/div[" + i + "]/div[1]/div[" + j + "]/div[1]"));
    }
}

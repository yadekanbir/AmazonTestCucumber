package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverFactory {
    public static WebDriver driver;

    public static void setDriver() {
        driver = new ChromeDriver();
        driver.get("https://amazon.com.tr");
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

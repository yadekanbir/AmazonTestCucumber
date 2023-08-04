package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class elementHelper {
    WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor js;

    public elementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    public static WebElement findElement(By by) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static List<WebElement> findElements(By by) {
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        js.executeScript("arguments[0].scrollIntoView(true);", elements.get(0));
        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void click(By by) {
        wait.until(ExpectedConditions.titleContains(""));
        findElement(by).click();
    }

    public static String getText(By by) {
        return findElement(by).getText();
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void clickElementsWithText(By by, String text) {
        List<WebElement> elements = findElements(by);
        for (WebElement elem : elements) {
            if (elem.getText().equals(text)) {
                elem.click();
                break;
            }
        }
    }

    public void checkElementsWithText(By by, String text) {
        boolean check = false;
        List<WebElement> elements = findElements(by);
        for (WebElement elem : elements) {
            if (elem.getText().equals(text)) {
                check = true;
                break;
            }
        }
        Assert.assertTrue(check);
    }

    public void checkTitle(String text) {
        wait.until(ExpectedConditions.titleIs(text));
    }

}

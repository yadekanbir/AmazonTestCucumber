package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.elementHelper;

import java.util.List;

public class HomePage {
    WebDriver driver;
    elementHelper elementHelper;
    By loginBtn = By.id("nav-link-accountList");
    By searchItem = By.id("twotabsearchtextbox");

    By dropdownMenu = By.id("nav-search-dropdown-card");

    By dropdownItems = By.cssSelector("select option");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new elementHelper(driver);
    }

    public void checkHomePage(String text) {
        elementHelper.checkTitle(text);
    }

    public void clickLoginButton() {
        driver.findElement(By.id("sp-cc-rejectall-link")).click();
        elementHelper.click(loginBtn);
    }

    public void searchItem(String item) {
        elementHelper.click(searchItem);
        elementHelper.sendKeys(searchItem, item);
        elementHelper.sendKeys(searchItem, String.valueOf(Keys.ENTER));
    }

    public void clickTheListOnHomePage() {
        elementHelper.click(dropdownMenu);
    }

    public void selectTheCategoryOnHomePage(String category) {
        elementHelper.clickElementsWithText(dropdownItems,category);
    }
}

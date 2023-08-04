package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.elementHelper;

public class BasketPage {
    WebDriver driver;
    utils.elementHelper elementHelper;
    By deleteProductFromBasket = By.cssSelector("[value='Sil']");
    By accountAndLists = By.id("nav-link-accountList");
    By list = By.cssSelector("[data-card-identifier='YourLists'] .a-color-secondary");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new elementHelper(driver);
    }

    public void deleteFromBasket() {
        elementHelper.click(deleteProductFromBasket);
    }

    public void viewWishList() {
        elementHelper.click(accountAndLists);
        elementHelper.click(list);
    }
}

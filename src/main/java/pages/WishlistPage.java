package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.elementHelper;

public class WishlistPage {
    elementHelper elementHelper;
    By addToCartBtn = By.cssSelector(".a-button.a-button-normal.a-button-primary.a-button-icon.wl-info-aa_add_to_cart");
    By cart = By.id("nav-cart-count-container");
    By deleteProductFromWishList = By.name("submit.deleteItem");

    public WishlistPage(WebDriver driver) {
        elementHelper = new elementHelper(driver);
    }

    public void addToCart() {
        elementHelper.click(addToCartBtn);
    }

    public void viewCart() {
        elementHelper.click(cart);
    }

    public void deleteFromWishlist() {
        elementHelper.click(deleteProductFromWishList);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.elementHelper;
public class ProductDetailPage {
    WebDriver driver;
    elementHelper elementHelper;
    By addWishListBtn = By.id("wishListMainButton");
    By wishList = By.id("huc-view-your-list-button");
    public  ProductDetailPage(WebDriver driver){
        this.driver = driver;
        elementHelper = new elementHelper(driver);
    }
    public void addToWishlist(){
        elementHelper.click(addWishListBtn);
    }
    public void viewWishlist(){
        elementHelper.click(wishList);
    }
}

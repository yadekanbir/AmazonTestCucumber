package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.WishlistPage;
import utils.driverFactory;
import utils.elementHelper;

public class WishlistPageSteps {
    WishlistPage wishlistPage = new WishlistPage(driverFactory.getDriver());

    @When("add product to cart on Wishlist Page")
    public void userAddProductToCart() {
        wishlistPage.addToCart();
    }

    @When("go to cart on Wishlist Page")
    public void userViewTheCart() {
        wishlistPage.viewCart();
    }

    @When("delete product from wishList on Wishlist Page")
    public void userDeleteProductFromWishList() {
        wishlistPage.deleteFromWishlist();
    }

    @Then("should see the Wishlist Page")
    public void userCheckIsInTheWishlist() {
        String listText = elementHelper.getText(By.id("profile-list-name"));
        Assert.assertEquals(listText, "Alışveriş Listesi");
    }
}

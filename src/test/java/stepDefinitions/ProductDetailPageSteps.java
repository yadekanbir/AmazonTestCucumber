package stepDefinitions;

import io.cucumber.java.en.When;

import pages.ProductDetailPage;
import utils.driverFactory;

public class ProductDetailPageSteps {
    ProductDetailPage productDetailPage = new ProductDetailPage(driverFactory.getDriver());

    @When("add product to wishlist on Product Detail Page")
    public void userAddProductToWishlist() {
        productDetailPage.addToWishlist();
    }

    @When("go to wishlist on Product Detail Page")
    public void userViewTheWishlist() {
        productDetailPage.viewWishlist();
    }
}

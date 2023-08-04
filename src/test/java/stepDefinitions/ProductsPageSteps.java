package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductsPage;
import utils.driverFactory;

import static utils.driverFactory.driver;

public class ProductsPageSteps {
    ProductsPage productsPage = new ProductsPage(driverFactory.getDriver());

    @When("choose the product on Products Page")
    public void userChooseTheProduct() {
        productsPage.chooseTheProduct();
    }

    @Then("should see Title: {string} on Products Page")
    public void userCheckTheProductsPage(String expectedTitle) {
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle, expectedTitle);
    }
}

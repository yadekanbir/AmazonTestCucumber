package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.BasketPage;
import utils.driverFactory;
import utils.elementHelper;

public class BasketPageSteps {
    BasketPage basketPage = new BasketPage(driverFactory.getDriver());

    @When("delete product from basket on Basket Page")
    public void userDeleteProductFromBasket() {
        basketPage.deleteFromBasket();
    }

    @When("go to wishList on Basket Page")
    public void userViewTheWishList() {
        basketPage.viewWishList();
    }

    @Then("should see the product is delete from basket on Basket Page")
    public void checkTheProductIsDeleteFromBasket() {
        String isDelete = elementHelper.getText(By.xpath("//h1[@class='a-spacing-mini a-spacing-top-base']"));
        Assert.assertEquals(isDelete, "Amazon sepetiniz boş.");
    }

    @Then("should see the Basket Page")
    public void userCheckTheBasketPage() {
        String ActualTitle = driverFactory.driver.getTitle();
        String ExpectedTitle = "Amazon.com.tr Alışveriş Sepeti";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }
}

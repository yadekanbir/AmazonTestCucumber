package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import utils.driverFactory;

public class HomePageSteps {
    HomePage homePage = new HomePage(driverFactory.getDriver());

    @Given("User is on the Home Page")
    public void userIsOnTheHomePage() {
        String ExpectedTitle = "Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        homePage.checkHomePage(ExpectedTitle);
    }

    @When("click the Login Button on Home Page")
    public void userClickTheLoginButton() {
        homePage.clickLoginButton();
    }

    @Then("should see the Home Page")
    public void userCheckTheHomepage() {
        String ExpectedTitle = "Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        homePage.checkHomePage(ExpectedTitle);
    }

    @When("type product {string} on Home Page")
    public void typeProductOnHomePage(String item) {
        homePage.searchItem(item);
    }

    @When("click the list on Home Page")
    public void clickTheListOnHomePage() {
        homePage.clickTheListOnHomePage();
    }

    @When("select category: {string} on Home Page")
    public void selectTheCategoryOnHomePagee(String category) {
        homePage.selectTheCategoryOnHomePage(category);
    }
}


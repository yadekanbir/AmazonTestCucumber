package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utils.driverFactory;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage(driverFactory.getDriver());

    @When("click Email Button on Login Page")
    public void userClickTheEmailButton() {
        loginPage.clickEmailButton();
    }

    @When("type email {string} on Login Page")
    public void typeEmail(String email) {
        loginPage.fillTheEmailBox(email);
    }

    @When("click the Continue Button on Login Page")
    public void userClickTheContinueButton() {
        loginPage.clickTheContinueBtn();
    }

    @When("type password {string} on Login Page")
    public void typePassword(String password) {
        loginPage.userFillThePasswordBox(password);
    }

    @When("click the Sign In Button on Login Page")
    public void userClickTheSignInButton() {
        loginPage.clickSignInBtn();
    }

    @Then("should see the Login Page")
    public void userCheckTheLoginPage() {
        String ActualTitle = driverFactory.driver.getTitle();
        String expectedTitle = "Amazon Giriş Yap";
        Assert.assertEquals(ActualTitle, expectedTitle);
    }
}

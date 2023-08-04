package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.elementHelper;

public class LoginPage {
    WebDriver driver;
    elementHelper elementHelper;
    By emailText = By.id("ap_email");
    By continueBtn = By.id("continue");
    By passwordText = By.id("ap_password");
    By signInBtn = By.id("signInSubmit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new elementHelper(driver);
    }

    public void clickEmailButton() {
        elementHelper.click(emailText);
    }

    public void fillTheEmailBox(String email) {
        elementHelper.sendKeys(emailText, email);
    }

    public void clickTheContinueBtn() {
        elementHelper.click(continueBtn);
    }

    public void userFillThePasswordBox(String password) {
        elementHelper.click(passwordText);
        elementHelper.sendKeys(passwordText, password);
    }

    public void clickSignInBtn() {
        elementHelper.click(signInBtn);
    }
}

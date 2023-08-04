package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.elementHelper;

public class ProductsPage {
    WebDriver driver;
    elementHelper elementHelper;
    By product = By.xpath("//*[@class = 's-image'][1]");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new elementHelper(driver);
    }

    public void chooseTheProduct() {
        elementHelper.click(product);
    }
}

package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazUAOffersPageWebElements extends BasePage {

    public ZakazUAOffersPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement viewAllBtn() {
        return getElementByXpath("//a[@data-marker='View all']");
    }

    public WebElement pineappleLoradoItem() {
        return getElementByXpath("//a[@data-productkey='04008638111019']");
    }

    public WebElement addToCartBtn() {
        return getElementByXpath("//button[@class='jsx-44091497 btn btn-default AddButton AddButton_fullWidth'][@data-marker='Add to cart']");
    }
}

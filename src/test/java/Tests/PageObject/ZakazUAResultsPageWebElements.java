package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazUAResultsPageWebElements extends BasePage {
    public ZakazUAResultsPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement jagermeister07l() {
        return getElementByXpath("//img[@alt='Лікер Jagermeister 35% 0,7л']");
    }

    public WebElement antisepticSaniSilver460ml() {
        return getElementByXpath("//a[@title='Засіб Sani Silver антисептичний універсальний 460мл']");
    }

    public WebElement addToCartBtn() {
        return getElementByXpath("//button[@class='jsx-44091497 btn btn-default AddButton AddButton_fullWidth'][@data-marker='Add to cart']");
    }
}

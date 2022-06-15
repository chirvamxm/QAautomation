package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaItemPageElements extends BasePage {
    public RozetkaItemPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement addToCartBtn() {
        return getElementByXpath("//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']");
    }

    public WebElement addOneItemBtn() {
        return getElementByXpath("//button[@aria-label='Добавить ещё один товар']");
    }

    public WebElement continueShoppingBtn() {
        return getElementByXpath("//button[@data-testid='continue-shopping-link']");
    }
}

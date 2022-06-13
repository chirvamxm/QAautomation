package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazUaCategoriesPageWebElements extends BasePage{
    public ZakazUaCategoriesPageWebElements(WebDriver driver) {
        super(driver);
    }
    // personal hygiene
    public WebElement antiseptics() {
        return getElementByXpath("//a[@data-testid='nestedListItemLink'][@href='/uk/categories/antiseptics-megamarket/']");
    }
}

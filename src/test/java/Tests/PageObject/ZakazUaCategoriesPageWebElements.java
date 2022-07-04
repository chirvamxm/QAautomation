package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ZakazUaCategoriesPageWebElements extends BasePage {
    public ZakazUaCategoriesPageWebElements(WebDriver driver) {
        super(driver);
    }

    // personal hygiene
    public WebElement antiseptics() {
        return getElementByXpath("//a[@data-testid='nestedListItemLink'][@href='/uk/categories/antiseptics-megamarket/']");
    }

    public List<WebElement> getYogurtBtn() {
        return getElementsByXpath("//a[@href='/uk/categories/yogurt-megamarket/']");
    }
}


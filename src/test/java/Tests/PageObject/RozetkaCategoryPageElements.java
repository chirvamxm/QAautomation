package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaCategoryPageElements extends BasePage {
    public RozetkaCategoryPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement gamerTables() {
        return getElementByXpath("//img[@alt='Геймерские столы']");
    }

}

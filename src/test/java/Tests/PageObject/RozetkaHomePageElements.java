package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePageElements extends BasePage {
    public RozetkaHomePageElements(WebDriver driver) {
        super(driver);
    }

    //header
    public WebElement searcLink() {
        return getElementByXpath("//input[@name='search']");
    }

    //catalogue
    public WebElement forGamers() {
        return getElementByXpath("//a[@class='menu-categories__link'][@href='https://rozetka.com.ua/game-zone/c80261/']");
    }

}

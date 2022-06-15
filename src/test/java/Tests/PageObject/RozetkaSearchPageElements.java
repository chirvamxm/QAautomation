package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaSearchPageElements extends BasePage {
    public RozetkaSearchPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement confimAgeBtn() {
        return getElementByXpath("//a[@class='btn-link-i exponea-close']");
    }

    public WebElement coronaBoxOfBeer() {
        return getElementByXpath("//*[text()=' Упаковка пива Corona Extra светлое фильтрованное 4.5% 0.355 л x 24 шт (7501064191459) ']");
    }

    public WebElement colaBoxOfan() {
        return getElementByXpath("*//a[@title='Упаковка безалкогольного сильногазированного бескалорийного напитка Coca-Cola Zero 250 мл х 12 шт (5449000106469) ']");
    }

    public WebElement laysOriginalRecipe() {
        return getElementByXpath("//div[@data-goods-id='315110275']");
    }
}

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
    public WebElement addKyivmarket() {
        return getElementByXpath("//div[@class='jsx-2819847497 Radio']");
    }
    // Sorting

    public WebElement addExpenciveBtn(){
        return getElementByXpath("//button[@data-marker='price_desc']");
    }
    public WebElement addCheapBtn(){
        return getElementByXpath("//button[@data-marker='price_asc']");
    }
    public WebElement addPopularBtn(){
        return getElementByXpath("//button[@data-marker='popularity_desc']");
    }
    // Items
    public WebElement actimelStrawberries(){
        return getElementByXpath("//a[@data-productkey='05410146415623']");
    }
    public WebElement funnyCherry(){
        return getElementByXpath("//a[@data-productkey='04823065717173']");
    }
    public WebElement organicMilkRaspberry(){
        return getElementByXpath("//a[@data-productkey='04820178810906']");
    }

}

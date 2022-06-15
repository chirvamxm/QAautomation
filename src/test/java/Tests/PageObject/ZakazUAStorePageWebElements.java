package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazUAStorePageWebElements extends BasePage {

    public ZakazUAStorePageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement pickAddressBtn() {
        return getElementByXpath("//div[@data-marker='Address']");
    }

    public WebElement searchField() {
        return getElementByXpath("//input[@type='search']");
    }

    public WebElement pickUpDeliveryTypeBtn() {
        return getElementByXpath("//li[@data-testid='deliveryType_pickup']");
    }

    public WebElement novaPoshtaDeliveryTypeBtn() {
        return getElementByXpath("//li[@data-testid='deliveryType_novaPoshta']");
    }

    public WebElement alertMessage() {
        return getElementByXpath("//*[contains(text(),'Ми не відправляємо Новою Поштою швидкопсувні продукти, алкоголь і тютюн')][@role='alert']");
    }

    public WebElement locationField() {
        return getElementByXpath("//div[@data-marker='Locality']");
    }

    public WebElement locationRegionKyivNovus() {
        return getElementByXpath("//div[contains(@class, 'RegionSelect__option')][contains(text(), 'Київ')]");
    }

    public WebElement locationKyivNovusStoreOnKilceva() {
        return getElementByXpath("//input[@id='pickup-city-store-48201029']");
    }

    public WebElement toShoppingBtn() {
        return getElementByXpath("//button[@data-testid='To shopping']");
    }

    public WebElement toOrderBtn() {
        return getElementByXpath("//button[@data-marker='Order']");
    }

    public WebElement specialOfferVievAllBtn() {
        return getElementByXpath("//a[@href='/uk/categories/special-offer-all-novus/'][@data-marker='View all']");
    }

    public WebElement cartBtn() {
        return getElementByXpath("//button[@data-testid='cart_button']");
    }

    public WebElement closeItemBtn() {
        return getElementByXpath("//button[@data-testid='GeneralModal__close']");
    }

    public WebElement confimAgeYesBtn() {
        return getElementByXpath("//button[@data-testid='buttonYes']");
    }

    public WebElement cityNPField() {
        return getElementByXpath("//div[@class='SelectStyled__value-container css-1hwfws3']");
    }
// Catalogue


    public WebElement promotionsBtn() {
        return getElementByXpath("//li[@title='Товари зі знижкою']");
    }

    public WebElement bakeryBtn() {
        return getElementByXpath("//li[@title='Пекарня']");
    }

    public WebElement fruitAndVegitablesBtn() {
        return getElementByXpath("//li[@title='Фрукти та овочі']");
    }

    public WebElement dairyAndEggsBtn() {
        return getElementByXpath("//li[@title='Молочне і яйця']");
    }

    public WebElement meatAndFishBtn() {
        return getElementByXpath("//a[@href='/uk/categories/meat-fish-poultry-megamarket/']");
    }

    public WebElement readyMealsBtn() {
        return getElementByXpath("//li[@title='Кулінарія']");
    }

    public WebElement frozenBtn() {
        return getElementByXpath("//li[@title='Заморозка']");
    }

    public WebElement groceryBtn() {
        return getElementByXpath("//li[@title='Бакалія']");
    }

    public WebElement snacksAndSweetsBtn() {
        return getElementByXpath("//li[@title='Солодощі, чіпси, снеки']");
    }

    public WebElement drinksBtn() {
        return getElementByXpath("//li[@title='Напої']");
    }

    public WebElement alcoholBtn() {
        return getElementByXpath("//li[@title='Алкоголь']");
    }

    public WebElement tobaccoGoodsBtn() {
        return getElementByXpath("//li[@title='Тютюнові вироби']");
    }

    public WebElement babiesBtn() {
        return getElementByXpath("//li[@title='Дитяче']");
    }

    public WebElement chemicalsBtn() {
        return getElementByXpath("//li[@title='Побутова хімія']");
    }

    public WebElement personalHygieneBtn() {
        return getElementByXpath("//a[@href='/uk/categories/personal-hygiene-megamarket/']");
    }

    public WebElement cosmeticsAndCareBtn() {
        return getElementByXpath("//li[@title='Косметика та догляд']");
    }

    public WebElement houseGoodsBtn() {
        return getElementByXpath("//li[@title='Товари для дому']");
    }

    public WebElement kitchenWareBtn() {
        return getElementByXpath("//li[@title='Кухня']");
    }

    public WebElement hobbyAndRestBtn() {
        return getElementByXpath("//li[@title='Хобі та відпочинок']");
    }

    public WebElement interiorAndTextilesBtn() {
        return getElementByXpath("//a[@href='/uk/categories/interior-and-textiles-megamarket/']");
    }

    public WebElement stationeryBtn() {
        return getElementByXpath("//li[@title='Канцелярія']");
    }

    public WebElement forAnimalsBtn() {
        return getElementByXpath("//li[@title='Товари для тварин']");
    }

    public WebElement shoesAndClothesBtn() {
        return getElementByXpath("//li[@title='Одяг та взуття']");
    }


}

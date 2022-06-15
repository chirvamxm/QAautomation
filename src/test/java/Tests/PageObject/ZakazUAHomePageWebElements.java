package Tests.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazUAHomePageWebElements extends BasePage {
    public ZakazUAHomePageWebElements(WebDriver driver) {
        super(driver);
    }


    // HEADER
    public WebElement getZakazLogo() {
        return getElementByXpath("//img[@alt='Zakaz logo']");
    }

    public WebElement selectLanguageBtn() {
        return getElementByXpath("//div[@class='jsx-2339030531 switch-locale switch-locale_desktop']");
    }

    public WebElement partnersBtn() {
        return getElementByXpath("//div[@class='jsx-2339030531 switch-locale switch-locale_desktop']");
    }

    public WebElement partners4BusinessBtn() {
        return getElementByXpath("//a[@href='https://b2b.zakaz.ua/uk/'][@class='jsx-1112415212 Menu__link']");
    }

    public WebElement partners4Brands() {
        return getElementByXpath("//a[@href='https://forbrand.zakaz.ua/uk/'][@class='jsx-1112415212 Menu__link']");
    }

    public WebElement partners4Suppliers() {
        return getElementByXpath("//a[@href='http://content.zakaz.ua/uk/'][@class='jsx-1112415212 Menu__link']");
    }

    public WebElement vacanciesBtn() {
        return getElementByXpath("//a[@data-marker='Link Vacancies Header']");
    }

    public WebElement helpBtn() {
        return getElementByXpath("//a[@href='/uk/help/'][@class='jsx-1112415212 Menu__link']");
    }

    public WebElement contactsBtn() {
        return getElementByXpath("//a[@href='/uk/contacts/'][@class='jsx-1112415212 Menu__link']");
    }

    public WebElement chooseStoreBtn() {
        return getElementByXpath("//div[@class='jsx-3617752486 Header__chooseStore']");
    }

    public WebElement donateZSUBtn() {
        return getElementByXpath("//a[@class='jsx-1383361387 ZsuHelp__donateButton']");
    }

    // FOOTER

    public WebElement getZakaznumber() {
        return getElementByXpath("//a[@href='tel:0800 20 20 20']");
    }

    public WebElement getZakazEmail() {
        return getElementByXpath("//a[@href='tel:help@zakaz.ua']");
    }

    public WebElement getZakazInstagramPage() {
        return getElementByXpath("//a[@class='jsx-1671088313 SocialItem SocialItem_instagram']");
    }

    public WebElement getZakazFacebookPage() {
        return getElementByXpath("//a[@class='jsx-1671088313 SocialItem SocialItem_facebook']");
    }

    public WebElement getZakazLinkedinPage() {
        return getElementByXpath("//a[@class='jsx-1671088313 SocialItem SocialItem_linkedIn']");
    }

    public WebElement forBusinesessbtn() {
        return getElementByXpath("//a[@href='https://b2b.zakaz.ua/uk/'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement forPartnersbtn() {
        return getElementByXpath("//a[@href='https://forbrand.zakaz.ua/uk/'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement forSuppliersBtn() {
        return getElementByXpath("//a[@href='http://content.zakaz.ua/uk/'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement vacanciesFooterBtn() {
        return getElementByXpath("//a[@href='https://hr.zakaz.ua'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement allProductsBtn() {
        return getElementByXpath("//a[@href='/products'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement helpFooterBtn() {
        return getElementByXpath("//a[@href='/uk/help/'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement contactsFooterBtn() {
        return getElementByXpath("//a[@href='/uk/contacts/'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement policyBtn() {
        return getElementByXpath("//a[@href='/uk/policy/'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement termsBtn() {
        return getElementByXpath("//a[@href='/uk/terms/'][@class='jsx-1327893773 Footer__navigationLink']");
    }

    public WebElement facebookPageFooterBtn() {
        return getElementByXpath("//a[@href='/uk/terms/'][@class='jsx-1327893773 Footer__navigationLink']");
    }


// StoresSection

    public WebElement localitySearchLink() {
        return getElementByXpath("//input[@data-testid='localityInput']");
    }

    public WebElement ecoMarketIcon() {
        return getElementByXpath("//img[@alt='EKO']");
    }

    public WebElement novusIcon() {
        return getElementByXpath("//img[@alt='NOVUS']");
    }

    public WebElement vostorgIcon() {
        return getElementByXpath("//img[@alt='Восторг']");
    }

    public WebElement ashanIcon() {
        return getElementByXpath("//img[@alt='Auchan']");
    }

    public WebElement megaMarketIcon() {
        return getElementByXpath("//img[@alt='MegaMarket']");
    }

    public WebElement ultraMarketIcon() {
        return getElementByXpath("//img[@alt='Ultramarket']");
    }

    public WebElement bdjilkaIcon() {
        return getElementByXpath("//img[@alt='Пчелка']");
    }

    public WebElement varusIcon() {
        return getElementByXpath("//img[@alt='Varus']");
    }

    public WebElement cosmosIcon() {
        return getElementByXpath("//img[@alt='Космос']");
    }

    public WebElement tavriyaIcon() {
        return getElementByXpath("//img[@alt='Таврія В']");
    }
    //App Section

    public WebElement googlePlayApp() {
        return getElementByXpath("//img[@src='/static/images/google-play-green.svg']");
    }

    public WebElement appStoreApp() {
        return getElementByXpath("//img[@src='/static/images/app-store-green.svg']");
    }
}

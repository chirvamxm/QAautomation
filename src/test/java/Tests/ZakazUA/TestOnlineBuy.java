package Tests.ZakazUA;

import PageObject.*;
import Tests.PageObject.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnlineBuy extends TestInit{

    @Test
    public void onlineBuy(){

        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);
        ZakazUAStorePageWebElements zakazUAStorePageWebElements =new ZakazUAStorePageWebElements(driver);
        ZakazUaCategoriesPageWebElements zakazUaCategoriesPageWebElements=new ZakazUaCategoriesPageWebElements(driver);
        ZakazUAResultsPageWebElements zakazUAResultsPageWebElements=new ZakazUAResultsPageWebElements(driver);
        ZakazUaOrderPageWebElements zakazUaOrderPageWebElements=new ZakazUaOrderPageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        zakazUAHomePageWebElements.megaMarketIcon().click();
        zakazUAStorePageWebElements.personalHygieneBtn().click();
        zakazUaCategoriesPageWebElements.antiseptics().click();
        zakazUAResultsPageWebElements.antisepticSaniSilver460ml().click();
        zakazUAResultsPageWebElements.addToCartBtn().click();
        zakazUAStorePageWebElements.pickUpDeliveryTypeBtn().click();
        zakazUAStorePageWebElements.toShoppingBtn().click();
        zakazUAStorePageWebElements.cartBtn().click();
        zakazUAStorePageWebElements.toOrderBtn().click();
        zakazUaOrderPageWebElements.logInField().click();
        zakazUaOrderPageWebElements.logInField().sendKeys("+380637444757");
        zakazUaOrderPageWebElements.passwordField().click();
        zakazUaOrderPageWebElements.passwordField().sendKeys("12345qwerty");
        zakazUaOrderPageWebElements.signInBtn().click();
        Assert.assertTrue(zakazUaOrderPageWebElements.getOrderBtn().isDisplayed());














    }
}

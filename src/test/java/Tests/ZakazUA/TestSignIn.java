package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import Tests.PageObject.ZakazUAStorePageWebElements;
import Tests.PageObject.ZakazUaOrderPageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignIn extends TestInit{

    @Test
    public void testSignIn(){
        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);
        ZakazUAStorePageWebElements zakazUAStorePageWebElements=new ZakazUAStorePageWebElements(driver);
        ZakazUaOrderPageWebElements zakazUaOrderPageWebElements=new ZakazUaOrderPageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        zakazUAHomePageWebElements.megaMarketIcon().click();
        zakazUaOrderPageWebElements.getSignInBtn().get(0).click();
        zakazUaOrderPageWebElements.logInField().click();
        zakazUaOrderPageWebElements.logInField().sendKeys("+380637444757");
        zakazUaOrderPageWebElements.passwordField().click();
        zakazUaOrderPageWebElements.passwordField().sendKeys("12345qwerty");
        zakazUaOrderPageWebElements.getSignInBtn().get(2).click();
        Assert.assertTrue(zakazUAStorePageWebElements.getAccountBtn().isDisplayed());

    }
}

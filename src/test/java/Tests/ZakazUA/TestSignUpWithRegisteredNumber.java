package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import Tests.PageObject.ZakazUaOrderPageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSignUpWithRegisteredNumber extends TestInit{

    @Test
    public void testSignUpWithRegisteredNumber(){

        ZakazUaOrderPageWebElements zakazUaOrderPageWebElements=new ZakazUaOrderPageWebElements(driver);
        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        zakazUAHomePageWebElements.megaMarketIcon().click();
        zakazUaOrderPageWebElements.getSignInBtn().get(0).click();
        zakazUaOrderPageWebElements.registrationBtn().click();
        zakazUaOrderPageWebElements.getRegistrationField().click();
        zakazUaOrderPageWebElements.getRegistrationField().sendKeys("637444757\n");
        Assert.assertTrue(zakazUaOrderPageWebElements.registrationAlertMessage().isDisplayed());


    }
}

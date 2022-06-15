package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import Tests.PageObject.ZakazUAResultsPageWebElements;
import Tests.PageObject.ZakazUAStorePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBuyAlcoholDeliveryTypeNP extends TestInit {


    @Test
    public void zakazUA(){

        ZakazUAHomePageWebElements zakazUAHomePageWebElements =new ZakazUAHomePageWebElements(driver);
        ZakazUAStorePageWebElements zakazUAStorePageWebElements =new ZakazUAStorePageWebElements(driver);
        ZakazUAResultsPageWebElements zakazUAResultsPageWebElements=new ZakazUAResultsPageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        zakazUAHomePageWebElements.ecoMarketIcon().click();
        zakazUAStorePageWebElements.searchField().click();
        zakazUAStorePageWebElements.searchField().sendKeys("Jagermeister \n");
        zakazUAStorePageWebElements.confimAgeYesBtn().click();
        zakazUAResultsPageWebElements.jagermeister07l().click();
        zakazUAResultsPageWebElements.addToCartBtn().click();
        zakazUAStorePageWebElements.novaPoshtaDeliveryTypeBtn().click();
        Assert.assertTrue(zakazUAStorePageWebElements.alertMessage().isDisplayed());






    }
}

package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStoreSection extends TestInit{
    @Test
    public void testStoreSection(){

        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        Assert.assertTrue(zakazUAHomePageWebElements.localitySearchLink().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.ecoMarketIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.novusIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.megaMarketIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.ultraMarketIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.varusIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.cosmosIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.bdjilkaIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.ashanIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.tavriyaIcon().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.vostorgIcon().isDisplayed());

    }
}

package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import Tests.PageObject.ZakazUAResultsPageWebElements;
import Tests.PageObject.ZakazUAStorePageWebElements;
import Tests.PageObject.ZakazUaCategoriesPageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSorting extends TestInit{
    @Test
    public void testSorting(){
        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);
        ZakazUAStorePageWebElements zakazUAStorePageWebElements=new ZakazUAStorePageWebElements(driver);
        ZakazUaCategoriesPageWebElements zakazUaCategoriesPageWebElements=new ZakazUaCategoriesPageWebElements(driver);
        ZakazUAResultsPageWebElements zakazUAResultsPageWebElements=new ZakazUAResultsPageWebElements(driver);


        goToZakazUAHomePage();
        fullScreen();
        zakazUAHomePageWebElements.megaMarketIcon().click();
        zakazUAStorePageWebElements.dairyAndEggsBtn().click();
        zakazUaCategoriesPageWebElements.getYogurtBtn().get(0).click();
        zakazUAResultsPageWebElements.addExpenciveBtn().click();
        Assert.assertTrue(zakazUAResultsPageWebElements.organicMilkRaspberry().isDisplayed());
        zakazUAResultsPageWebElements.addCheapBtn().click();
        Assert.assertTrue(zakazUAResultsPageWebElements.funnyCherry().isDisplayed());
        zakazUAResultsPageWebElements.addPopularBtn().click();
        Assert.assertTrue(zakazUAResultsPageWebElements.actimelStrawberries().isDisplayed());



    }
}

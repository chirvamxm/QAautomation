package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import Tests.PageObject.ZakazUAStorePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestZakazUaStorePage extends TestInit {

    @Test
    public void testCatalogue(){

        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);
        ZakazUAStorePageWebElements zakazUAStorePageWebElements=new ZakazUAStorePageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        zakazUAHomePageWebElements.megaMarketIcon().click();
        Assert.assertTrue(zakazUAStorePageWebElements.promotionsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.bakeryBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.fruitAndVegitablesBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.dairyAndEggsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.meatAndFishBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.readyMealsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.frozenBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.groceryBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.snacksAndSweetsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.drinksBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.alcoholBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.tobaccoGoodsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.babiesBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.chemicalsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.personalHygieneBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.cosmeticsAndCareBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.houseGoodsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.kitchenWareBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.hobbyAndRestBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.interiorAndTextilesBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.stationeryBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.forAnimalsBtn().isDisplayed());
        Assert.assertTrue(zakazUAStorePageWebElements.shoesAndClothesBtn().isDisplayed());



    }
}

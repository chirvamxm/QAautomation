package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import Tests.PageObject.ZakazUAOffersPageWebElements;
import Tests.PageObject.ZakazUAStorePageWebElements;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestNovusPickUpDeliveryType extends TestInit {


    @Test
    public void zakazUA1() {

        ZakazUAHomePageWebElements zakazUAHomePageWebElements =new ZakazUAHomePageWebElements(driver);
        ZakazUAStorePageWebElements zakazUAStorePageWebElements =new ZakazUAStorePageWebElements(driver);
        ZakazUAOffersPageWebElements zakazUAOffersPageWebElements =new ZakazUAOffersPageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        zakazUAHomePageWebElements.novusIcon().click();
        zakazUAStorePageWebElements.pickAddressBtn().click();
        zakazUAStorePageWebElements.pickUpDeliveryTypeBtn().click();
        zakazUAStorePageWebElements.locationField().click();
        zakazUAStorePageWebElements.locationRegionKyivNovus().click();
        zakazUAStorePageWebElements.locationKyivNovusStoreOnKilceva().click();
        zakazUAStorePageWebElements.toShoppingBtn().click();

        JavascriptExecutor js= (JavascriptExecutor) driver ;
        js.executeScript("window.scrollBy(0,1000)","");

        zakazUAStorePageWebElements.specialOfferVievAllBtn().click();
        zakazUAOffersPageWebElements.viewAllBtn().click();
        zakazUAOffersPageWebElements.pineappleLoradoItem().click();
        zakazUAOffersPageWebElements.addToCartBtn().click();
        zakazUAStorePageWebElements.closeItemBtn().click();
        zakazUAStorePageWebElements.cartBtn().click();





    }



}
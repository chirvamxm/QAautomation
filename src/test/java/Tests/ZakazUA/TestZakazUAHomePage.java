package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestZakazUAHomePage extends TestInit {

    @Test
    public void testHeader(){
        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        Assert.assertTrue(zakazUAHomePageWebElements.getZakazLogo().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.selectLanguageBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.partnersBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.vacanciesBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.helpBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.contactsBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.chooseStoreBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.donateZSUBtn().isDisplayed());


    }
    @Test
    public void testFooter(){
        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        Assert.assertTrue(zakazUAHomePageWebElements.getZakaznumber().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.getZakazEmail().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.getZakazFacebookPage().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.getZakazInstagramPage().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.getZakazLinkedinPage().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.forPartnersbtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.forBusinesessbtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.vacanciesFooterBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.allProductsBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.helpFooterBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.contactsFooterBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.policyBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.termsBtn().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.facebookPageFooterBtn().isDisplayed());

    }

    @Test
    public void testStoresSection(){
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
    @Test
    public void testAppSection(){
        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        Assert.assertTrue(zakazUAHomePageWebElements.googlePlayApp().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.appStoreApp().isDisplayed());


    }
}

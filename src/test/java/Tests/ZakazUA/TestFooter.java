package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFooter extends TestInit{
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
}

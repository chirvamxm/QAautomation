package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeader extends TestInit{
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
}

package Tests.ZakazUA;

import Tests.PageObject.ZakazUAHomePageWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAppSection extends TestInit{
    @Test
    public void testAppSection(){
        ZakazUAHomePageWebElements zakazUAHomePageWebElements=new ZakazUAHomePageWebElements(driver);

        goToZakazUAHomePage();
        fullScreen();
        Assert.assertTrue(zakazUAHomePageWebElements.googlePlayApp().isDisplayed());
        Assert.assertTrue(zakazUAHomePageWebElements.appStoreApp().isDisplayed());


    }
}

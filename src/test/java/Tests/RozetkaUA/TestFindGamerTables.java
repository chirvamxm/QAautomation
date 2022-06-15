package Tests.RozetkaUA;

import Tests.PageObject.RozetkaCategoryPageElements;
import Tests.PageObject.RozetkaHomePageElements;
import Tests.ZakazUA.TestInit;
import org.testng.annotations.Test;

public class TestFindGamerTables extends TestInit {
    @Test
    public void gamersTables(){
        RozetkaHomePageElements rozetkaHomePageElements=new RozetkaHomePageElements(driver);
        RozetkaCategoryPageElements rozetkaCategoryPageElements=new RozetkaCategoryPageElements(driver);

        goRozetkaHomePage();
        fullScreen();
        rozetkaHomePageElements.forGamers().click();
        rozetkaCategoryPageElements.gamerTables().click();


    }
}

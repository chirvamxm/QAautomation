package Tests.RozetkaUA;

import Tests.PageObject.RozetkaHomePageElements;
import Tests.PageObject.RozetkaItemPageElements;
import Tests.PageObject.RozetkaSearchPageElements;
import Tests.ZakazUA.TestInit;
import org.testng.annotations.Test;

public class TestTakeToCartChangeQty extends TestInit {

    @Test
    public void rozetkaQtyTest() {
        RozetkaHomePageElements rozetkaHomePageElements=new RozetkaHomePageElements(driver);
        RozetkaSearchPageElements rozetkaSearchPageElements=new RozetkaSearchPageElements(driver);
        RozetkaItemPageElements rozetkaItemPageElements=new RozetkaItemPageElements(driver);

        goRozetkaHomePage();
        fullScreen();
        rozetkaHomePageElements.searcLink().click();
        rozetkaHomePageElements.searcLink().sendKeys("Пиво\n");
        rozetkaSearchPageElements.confimAgeBtn().click();
        rozetkaSearchPageElements.coronaBoxOfBeer().click();
        rozetkaItemPageElements.addToCartBtn().click();
        for (int i = 0; i <4 ; i++) {
            rozetkaItemPageElements.addOneItemBtn().click();
        }
        sleep(2);
        rozetkaItemPageElements.continueShoppingBtn().click();
        rozetkaHomePageElements.searcLink().click();
        rozetkaHomePageElements.searcLink().sendKeys("coca-cola\n");
        rozetkaSearchPageElements.colaBoxOfan().click();
        rozetkaItemPageElements.addToCartBtn().click();
        for (int i = 0; i <4 ; i++) {
            rozetkaItemPageElements.addOneItemBtn().click();
        }
        sleep(2);
        rozetkaItemPageElements.continueShoppingBtn().click();
        rozetkaHomePageElements.searcLink().click();
        rozetkaHomePageElements.searcLink().sendKeys("чіпси лейс\n");
        rozetkaSearchPageElements.laysOriginalRecipe().click();
        rozetkaItemPageElements.addToCartBtn().click();
        for (int i = 0; i <4 ; i++) {
            rozetkaItemPageElements.addOneItemBtn().click();
        }
        sleep(2);



    }
}
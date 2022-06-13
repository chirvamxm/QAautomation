package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZakazUaOrderPageWebElements extends BasePage{
    public ZakazUaOrderPageWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement registrationBtn(){
        return getElementByXpath("//li[@data-marker='Registration']");
    }
    public WebElement logInField(){
        return getElementByXpath("//input[@id='login-data']");
    }
    public WebElement passwordField(){
        return getElementByXpath("//input[@data-marker='Password']");
    }
    public WebElement signInBtn(){
        return getElementByXpath("//button[@data-marker='Sign in']");
    }
    public WebElement getOrderBtn(){
        return getElementByXpath("//button[@data-marker='Order'][@type='button']");
    }

}

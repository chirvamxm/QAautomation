package Tests.ZakazUA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }

    @AfterMethod
    public void finishSession(){
        driver.quit();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void goToZakazUAHomePage(){
        driver.get("https://zakaz.ua");
    }
    public void goRozetkaHomePage(){
        driver.get("https://rozetka.com.ua/");
    }
    public void fullScreen(){
        driver.manage().window().maximize();
    }


}
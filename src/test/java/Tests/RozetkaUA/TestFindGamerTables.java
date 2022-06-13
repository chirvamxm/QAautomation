package Tests.RozetkaUA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFindGamerTables {
    @Test
    public void runGoogle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rozetka.com.ua/game-zone/c80261/");
        driver.findElement(By.xpath("//img[@alt='Геймерские столы']")).click();


    }
}

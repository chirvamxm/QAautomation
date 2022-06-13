package LessonsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunGlovo {
    @Test
    public void runGlovo(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://glovoapp.com/");
        driver.findElement(By.xpath("//img[@alt='Геймерские столы']")).click();


    }
}



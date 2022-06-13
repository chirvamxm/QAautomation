package Tests.RozetkaUA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTakeToCartChangeQty {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void rozetka() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        sleep(2);
        driver.findElement(By.xpath("//input[@name='search']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Пиво\n");
        sleep(7);
        driver.findElement(By.xpath("//a[@class='btn-link-i exponea-close']")).click();
        driver.findElement(By.xpath("//*[text()=' Упаковка пива Corona Extra светлое пастеризованное 4.5% 0.33 л х 24 шт (7501064199905) ']")).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']")).click();
        sleep(2);
        for (int i = 0; i <4 ; i++) {
            driver.findElement(By.xpath("//button[@aria-label='Добавить ещё один товар']")).click();
        }
        sleep(5);
        driver.findElement(By.xpath("//button[@data-testid='continue-shopping-link']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("coca-cola\n");
        sleep(2);
        driver.findElement(By.xpath("*//a[@title='Упаковка безалкогольного сильногазированного бескалорийного напитка Coca-Cola Zero 250 мл х 12 шт (5449000106469) ']")).click();
        sleep(5);
        driver.findElement(By.xpath("//app-buy-button[@class='toOrder ng-star-inserted']")).click();
        sleep(2);
        for (int i = 0; i <4 ; i++) {
            driver.findElement(By.xpath("//button[@aria-label='Добавить ещё один товар']")).click();
        }
        sleep(5);
        driver.findElement(By.xpath("//button[@data-testid='continue-shopping-link']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@name='search']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("чіпси лейс\n");
        sleep(2);
        driver.findElement(By.xpath("//div[@data-goods-id='315110275']")).click();
        sleep(5);
        driver.findElement(By.xpath("//app-buy-button[@class='toOrder ng-star-inserted']")).click();
        sleep(2);
        for (int i = 0; i <4 ; i++) {
            driver.findElement(By.xpath("//button[@aria-label='Добавить ещё один товар']")).click();
        }



    }
}
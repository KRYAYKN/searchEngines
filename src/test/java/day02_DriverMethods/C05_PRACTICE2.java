package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_PRACTICE2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();


WebElement ARAMA =driver.findElement(By.className("nav-search-scope nav-sprite nav-focus"));
ARAMA.sendKeys("KORAY",Keys.ENTER);
        List<WebElement> ELEMENTS =driver.findElements(By.tagName("input"));
        System.out.println(ELEMENTS.size());




    }
}

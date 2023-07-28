package day_04_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_RelativeLocators {
    public static void main(String[] args) {
        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html    adresine gidin
//Sayfadaki Berlin WE'ini relative locator ile tıklayalım

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");


    }
}

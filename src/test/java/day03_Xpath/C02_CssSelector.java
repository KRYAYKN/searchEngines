package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().refresh();
    String actualTitle = driver.getTitle();
    String arananKelime ="Spend less";
    if(actualTitle.contains(arananKelime)){
        System.out.println("passed");
    }else {
        System.out.println("failed");
//bestseller bol il urunu tikla





    }
}}

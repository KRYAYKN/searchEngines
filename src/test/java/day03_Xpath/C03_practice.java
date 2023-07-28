package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C03_practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.navigate().refresh();
//String  curentTitle =driver.getTitle();
//if(curentTitle.contains("Spend less")){
//    System.out.println("test passed");
//}else {
//    System.out.println("test failed");
   driver.findElement(By.xpath("//*[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
driver.findElement(By.xpath("//*[@alt='Amazon.com eGift Card']")).click();
//driver.findElement(By.className("//img[@alt='Birthday']")).click();
//driver.findElement(By.xpath("//img[@data-a-hires='https://images-na.ssl-images-amazon.com/images/W/WEBP_402378-T2/images/I/51f+fN6y6QL._AC_SX368_.jpg']")).click();
driver.findElement(By.xpath("//button[@value='25']")).click();
WebElement YIRMImI =driver.findElement(By.xpath("//button[@value='25']"));
if(YIRMImI.isDisplayed()){
    System.out.println("test passed");
}else {
    System.out.println("test failed");
    driver.close();

    }
}}


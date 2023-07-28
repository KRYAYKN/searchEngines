package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver1 =new ChromeDriver();
        driver1.get("https://www.amazon.com");
//        driver1.manage().window().maximize();
//        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver1.get("https://www.facebook.com");
//        driver1.navigate().to("https://www.youtube.com");
//        driver1.navigate().back();
//        driver1.navigate().to("https://www.amazon.com");
//        String actualUrl=driver1.getCurrentUrl();
//        if(actualUrl.contains(driver1.getCurrentUrl())){
//            System.out.println("test passed");
//
//        }else{
//            System.out.println("test failed");
        System.out.println(driver1.manage().window().getSize());;
        System.out.println(driver1.manage().window().getPosition());
        driver1.manage().window().setPosition(new Point(80,20));
        driver1.manage().window().setSize(new Dimension(200,200));

Dimension actualSize=driver1.manage().window().getSize();
if(actualSize.getWidth()==600&&actualSize.getHeight()==600){
    System.out.println("size test passed");
}else{
    System.out.println("size test failed");

driver1.close();





    }
}}
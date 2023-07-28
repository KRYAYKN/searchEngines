package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
//        WebDriver driver =new ChromeDriver();
//        driver.get("https://www.amazon.com");
//        System.out.println("sayfa basligi :"+driver.getTitle());
//        String actualTitle =driver.getTitle();
//        if(actualTitle.contains("Amazon")){
//            System.out.println("Title testi passed");
//        }else {
//            System.out.println("Title testi failed");
//         String actualUrl =driver.getCurrentUrl();
//         if(actualUrl.contains("amazon")){
//             System.out.println("passed");
//         }else{
//             System.out.println("failed");
//System.out.println("window handle degeri :" + driver.getWindowHandle());
//driver.close();

System.setProperty("webDriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
System.setProperty("webDriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
WebDriver driver2 =new ChromeDriver();
driver2.get("https://www.amazon.com");
driver2.navigate().to("https://www.facebook.com");
String actualTitle =driver.getTitle();
if(actualTitle.contains("Amazon")){
    System.out.println("test passed");

         }else{
    System.out.println("test failed");}
    driver2.navigate().back();
    driver2.manage().window().maximize();
    driver2.navigate().forward();
    driver2.manage().window().getPosition();
    driver2.close();
}}

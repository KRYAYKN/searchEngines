package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ManageMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webDriver.chromeDriver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
//        driver.get("https://www.amazon.com");
//
//driver.manage().window().minimize();
//Thread.sleep(3000);
//driver.manage().window().maximize();
//        System.out.println("sayfanin konumu :"+driver.manage().window().getPosition());
//        System.out.println("sayfanin boyutlari "+driver.manage().window().getSize());
//        driver.manage().window().fullscreen();
//        System.out.println("sayfanin konumu :"+driver.manage().window().getPosition());
//        System.out.println("sayfanin boyutlari "+driver.manage().window().getSize());
//        driver.close();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//      ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        driver.get("https://www.facebook.com");
       String actualTitle= driver.getTitle();
       if(actualTitle.contains("facebook")){
           System.out.println("Title test passed");

       }else {
           System.out.println("Title test failed :"+actualTitle);
//        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
//                Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
//        yazdirin.
//           String actualUrl=driver.getCurrentUrl();
//           if(actualUrl.contains("facebook")){
//               System.out.println("Url test passed");
//
//           }else {
//               System.out.println("Url test failed"+actualUrl);
////                https://www.walmart.com/ sayfasina gidin.
               driver.get("https://www.walmart.com");
//        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
               String actualTitle1= driver.getTitle();
               if(actualTitle1.contains("Walmart.com")){
                   System.out.println("url test passed");
               }else {
                   System.out.println("url test failed");
           }
               if(actualTitle.contains("Walmart.com")){
                   System.out.println("Title test passed");
               }else {
                   System.out.println("Title test failed it must be :"+actualTitle);

//        Tekrar “facebook” sayfasina donun
                   driver.navigate().back();

//        Sayfayi yenileyin
                   driver.navigate().refresh();
//        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
driver.manage().window().maximize();

System.setProperty("webDriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
WebDriver driver3 =new ChromeDriver();
driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
Thread.sleep(3000);




    }

}}}

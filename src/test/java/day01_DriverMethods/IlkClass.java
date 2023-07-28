package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        /*
        en temel haliyle otomasyon yapmak icin classimiza otomasyon icin gerekli olan
         webdriver in yerini gostermek gerekir.Bunun icin java kutuphanesinden System.getProperty()
         methodunun icine ilk olarak driver i yazariz.ikinci olarak driverin fiziki yolunu
         kopyalariz
         */

        WebDriver driver =new ChromeDriver();
         driver.get("https://www.amazon.com");




    }
}

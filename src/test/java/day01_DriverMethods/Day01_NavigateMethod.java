package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        //amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        Thread.sleep(3000);
        //hepsiburada sayfasina gidelim
        driver.navigate().to("https://hepsiburada.com");
        //tekrar amazon sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().back();
        //tekrar facebook sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        //son sayfada sayfayi yenileyelim(refresh)\
        Thread.sleep(3000);
        driver.navigate().refresh();
        //son sayfada sayfayi yenileyelim(url)
        driver.navigate().to(args[1]);
        //son sayfada sayfayi yenileyelim(method)
        //sayfayi kapatalim


    }
}

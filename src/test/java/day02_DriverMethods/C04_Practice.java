package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class C04_Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        List<WebElement>aramaSonucYazisi=driver.findElements(By.className("sg-col-inner"));
        System.out.println("aramasonucyazisi : "+aramaSonucYazisi.get(0).getText());;
        //arama sonuc sayisini konsola yazdirin
        String [] sonucSayisi = aramaSonucYazisi.get(0).getText().split(" ");
        System.out.println("sonuc sayisi :"+sonucSayisi[2]);

        //sonuc sayisimi lamda ile yazdirin

        List<WebElement>ilkWebElement =driver.findElements(By.className("s-image"));
        ilkWebElement.get(0).click();
//        https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin 2- Add Element butonuna basin
//        3Delete butonu’nun gorunur oldugunu test edin
//        4Delete tusuna basin
//        5“Add/Remove Elements” yazisinin gorunur oldugunu test edin







    }


}

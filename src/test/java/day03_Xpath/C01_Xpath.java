package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
       /*
  1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//        2- Add Element butonuna basin
//        3- Delete butonu'nun gorunur oldugunu test edin
//        4- Delete tusuna basin
//        5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin
        */
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
Thread.sleep(3);
driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
//delete butonununn gorunur olup olmadigini test edin
        WebElement deleteButonu =driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if(deleteButonu.isDisplayed()){
            System.out.println("delete butonu gorunur");
        }else {
            System.out.println("delete butonu gorunur degil");
           Thread.sleep(3000);
            deleteButonu.click();

            WebElement addRemoveYazisi =driver.findElement(By.xpath("//h3"));
            if(addRemoveYazisi.isDisplayed()){
                System.out.println("test passed");

            }else {
                System.out.println("test failed");
    }
WebElement addButtonT =driver.findElement(By.xpath("//*[text()='addElement()']"));
            addButtonT.click();
}

    }}

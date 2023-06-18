package Day02_tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButtonElement = driver.findElement(By.xpath("//button[text()='Delete']"));
       if (deleteButtonElement.isDisplayed()){
           System.out.println("TEST PASSED");
       }else {
           System.out.println("TEST FAILED");
       }
        //4- Delete tusuna basin
        deleteButtonElement.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        if (driver.findElement(By.tagName("h3")).isDisplayed()){
            System.out.println("h3 TEST PASSED");
        }else {
            System.out.println("h3 TEST FAILED");
        }
        driver.close();

    }
}

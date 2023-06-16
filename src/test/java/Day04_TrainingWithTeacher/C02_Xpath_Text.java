package Day04_TrainingWithTeacher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath_Text {
    public static void main(String[] args) throws InterruptedException {
        //turn locators with text locator
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(1000);
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//button[text()='Delete']")).isDisplayed()){
            System.out.println("Displayed button TEST PASSED");
        }else {
            System.out.println("Displayed button TEST FAILED");
        }
        Thread.sleep(1000);
        //4- Delete tusuna basin
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        Thread.sleep(1000);
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        if (driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']")).isDisplayed()){
            System.out.println("Add/Remove TEST PASSED");
        }else {
            System.out.println("Add/Remove TEST FAILED");
        }

        Thread.sleep(2000);
        driver.close();
    }
}

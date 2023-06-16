package Day04_TrainingWithTeacher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(1000);
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        Thread.sleep(1000);
        if (driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).isDisplayed()){
            System.out.println("Displayed button TEST PASSED");
        }else {
            System.out.println("Displayed button TEST FAILED");
        }
        Thread.sleep(1000);
        //4- Delete tusuna basin
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        Thread.sleep(1000);
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        if (driver.findElement(By.tagName("h3")).isDisplayed()){
            System.out.println("Add/Remove TEST PASSED");
        }else {
            System.out.println("Add/Remove TEST FAILED");
        }

        Thread.sleep(2000);
        driver.close();
    }
}

package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_AutomationExcerciseLinkTest {
    public static void main(String[] args) throws InterruptedException {
        //Automation Exercise Link Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkListOfElements = driver.findElements(By.tagName("a"));
        int expectedData = 147;
        int actualData = linkListOfElements.size();
        if (actualData == expectedData){
            System.out.println("Test passed");
        }else {
            System.out.println("test failed");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText(" Products")).click();
        //5- special offer yazisinin gorundugunu test edin
        if (driver.findElement(By.id("sale_image")).isDisplayed()){
            System.out.println("Test content accessible");
        }else {
            System.out.println("Test content inaccessible");
        }
        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}

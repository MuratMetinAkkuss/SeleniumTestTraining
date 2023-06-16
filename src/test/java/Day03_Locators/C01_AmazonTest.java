package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonTest {
    public static void main(String[] args) {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.amazon.com adresine gidin
        driver.get("https://www.amazon.com");
        //3- amazon arama kutusunu locate edin
        WebElement amazonSearchBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
        //4- arama kutusuna “Nutella” yazdirin
        amazonSearchBoxElement.sendKeys("Nutella");
        //5- arama islemini yapabilmek icin ENTER tusuna basin
        amazonSearchBoxElement.submit();

        driver.close();



    }
}

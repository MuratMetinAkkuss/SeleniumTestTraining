package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_TestCase_1_RegisterUser {
    public static void main(String[] args) {
        //1. Launch browser
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        boolean expectedResult = true;
        boolean actualResult = driver.findElement(By.xpath("//div[@class='container']")).isDisplayed();

        if (expectedResult == actualResult){
            System.out.println("Home Page is visible");
        }else {
            System.out.println("Home page is not visible");
        }

        //Click on 'Signup / Login' button


    }
}

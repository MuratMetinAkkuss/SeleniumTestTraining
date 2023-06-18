package Day02_tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki HTML elementlerini locate edin
        List<WebElement> category = driver.findElements(By.className("panel-heading"));
        Thread.sleep(2000);
        //4- Category bolumunde 3 element oldugunu test edin
        int expectedResult = 3 ;
        int actualResult = category.size();
        System.out.println("actualResult = " + actualResult);

        if (expectedResult == actualResult){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        //5- Category isimlerini yazdirin
        for (WebElement eachElement: category
             ) {
            System.out.println(eachElement.getText());
        }

        //6- Sayfayi kapatin
        driver.close();

    }
}

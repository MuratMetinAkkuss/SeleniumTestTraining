package Day02_tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C07 {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> anchor = driver.findElements(By.tagName("a"));
        int actualNumberOfAnchor = anchor.size();
        int expectedResult = 147;

        if (actualNumberOfAnchor == expectedResult){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //4- Products linkine tiklayin

        driver.findElement(By.xpath(" //a[text()=' Products']")).click();
        Thread.sleep(3000);
        //5- special offer yazisinin gorundugunu test edin
        //driver.findElement(By.xpath("//span[@class='ns-2m3ln-e-16']")).click();
         if (driver.findElement(By.id("sale_image")).isDisplayed()){
             System.out.println("TEST PASSED");
         }else {
             System.out.println("TEST FAILED");
         }
        //6- Sayfayi kapatin

        driver.close();

    }
}

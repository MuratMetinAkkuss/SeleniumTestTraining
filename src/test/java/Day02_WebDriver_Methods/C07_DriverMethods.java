package Day02_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        /*
            1.Yeni bir class olusturalim (Homework)
            2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
            oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
            3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
            4.https://www.walmart.com/ sayfasina gidin.
            5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
            6. Tekrar “facebook” sayfasina donun
            7. Sayfayi yenileyin
            8. Sayfayi tam sayfa (maximize) yapin
            9 .Browser’i kapatin
         */

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //            oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Facebook Title PASSED");
        }else {
            System.out.println("Facebook Title Test FAILED \nactual title : " + actualTitle);
        }

        Thread.sleep(3000);


        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

        String expectedUrlContent = "facebook";
        String actualUrlContent = driver.getCurrentUrl();

        if (actualUrlContent.contains(expectedUrlContent)){
            System.out.println("facebook Url Test PASSED");
        }else {
            System.out.println("facebook url Test FAILED \nactual url : " + actualUrlContent);
        }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        actualTitle = driver.getTitle();
        String expectedTitleContent = "Walmart.com";

        if (actualTitle.contains(expectedTitleContent)){
            System.out.println("Walmart Title Test PASSED");
        }else {
            System.out.println("Walmart Title Test FAILED \nactual title : " + actualTitle);
        }

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();


        //9 .Browser’i kapatin
        driver.close();

    }
}

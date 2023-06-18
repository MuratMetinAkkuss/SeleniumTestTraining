package Day02_tekrar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
       // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedResult = "Amazon";
        String actualResult = driver.getTitle();

        if (actualResult.contains(expectedResult)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
       // 6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        expectedResult = "amazon";
        actualResult = driver.getCurrentUrl();

        if (actualResult.contains(expectedResult)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

       // 8. Sayfa handle degerini yazdirin
        String handleWindow = driver.getWindowHandle();
        System.out.println("handleWindow = " + handleWindow);
        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        expectedResult = "alisveris";
        actualResult = driver.getPageSource();

        if (actualResult.contains(expectedResult)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
       // 10. Sayfayi kapatin.
       // driver.close();

    }
}

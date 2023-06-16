package Day02_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverNavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chorome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //wisequarter anasayfaya gidelim
        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(2000);

        //ayni browser'da amazon ana sayfaya gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        //tekrar anasayfaya donun
        driver.navigate().back();
        Thread.sleep(2000);

        //yeniden amazon sayfasina gidiniz!
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.close();






    }
}

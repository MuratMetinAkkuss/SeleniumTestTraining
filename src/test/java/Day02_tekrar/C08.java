package Day02_tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C08 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
        //2- Arama kutusuna “city bike” yazip aratin
        WebElement cityElement = driver.findElement(By.id("twotabsearchtextbox"));
        cityElement.sendKeys("city bike" + Keys.ENTER);
        //3- Görüntülenen sonuçların sayısını yazdırın
        System.out.println(driver.findElement(By.xpath("//img[@class='s-image']")));
        //4- Listeden ilk urunun resmine tıklayın
        List<WebElement> sImage = driver.findElements(By.xpath("//img[@class='s-image']"));
        sImage.get(1).click();
    }
}

package Day04_TrainingWithTeacher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Xpath_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
            // I DID AT 13. LINE
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedResult = "Spend less";
        String actualResult = driver.getTitle();

        if (actualResult.contains(expectedResult)){
            System.out.println("TITLE TEST PASSED");
        }else {
            System.out.println("TITLE TEST FAILED");
        }
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//span[@class='a-truncate-cut']")).click();
        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//button[@value=25]")).click();
        Thread.sleep(3000);
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement actualResult2 = driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));
        expectedResult = "25$";
        actualResult = actualResult2.getText();
        System.out.println(actualResult);

        if (expectedResult.equals(actualResult)){
            System.out.println("Price TEST PASSED");
        }else {
            System.out.println("Price TEST FAILED");
        }

        //11-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}

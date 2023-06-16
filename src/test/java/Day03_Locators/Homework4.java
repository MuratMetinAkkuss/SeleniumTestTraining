package Day03_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework4 {
    public static void main(String[] args) throws InterruptedException {

        /*
            1.Bir class oluşturun : AmazonSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a.web sayfasına gidin. https://www.amazon.com/
b.Search(ara) “city bike”
c. Amazon'da görüntülenen ilgili sonuçların sayısını
yazdırın
d.Sonra karşınıza çıkan ilk sonucun resmine tıkla


         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        // b.Search(ara) “city bike”

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusuElementi.sendKeys("city bike");
        aramaKutusuElementi.submit();

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        //s-card-container s-overflow-hidden aok-relative puis-wide-grid-style puis-wide-grid-style-t3 puis-include-content-margin puis puis-v1ysgidbwbb5mf2hczv941n5syt s-latency-cf-section s-card-border


        // WebElement urunSayisi = driver.findElement(By.id("search"));
        // System.out.println("Urun sayısı: " + urunSayisi.getText());

//div[@class='']
        List<WebElement> ull1 = driver.findElements(By.xpath("//img[@href='s-image']"));
        System.out.println("Urun sayisi :"+ull1.size());
        ull1.get(0).click();
        // List<WebElement> urunSayisiList=driver.findElements(By.xpath("//div[@class='s-card-container s-overflow-hidden aok-relative puis-wide-grid-style puis-wide-grid-style-t3 puis-include-content-margin puis puis-v1ysgidbwbb5mf2hczv941n5syt s-latency-cf-section s-card-border']"));
        //  System.out.println(urunSayisiList.size());

        // d.Sonra karşınıza çıkan ilk sonucun resmine tıkla

        // urunSayisiList.get(0).click();











    }
}
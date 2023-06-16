package Day02_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethods {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("Webdriver.chrome.driver" , "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

         driver.get("https://www.wisequarter.com");

         Thread.sleep(3000);

        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        //Sayfa title'da wise icerdigini test edin

        String expectedContent = "Wise";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedContent)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title doesnt contain Wise");
        }


        //URL'in https://www.wisequarter.com oldugunu test edin
        //String actualUrl = driver.getCurrentUrl();

        String expectedUrl = "https://www.wisequarter.com";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){

            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println(actualUrl + " actual url");
        }

        //System.out.println(driver.getPageSource());
        //sayfa kaynagindan bilgi istenebilir

        System.out.println(driver.getWindowHandle());
        //sistem de her olusturulan browser icin unique bir window handle degeri atanir
        //bu handle degeri sayfalar arasinda gecis yapmak icin kullanilir
        //bu window acik iken baska bir window'da calisiyorsak ve bu window'a gecmek istiyorsak
        //driver'a "window handle degeri 360DC878DD6569A6C117C0AB0997AE35 bu olan window'a git dersek " driver bu window'a gecis yapar

        System.out.println(driver.getWindowHandles());
        //bulundugumuz class'daki driver tarafindan olusturulan
        //ve acik olan tum window'larin window handle degerlerini
        //bir set olarak bize dondurur.

        driver.close();

    }
}

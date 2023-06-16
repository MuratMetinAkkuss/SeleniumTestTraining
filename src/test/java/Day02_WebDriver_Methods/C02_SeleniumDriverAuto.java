package Day02_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class C02_SeleniumDriverAuto {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        //Driver objesini her olusturdugumuzda
        //selenium istedigimiz browser'in bir kopyasini olusturur
        //Kapat demezsek olusturulan browser acik kalir

        //kodlar cok hizli calistigi icin bazi asamalari gozle gorebilmek
        //veya internetdeki yavasliktan dolayi
        //testin faild olmamasi icin
        //java'dan thread.sleep ile kodllari istedigiz sure kadar durdurabiliriz

        Thread.sleep(2000);

        driver.get("https://www.amazon.com");
        //olusturdugumuz kopya browser'i verilen url'e gotur

        Thread.sleep(3000);

        driver.close();




    }
}

package Day04_TrainingWithTeacher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        /*
            Berlin WebElementinin tag ve attribute'lari
            <img id="pid7_thumb" src="bots/sl-berlin-bot.png" class="ui-li-thumb">

            Normalde kullanip locate edebildigimiz bir Web Element icin
            buna ihtiyac yoktur

            Relative Locators HTML ozelliklerini gordugumuz halde
            locate edemedigimiz bir web element varsa kullaniriz

            bu soruda ornek olmasi amaciyla berlin elemanina ulasamadigimizi
            ve ya locate edemedigimizi varsayiyoruz

            bu durumda berlin web elementinin yaninda bulunan web elementlerini bulup onlar uzerinden
            locate edecegiz

         */
        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        WebElement bostonElement = driver.findElement(By.xpath("//img[@id='pid6_thumb']"));
        WebElement sailorElement = driver.findElement(By.xpath("//img[@id='pid11_thumb']"));
        WebElement byAreaElement = driver.findElement(By.xpath("//img[@id='pid8_thumb']"));
        WebElement nYCElement = driver.findElement(By.xpath("//img[@id='pid3_thumb']"));


        //3 ) Relative locator’larin dogru calistigini test edin

        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElement));
        

    }
}

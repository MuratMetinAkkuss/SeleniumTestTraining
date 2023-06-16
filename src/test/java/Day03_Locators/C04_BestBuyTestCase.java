package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_BestBuyTestCase {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.bestbuy.com adresine gidin
        driver.get("https://www.bestbuy.com");
        //2-cookies cikarsa kabul et butonuna basin
        //there is no cookies came with page
        //3-sayfada kac adet button tagi bulundugunu yazdirin
        List<WebElement> numberOfButtons = driver.findElements(By.tagName("button"));
        System.out.println("there are " + numberOfButtons.size() + " insede the page");
        //4-sayfadaki herbir button uzerindeki yazilari yazdirin
        List<WebElement> buttonNamesElement = driver.findElements(By.tagName("button"));
        for (WebElement eachElement: buttonNamesElement
             ) {
            System.out.println(eachElement.getText());
        }
        driver.close();

    }
}

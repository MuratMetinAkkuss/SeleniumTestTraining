package Day02_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://wisequarter.com");
        //www koyulmasa da calisir ancak https yazmak zorunludur

        System.out.println("Ilk sayfa size : "+driver.manage().window().getSize());
        System.out.println("Ilk sayfanin konumu : "+driver.manage().window().getPosition());

        driver.manage().window().maximize();
        System.out.println("maximize size : "+driver.manage().window().getSize());
        System.out.println("maximize sayfanin konumu : "+driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen size : "+driver.manage().window().getSize());
        System.out.println("fullscreen sayfanin konumu : "+driver.manage().window().getPosition());


        Thread.sleep(2000);

        driver.close();


    }
}

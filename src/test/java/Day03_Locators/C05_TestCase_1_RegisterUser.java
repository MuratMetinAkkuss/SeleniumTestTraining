package Day03_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_TestCase_1_RegisterUser {
    public static void main(String[] args) throws InterruptedException {
        //1. Launch browser
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        driver.findElement(By.xpath("//div[@class='grippy-host']")).click();//close add

        //3. Verify that home page is visible successfully
        boolean expectedResult = true;
        boolean actualResult = driver.findElement(By.xpath("//div[@class='container']")).isDisplayed();

        if (expectedResult == actualResult){
            System.out.println("Home Page is visible");
        }else {
            System.out.println("Home page is not visible");
        }

        //Click on 'Signup / Login' button
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.xpath("//div[@class='grippy-host']")).click();//close add
        Thread.sleep(1000);

        //5. Verify 'New User Signup!' is visible
        WebElement textCheckElement = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));

        if (textCheckElement.isDisplayed()){
            System.out.println("textCheckElement TEST PASSED = " + textCheckElement.getText());
        } else {
            System.out.println("textCheckElement TEST FAILLED= " + textCheckElement.getText());
        }

        //6. Enter name and email address
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Metin");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("muratmetinakkus@gmail.com");
        Thread.sleep(1000);

        //7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        driver.findElement(By.xpath("//div[@class='grippy-host']")).click();//close add
        Thread.sleep(1000);

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement accountTextElement = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));

        if (accountTextElement.isDisplayed()) {
            System.out.println("accountTextElement  TEST PASSED = " + accountTextElement.getText());
        }else {
            System.out.println("accountTextElement TEST FAILED = " + accountTextElement.getText());
        }

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();//gender
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("met123met");

        driver.findElement(By.xpath("//div[@class='grippy-host']")).click();//close add
        Thread.sleep(1000);

        //Pick Date from select box , there is 2 steps that we must code it separately
        driver.findElement(By.xpath("//select[@id='days']")).click();
        driver.findElement(By.xpath("//option[text()='4']")).click();

        //we are going to do same thing for month
        driver.findElement(By.xpath("//select[@id='months']")).click();
        driver.findElement(By.xpath("//option[text()='January']")).click();

        // same for year
        driver.findElement(By.xpath("//select[@id='years']")).click();
        driver.findElement(By.xpath("//option[text()='1999']")).click();

        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();

        //11. Select checkbox 'Receive special offers from our partners!'



        Thread.sleep(3000);
        //driver.close();

    }
}

package Day01_SeleniumFirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_SeleniumFirstTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");


    }
}

/*
    while you working with Selenium you must be productive coder!!

    selenmium ile test otomasyonu icin minimum kullanmamiz
    gereken enstrumanlar

    1- programlama dili --> Java
        Proje olusturulurken dahil ettik

    2- IDE (IntelliJ)
        zaten burada calisiyoruz

    3- selenium lib
        bunun icin selenium.dev adresinden kullandigimiz bilgisayata
        uygun jar dosyalarini indirip
        projemizin icerisine kopyaladik
        Bu jar dosyalarini projemize eklemek icin
        yukaridan file project structure' i secerek,
        onun altinda modules ve dependincies seceneklerine gittik
        + tusuna basarak tum jar dosyalarini projeye ekledik

   4- WebDriver
      herkesin bilgisayarinin isletim sistemi ve
      bilgisayarinda bulunun google chorme browser'inin versiyonu
      farkli oldugundan

      kendi bilgisayarimiz ve chorme browser surumune uygun
      olan selenium.dev adresindeki browser dosyasini indirip
      projeminizin altina kopyalamaliyiz

 */
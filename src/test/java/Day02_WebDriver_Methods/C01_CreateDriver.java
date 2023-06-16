package Day02_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_CreateDriver {
    public static void main(String[] args) {

    System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
         //bu class'da kullanilacak webdriver'i ve
        //bu driver ile ilgili dosyalari nerede
        //bulabilecegimizi bize tanimlar.

        WebDriver driver = new ChromeDriver();
        //driver objesi olusturulur.
        //bu obje bizim icin istedigimiz
        //web sayfalarina gidebilecek
        //o sayfalarda istedigimiz islemleri yapabilecek ozelliklerdir
        //web sayfalarina gidebilmek ve islemler yapabilmek icin
        //bir browser'a ihtiyac oldugundan
        //driver objesi setProperty ile tanimladigimiz browser'in bir kopyasini olusturur.
        //bu kopya browser ile tum islemleri yapar.

        /*
            Selenium 4.7 version ile kendi web driver'ini olusturdu.
            yani biz chromedriver.exe dosyasini indirmemis olsak bile
            9. satiri yazmasakta selenium devreye girip kendi driver'ini
            olusturur.
         */

    }
}

/*
    selenium'u projemize dahil edebilmek icin
    normalde maven alt yapisini kullaniriz
    Ancak, maven sart degildir.
    Bir freamwork'e selenium dosyalarini
    dosyalarini eklerseniz
    selenium kutuphanelerini kullanabilirsiniz

    Bir projeye selenium eklemenin en ilkel yolu;
    1- file
    2-proje structures
    3-moduls
    4-dependiecies
    sekmelerini secip selenium jar dosyalarini projeye eklemektir.

    Ancak, bu yontem tek basina yeterli degildir.
    Selenium yaninda kullanacagimiz web driver'da
    projemize eklememiz gerekir.

    her bilgisayar'da kullanilan browser
    ve o browser'in versiyonu farkli olacagindan
    bu yontemi kullanidgimizda
    her class'da kullanilacak driver'i
    sisteme tanitmamiz gerekir.

    selenium ile otomasyon yapabilmek icin browser'a ihtiyac vardir

 */
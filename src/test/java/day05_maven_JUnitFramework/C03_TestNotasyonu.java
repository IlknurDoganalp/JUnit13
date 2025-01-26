package day05_maven_JUnitFramework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C03_TestNotasyonu {

    /*
        Bir test framework'unde kullanilacak her bagimsiz mini test
        farkli test gruplarinda (smoke, E2E testi, regression ...) calistirilabilir olmalidir

        Bu class'da birbirinden bagimsiz calisabilecek
        3 test yapmak istiyorum
        1- testotomasyonu.com'a gidip url'in "testotomasyonu" icerdigini test etsin
        2- wisequarter.com'a gidip url'in "wisequarter" icerdigini test etsin
        3- youtube.com'a gidip url'in "youtube" icerdigini test etsin
        Bu class'daki 3 test method'unun hepsinin


        Bagimsiz calistirabilmek icin yaptigimiz testleri
        bagimsiz test method'larinda hazirlamak guzel olur
        ANCAK Java'daki klasik method'lar baska bir yerden cagrilmadikca calismaz
        ve tek baslarina Run edilemezler

        JUnit ile kazandigimiz en buyuk kolayliklardan biri
        siradan method'lari @Test notasyonu sayesinde
        tek basina CALISABILIR veya CALISTIRILABILIR method'lara donusturmektir.

        @ Notasyonlar kucuk bilgiler iceren
        mini kod bloklaridir
        ve kendilerine tanimlanan gorevleri yaparlar

     */

    @Test
    public void testotomasyonuTesti(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 1- testotomasyonu.com'a gidip url'in "testotomasyonu" icerdigini test etsin
        driver.get("https://www.testotomasyonu.com");

        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Testotomasyonu Url testi PASSED");
        }else System.out.println("Testotomasyonu Url testi FAILED");

        ReusableMethods.bekle(1);
        driver.quit();
    }

    @Test
    public void wisequarterTesti(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 2- wisequarter.com'a gidip url'in "wisequarter" icerdigini test etsin
        driver.get("https://www.wisequarter.com");

        String expectedUrlIcerik = "wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Wisequarter Url testi PASSED");
        }else System.out.println("Wisequarter Url testi FAILED");

        ReusableMethods.bekle(1);
        driver.quit();
    }

    @Test
    public void youtubeTesti(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 3- youtube.com'a gidip url'in "youtube" icerdigini test etsin
        driver.get("https://www.youtube.com");

        String expectedUrlIcerik = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube Url testi PASSED");
        }else System.out.println("Youtube Url testi FAILED");

        ReusableMethods.bekle(1);
        driver.quit();
    }


}

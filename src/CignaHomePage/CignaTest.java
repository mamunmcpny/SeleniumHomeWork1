package CignaHomePage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class CignaTest extends CignaHelperClass {

    @Test
    public static void checkLogo() {
        driver2.findElement(By.cssSelector("#ssi-includes > div > header > div.d-none.d-lg-block > nav.navbar.global-nav.logo-nav.navbar-expand-lg.navbar-white.bg-white > div > a > svg")).isDisplayed();
    }

    @Test
    public static void healthCareProviders() {
        driver2.findElement(By.xpath("//a[contains(text(), 'Health Care Providers')]")).click();
    }

    @Test
    public static void medicare() {
        driver2.findElement(By.id("medicare-level-one-link")).click();
        driver2.findElement(By.cssSelector("#scroll-hero > div > div.container.hero-full-w-content > div > h1")).isDisplayed();
        driver2.findElement(By.xpath("//*[@id=\"1595985736226\"]/div/div/div/div/div[2]/div[1]/div/div[1]/a")).click();
        driver2.findElement(By.xpath("//*[@id=\"zip-314\"]")).sendKeys("10463");
        driver2.findElement(By.xpath("//*[@id=\"planfinder-314\"]/div[2]/div/button")).click();
    }


    @Test
    public static void aboutUs() {
        driver2.findElement(By.id("about-us-level-one-link")).click();
        driver2.findElement(By.xpath("//*[@id=\"1573385722195\"]/div/div[2]/div/div/ul/li[1]/a")).click();
        driver2.findElement(By.cssSelector("#\\31 569893998371 > div > div.container.hero-padding > div > div > h1")).isDisplayed();
    }

    @Test
    public static void cignaInternational() {
        driver2.findElement(By.xpath("//*[@id=\"ssi-includes\"]/div/header/div[2]/nav[1]/div/ul/li[1]/a/span")).click();
    }

    @Test
    public static void findADoctorDentistOrFacility() {
        driver2.findElement(By.xpath("//*[@id=\"ssi-includes\"]/div/header/div[2]/nav[2]/div/ul/li[1]/a")).click();
    }

    @Test
    public static void searchCigna() throws InterruptedException {
        driver2.findElement(By.cssSelector("#search-desktop")).sendKeys("Health");
        Thread.sleep(3000);
        driver2.findElement(By.cssSelector("#ssi-includes > div > header > div.d-none.d-lg-block > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white > div > ul > li:nth-child(4) > form > div > div > span > button")).click();
    }
    @Test
    public static void contactUs() throws InterruptedException {
        driver2.findElement(By.cssSelector("#ssi-includes > div > header > div.d-none.d-lg-block > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white > div > ul > li:nth-child(2) > a")).click();
        Thread.sleep(2000);
        driver2.findElement(By.cssSelector("#\\31 555225043556 > div > div > div > div:nth-child(1) > p.mb-0 > a ")).click();
    }
    @Test
    public static void covidKey (){
        driver2.findElement(By.cssSelector("#\\31 583802536510 > div > div > p > a")).click();
    }
//    @Test
//    public static void logIn () throws InterruptedException {
//        driver2.findElement(By.xpath("//*[@id=\"onlineId1\"]")).click();
//        Thread.sleep(3000);
//        driver2.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("Farhana");
//        driver2.findElement(By.xpath("//*[@id=\"passcode1\"]")).click();
//        Thread.sleep(3000);
//        driver2.findElement(By.xpath("//*[@id=\"passcode1\"]")).sendKeys("FK123456");
//        Thread.sleep(2000);
//        driver2.findElement(By.xpath("//*[@id=\"signIn\"]")).click();


    }




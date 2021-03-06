package amazonhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class AmazonHomePage extends HelperClass1 {


    @Test()
    public void logo() {
        driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
    }

    @Test()
    public static void logIn() {
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        HelperClass1.driver.findElement(By.cssSelector("#ap_email")).sendKeys("");
        HelperClass1.driver.findElement(By.xpath("//input[@tabindex='5']")).click();

    }

    @Test()
    public static void checkHello() {
        HelperClass1.driver.findElement(By.id("glow-ingress-line1")).isDisplayed();
    }

    @Test()
    public static void checkPrime() {
        HelperClass1.driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span[1]")).click();
    }

    @Test()
    public static void customerService() {
        driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]")).click();
        HelperClass1.driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[1]/div/div[3]/div[2]/a/div/div/div/div[2]/h3")).click();
    }

    @Test()
    public static void amazonPharmacy() {
        driver.findElement(By.cssSelector("div[id='nav-search']")).click();
        driver.findElement(By.xpath("//a[text()='Pharmacy']")).click();
        WebElement dropdown = driver.findElement(By.id("usState-availability-check"));
        Select dd = new Select(dropdown);
        dd.selectByVisibleText("New York");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign up')]")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("mamunmcpny@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();

    }

    @Test()
    public static void bestSellerDevice() {
        driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
        driver.findElement(By.xpath("//a[@href='https://www.amazon.com/Best-Sellers-Toys-Games/zgbs/toys-and-games/ref=zg_bs_nav_0']")).click();
    }

    @Test()
    public static void findAGift() {

        driver.findElement(By.linkText("Find a Gift")).click();
        driver.findElement(By.xpath("//span[text()='Gift Cards']")).click();
                   }

    @Test()
    public static void moversAndShakers() {

        driver.findElement(By.cssSelector("#nav-hamburger-menu > span")).click();
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(4) > a")).click();
        driver.findElement(By.cssSelector("#zg_browseRoot > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#zg-ordered-list > li:nth-child(3) > span > div > span > a > div")).click();
            }

    @Test()
    private static void searchButtonFunctionality(){
        WebElement sr=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        sr.sendKeys("toys");
        driver.findElement(By.id("twotabsearchtextbox")).click();
    }
    @Test()
    public static void testLanguageSwitch() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
}





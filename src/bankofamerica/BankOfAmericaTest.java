package bankofamerica;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BankOfAmericaTest extends BankOfAmericaBase {

    @Test
    public static void bOALogo() {

        driver1.findElement(By.xpath("//*[@id=\"headerModule\"]/div[3]/div[1]/img")).isDisplayed();
    }

    @Test
    public static void bOAInvesting() {
        driver1.findElement(By.cssSelector("#navInvesting > span.title")).click();
        driver1.findElement(By.id("btnInvesting")).click();
        driver1.findElement(By.cssSelector("#CTA1 > span:nth-child(2)")).click();
        driver1.findElement(By.cssSelector("#defaultScreen > h1")).isDisplayed();
    }

    @Test
    public static void autoLoans() {
        driver1.findElement(By.cssSelector("#navAutoLoans > span.title")).click();
        driver1.findElement(By.id("autoApplyNow")).click();
        driver1.findElement(By.id("stateSelectModal")).click();
//        WebElement stateName= driver1.findElement(By.)
//        Select stName=new Select()
//        List<WebElement> stateList= driver1.findElements(By.xpath("//*[@id=\\\"stateSelectModal\\\"]/option[34]"));
//        for(WebElement stateName:stateList) {
//            String st= stateName.getText();
//            if (st.equalsIgnoreCase("New York")){
//                stateName.click();
//                break;
//            }
        }


    @Test
    public static void findAFinancialCenter() {
        driver1.findElement(By.id("finCenterLocator")).click();
        driver1.findElement(By.cssSelector("#q")).sendKeys("10463");
        driver1.findElement(By.id("aria-map-list-header")).isDisplayed();
    }

    @Test
    public static void enroll() {
        driver1.findElement(By.cssSelector("#enroll")).click();
        driver1.findElement(By.cssSelector("#title-section > div.row.mbottom-20 > div")).isDisplayed();
    }

    @Test
    public static void onlineId () throws InterruptedException {
        driver1.findElement(By.xpath("//*[@id=\"onlineId1\"]")).click();
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("Farhana");
    }

    @Test
    public static void password () throws InterruptedException {
        driver1.findElement(By.xpath("//*[@id=\"passcode1\"]")).click();
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//*[@id=\"passcode1\"]")).sendKeys("123456");
    }

    @Test
    public static void logIn () throws InterruptedException {
        driver1.findElement(By.xpath("//*[@id=\"onlineId1\"]")).click();
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//*[@id=\"onlineId1\"]")).sendKeys("Farhana");
        driver1.findElement(By.xpath("//*[@id=\"passcode1\"]")).click();
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//*[@id=\"passcode1\"]")).sendKeys("123456");
        Thread.sleep(2000);
        driver1.findElement(By.xpath("//*[@id=\"signIn\"]")).click();
    }
    @Test
    public static void searchButton () throws InterruptedException {
        driver1.findElement(By.xpath("//*[@id=\"nav-search-query\"]")).sendKeys("payment");
        Thread.sleep(2000);
        driver1.findElement(By.xpath("//*[@id=\"searchStub\"]/div/div/form/div[1]/input[2]")).click();
    }
    @Test
    public static void shopCreditCards () throws InterruptedException {
        driver1.findElement(By.xpath("//*[@id=\"navCreditCards\"]")).click();
        Thread.sleep(2000);
        driver1.findElement(By.id("btnCompareCreditCards")).click();
    }
}

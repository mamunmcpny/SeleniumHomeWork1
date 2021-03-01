package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ForgotPass {


    @Test
    public void rsetPass() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./Drivers/windows/chromedriver.exe");// create path

        WebDriver driver = new ChromeDriver();//create object of driver
        driver.get("https://opensource-demo.orangehrmlive.com/");// load url...

        driver.manage().window().maximize();// maximize window
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        String titlePage = driver.getTitle();
        System.out.println(titlePage);
        if (titlePage.equalsIgnoreCase("Orangehrm")) {
            System.out.println("Title Matched");
        } else
            System.out.println("Title didn't matched");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
        driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
        String name = driver.findElement(By.xpath("//div[@class='head']/h1")).getText();
        System.out.println("Instruction Sent !: " + name);


        Thread.sleep(10000);
        driver.quit();

    }
}

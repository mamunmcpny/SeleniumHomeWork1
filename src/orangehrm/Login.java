package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    @Test
    public void LoginPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./Drivers/windows/chromedriver.exe");// create path

        WebDriver driver = new ChromeDriver();//create object of driver
        driver.get("https://opensource-demo.orangehrmlive.com/");// load url...

        driver.manage().window().maximize();// maximize window
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        // enter user name
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        //enter password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        //click login button
        driver.findElement(By.xpath("//input[@class='button']")).click();

        Thread.sleep(5000);
        driver.quit();
    }

}

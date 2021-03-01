package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class HomePage {

    @Test
    public static void webPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./Drivers/windows/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        Thread.sleep(5000);

        driver.quit();

    }


}

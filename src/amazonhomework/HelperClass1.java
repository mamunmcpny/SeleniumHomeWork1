package amazonhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

    public class HelperClass1 {

        public static WebDriver driver;
        static String amazonUrl = "https://www.amazon.com/";

       @BeforeMethod
        public static void openBrowser() throws InterruptedException {

           String chromeDriverPath = "./Drivers/windows/chromedriver.exe";

           //System property for chrome driver
           System.setProperty("webdriver.chrome.driver", chromeDriverPath);
           //Instantiate a ChromeDriver class
           driver = new ChromeDriver();
           //Launch Website
           driver.get(amazonUrl);
           driver.manage().window().maximize();

       }
            @AfterMethod
            public void tearDown() throws InterruptedException {
                Thread.sleep(3000);
                driver.quit();
             }

        }
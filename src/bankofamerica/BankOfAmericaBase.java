package bankofamerica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BankOfAmericaBase {


        static WebDriver driver1;
        static String bOAUrl = "https://www.bankofamerica.com/";

        @BeforeMethod
        public static void openBrowser() throws InterruptedException {

            String chromeDriverPath = "./Drivers/windows/chromedriver.exe";

            //System property for chrome driver
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            //Instantiate a ChromeDriver class
            driver1 = new ChromeDriver();
            //Launch Website
            driver1.get(bOAUrl);
            driver1.manage().window().maximize();

        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(5000);
            driver1.quit();
        }
    }


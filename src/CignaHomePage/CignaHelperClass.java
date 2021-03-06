package CignaHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CignaHelperClass {

         public static WebDriver driver2;
         static String cignaUrl = "https://www.cigna.com/";

        @BeforeMethod
        public static void openBrowser(){

            String chromeDriverPath = "./Drivers/windows/chromedriver.exe";

            //System property for chrome driver
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            //Instantiate a ChromeDriver class
            driver2 = new ChromeDriver();
            //Launch Website
            driver2.get(cignaUrl);
            driver2.manage().deleteAllCookies();
            driver2.manage().window().maximize();

        }

        @AfterMethod
        public void tearDown() throws InterruptedException {
            Thread.sleep(5000);
            driver2.quit();
        }
    }


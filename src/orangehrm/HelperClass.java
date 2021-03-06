package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HelperClass {

    public static WebDriver driver;
    //public static WebDriver mostofa;


    public static void invokeBrowser(String url) {

        System.setProperty("webdriver.chrome.driver", "./Drivers/windows/chromedriver.exe");// create path

        driver = new ChromeDriver();//create object of driver
        //mostofa=new ChromeDriver();
        driver.get(url);// load url...
        driver.manage().window().maximize();// maximize window
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       // mostofa.get("http://www.............");



    }

    public static void login(String uid, String pass) {
//        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uid);
        //enter password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
        //click login button
        driver.findElement(By.xpath("//input[@class='button']")).click();


    }

    public static void verifyLogin() {
// verify login gettext method
//        String homepagetext = driver.findElement(By.xpath("//a[text()='Welcome Paul']")).getText();
//        if (homepagetext.contains("Welcome")) {
//            System.out.println("You are logged in properly");
        // bellow verify login using current url inspection text
        if (driver.getCurrentUrl().contains("dashboard")) {
            System.out.println("You are logged in properly");

        } else {

            System.out.println("Login failed");
        }
    }

    public static void logout() {

        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

    }

    public static void quitbrower() {

        driver.quit();
    }


//    public static void main(String[] args) {
//        HelperClass.InvokeBrowser("https://opensource-demo.orangehrmlive.com");
//
//        HelperClass.login("Admin", "admin123");
//        HelperClass.verifyLogin();
//        HelperClass.logout();
//
//    }


}


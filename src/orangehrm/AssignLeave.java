package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AssignLeave extends HelperClass {

    public static void leave(String empName) {
//        HelperClass.invokeBrowser("https://opensource-demo.orangehrmlive.com");
//        HelperClass.login("Admin", "admin123");
//
        driver.findElement(By.xpath("(//span[@class='quickLinkText'])[1]")).click();
        driver.findElement(By.xpath("//input[@name='assignleave[txtEmployee][empName]']")).sendKeys(empName);

        WebElement selectDropDown = driver.findElement(By.name("assignleave[txtLeaveType]"));
        Select leaveType = new Select(selectDropDown);
        leaveType.selectByVisibleText("US - Personal");
        //click on calender
        driver.findElement(By.name("assignleave[txtFromDate]")).click();
        //or
        //driver.findElement(By.xpath("//input[@name='assignleave[txtFromDate]']")).click();
        //select date    //" Lenth of Webelements :" +

        List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
        System.out.println(" Lenth of Webelements :" + dates.size());

        for (WebElement eachDate : dates) {
            String eDate = eachDate.getText();

            if (eDate.equalsIgnoreCase("18")) {
                eachDate.click();
                break;
            }

        }

        // Admin / admin123
        // Select calender to
        driver.findElement(By.xpath("//input[@name='assignleave[txtToDate]']")).click();
        //select to date
        List<WebElement> toDate = driver.findElements(By.xpath("//td[@data-event='click']/a"));

        for (WebElement endDate : toDate) {
            String finishDate = endDate.getText();

            if (finishDate.equalsIgnoreCase("31")) {
                endDate.click();
                break;
            }
        }
// "assignleave[partialDays]"
        // "Start and End Day"
        WebElement partialDays = driver.findElement(By.name("assignleave[partialDays]"));
        Select pDays = new Select(partialDays);
        pDays.selectByValue("start_end");

        driver.findElement(By.id("assignBtn")).click();
        //driver.findElement(By.cssSelector("#assignBtn")).click();

        driver.findElement(By.cssSelector("#confirmOkButton")).click();

    }

}







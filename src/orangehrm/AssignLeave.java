package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AssignLeave extends HelperClass {

    public static void leave(String empName) {
//        HelperClass.invokeBrowser("https://opensource-demo.orangehrmlive.com");
//        HelperClass.login("Admin", "admin123");
//
        driver.findElement(By.xpath("(//span[@class='quickLinkText'])[1]")).click();
        driver.findElement(By.xpath("//input[@name='assignleave[txtEmployee][empName]']")).sendKeys(empName);
        WebElement selectDd = driver.findElement(By.name("assignleave[txtLeaveType]"));
        Select leaveType = new Select(selectDd);
        leaveType.selectByVisibleText("US - Personal");
    }


}

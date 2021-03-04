package unitedhealthcare;

import orangehrm.HelperClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MedicareViaZip extends HelperClass {


    public static void PlanMedicare() {
        driver.findElement(By.xpath("(//a[text()='Medicare'])[1]")).click();
        driver.findElement(By.xpath("//input[@autocomplete='postal-code']")).sendKeys("11428");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("The result is: There are 22 plans available in 11428 Queens County");

    }


}

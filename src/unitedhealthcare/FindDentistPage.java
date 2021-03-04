package unitedhealthcare;

import orangehrm.HelperClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindDentistPage extends HelperClass {


    public static void findPage() {
        driver.findElement(By.xpath("(//a[text()='Find a Doctor'])[1]")).click();
        driver.findElement(By.xpath("//a[@aria-label='Find a Dentist Opens a new window']")).click();




    }

}

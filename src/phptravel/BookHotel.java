package phptravel;


import orangehrm.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookHotel extends HelperClass {

    public static void HotelBooking() {
        driver.findElement(By.cssSelector("div[id='s2id_autogen16']")).click();
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[1]/div")).click();

        driver.findElement(By.cssSelector("input[id='checkin']")).click();
        List<WebElement> bookingDate = driver.findElements(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[21]"));
        System.out.println(" Lenth of Webelements :" + bookingDate.size());

        for (WebElement checkindate: bookingDate) {
            String enterDate = checkindate.getText();
            if (enterDate.equalsIgnoreCase("20")) {
                checkindate.click();
                break;
            }

        }

    }

}


//        driver.findElement(By.cssSelector("input[id='checkout'']")).click();
//        List<WebElement> checkoutdate = driver.findElements(By.xpath(""))
//        for (WebElement checkout: checkoutdate) {
//            String finalcheckout = checkout.getText();
//            if (finalcheckout.equalsIgnoreCase("30")){
//                checkout.click();
//                break;
//
//            }
//        }
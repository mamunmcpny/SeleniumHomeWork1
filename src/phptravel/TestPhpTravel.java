package phptravel;

import orangehrm.HelperClass;

public class TestPhpTravel extends BookHotel{

    public static void main(String[] args) throws InterruptedException {

        HelperClass.invokeBrowser("https://www.phptravels.net/");
        BookHotel.HotelBooking();
        Thread.sleep(8000);
        //driver.quit();

    }

}

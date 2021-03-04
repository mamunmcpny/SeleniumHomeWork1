package unitedhealthcare;

import orangehrm.HelperClass;

public class TestUnitedHealthCare {

    public static void main(String[] args) throws InterruptedException {
        HelperClass.invokeBrowser("https://www.uhc.com/");
        //FindDentistPage.findPage();
        MedicareViaZip.PlanMedicare();
        Thread.sleep(3000);
        //HelperClass.quitbrower();
    }

}

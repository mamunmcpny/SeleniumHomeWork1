package orangehrm;

public class TestOrangeHrm {

    public static void main (String[]args) throws InterruptedException {

       HelperClass.InvokeBrowser("https://opensource-demo.orangehrmlive.com");
       HelperClass.login("Admin","admin123");
       HelperClass.verifyLogin();
       Thread.sleep(5000);
       HelperClass.logout();
       HelperClass.quitbrower();
    }

}

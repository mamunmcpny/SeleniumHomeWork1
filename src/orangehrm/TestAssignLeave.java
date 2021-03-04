package orangehrm;

public class TestAssignLeave {


    public static void main(String[] args) {

        HelperClass.invokeBrowser("https://opensource-demo.orangehrmlive.com");
        HelperClass.login("Admin","admin123");
        AssignLeave.leave("Jordan Mathews");


    }

}

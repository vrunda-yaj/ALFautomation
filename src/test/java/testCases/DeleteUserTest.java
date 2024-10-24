package testCases;

import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.DeleteUserPage;
import pageObjects.EditUserPage;

public class DeleteUserTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    DeleteUserPage Deleteuser;
    @Test(priority = 1)
    public void TC_EditUser() throws InterruptedException {
    	Deleteuser=new DeleteUserPage();
    	Deleteuser.fnDeleteUser();
    }
}

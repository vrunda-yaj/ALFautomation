package testCases;

import org.testng.annotations.Test;

import Utilities.AppUtil;
import pageObjects.AddUserPage;
import pageObjects.BasePage;
import pageObjects.EditUserPage;

public class EditUserTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    EditUserPage Edituser;
    @Test(priority = 1)
    public void TC_EditUser() throws InterruptedException {
    	Edituser=new EditUserPage();
    	Edituser.fnEditUser();
    }
        
	  

}

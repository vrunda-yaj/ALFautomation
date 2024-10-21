package testCases;

import org.testng.annotations.Test;

import Utilities.AppUtil;
import pageObjects.AddLotPage;
import pageObjects.AddUserPage;
import pageObjects.BasePage;

public class AddUserTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    AddUserPage Adduser;
    @Test(priority = 1)
    public void TC_NoDealerLot() throws InterruptedException {
    	Adduser=new AddUserPage();
    	Adduser.fnAddUser1();
    }
    
    
	    @Test(priority = 2)
    public void TC_DealerLot() throws InterruptedException {
	    	Adduser=new AddUserPage();    	
	    	Adduser.fnAddUser2();
    }

	    @Test(priority = 3)
	    public void TC_DealerMultiLot() throws InterruptedException {
		    	Adduser=new AddUserPage();    	
		    	Adduser.fnAddUser3();
	    }
}

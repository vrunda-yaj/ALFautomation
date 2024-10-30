package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AdminUtilities.AppUtil;
import pageObjects.AddLotPage;
import pageObjects.AddUserPage;
import pageObjects.BasePage;

public class AddUserTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    AddUserPage Adduser;
    ExtentReports extent;
    ExtentTest test;
    
    @Test(priority = 1)
    public void TC_NoDealerLot() throws InterruptedException {
    	try {
    	Adduser=new AddUserPage();
    	Adduser.fnAddUser1();
    	} catch (Exception e) {
	           test.fail("Test Add User failed: " + e.getMessage());
	           throw e;
	       }
    }
    
    
	    @Test(priority = 2)
    public void TC_DealerLot() throws InterruptedException {
	    	try {
	    	Adduser=new AddUserPage();    	
	    	Adduser.fnAddUser2();
	    	 test.pass("User successfully added");
	    	} catch (Exception e) {
		           test.fail("Test Add User failed: " + e.getMessage());
		           throw e;
		       }
    }

	    @Test(priority = 3)
	    public void TC_DealerMultiLot() throws InterruptedException {
	    	try {
		    	Adduser=new AddUserPage();    	
		    	Adduser.fnAddUser3();
		    	 test.pass("User successfully Added");
		       } catch (Exception e) {
		           test.fail("Test Add User failed: " + e.getMessage());
		           throw e;
		       }
		}       
		@AfterTest
		public void tearDown() {
		   extent.flush();  // Writes the report to the specified location
		}  
		  
	   
}

package testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AdminUtilities.AppUtil;
import pageObjects.AddLotPage;
import pageObjects.BasePage;

public class AddLotTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    AddLotPage Addlot;
    ExtentReports extent;
    ExtentTest test;
    
    @Test(priority = 1)
    public void tcCheckemptyDealer() throws InterruptedException {
    	try {
    	Addlot=new AddLotPage();
    	Addlot.fnCheckEmpty();
    	} catch (Exception e) {
	           test.fail("Test Add Lot failed: " + e.getMessage());
	           throw e;
	       }
    }
    
    
	    @Test(priority = 2)
    public void tcAddDealer() throws InterruptedException {
    	
	    	try {
	    	Addlot.fnAddLot();
	    	 test.pass("Lot successfully added");
	    	} catch (Exception e) {
		           test.fail("Test Add User failed: " + e.getMessage());
		           throw e;
		       }
    }

}

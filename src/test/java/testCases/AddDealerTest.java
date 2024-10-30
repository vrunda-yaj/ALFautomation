package testCases;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AdminUtilities.AppUtil;
import pageObjects.AddDealerPage;
import pageObjects.BasePage;



public class AddDealerTest extends BasePage {

	
	    AppUtil actionUtils = new AppUtil();
	    AddDealerPage Adddealer;
	    ExtentReports extent;
	    ExtentTest test;
	    
	    @Test(priority = 1)
	    public void tcCheckemptyDealer() throws InterruptedException {
	    	try {
	    	Adddealer=new AddDealerPage();
	 		 Adddealer.fnCheckEmpty();
	    	} catch (Exception e) {
		           test.fail("Test Add Dealer failed: " + e.getMessage());
		           throw e;
		       }
	    }
	    
	    
 	    @Test(priority = 2)
	    public void tcAddDealer() throws InterruptedException {
 	    	try {
	    	
 	    	Adddealer.fnAddDealer();
 	    	 test.pass("Dealer successfully added");
 	    	} catch (Exception e) {
 	           test.fail("Test Add Dealer failed: " + e.getMessage());
 	           throw e;
 	       }
	    }
}

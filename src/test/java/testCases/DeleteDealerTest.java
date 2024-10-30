package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AdminUtilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.DeleteDealerPage;


public class DeleteDealerTest extends BasePage {

	DeleteDealerPage deletedealer;
		    AppUtil actionUtils = new AppUtil();
		    ExtentReports extent;
		    ExtentTest test;
	 
		  
	   @Test(priority = 1)
	   public void tcDeleteDealer() throws InterruptedException {
		   try {
		  
		   deletedealer=new DeleteDealerPage();
		   deletedealer.fnDeleteDealer();
		   test.pass("Dealer successfully deleted");
       } catch (Exception e) {
           test.fail("Test Delete Dealer failed: " + e.getMessage());
           throw e;
       }
}       
@AfterTest
public void tearDown() {
   extent.flush();  // Writes the report to the specified location
}  
   }
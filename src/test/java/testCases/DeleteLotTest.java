package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import AdminUtilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.DeleteDealerPage;
import pageObjects.DeleteLotPage;

public class DeleteLotTest extends BasePage {

	DeleteLotPage deletelot;
		    AppUtil actionUtils = new AppUtil();
		    ExtentReports extent;
		    ExtentTest test;
	 
		  
	   @Test(priority = 1)
	   public void tcDeleteLot() throws InterruptedException {
		   try {
		  
		   deletelot=new DeleteLotPage();
		   deletelot.fnDeleteLot();
		   test.pass("Lot successfully deleted");
	       } catch (Exception e) {
	           test.fail("Test Delete Lot failed: " + e.getMessage());
	           throw e;
	       }
	}       
	@AfterTest
	public void tearDown() {
	   extent.flush();  // Writes the report to the specified location
	}  
	   }
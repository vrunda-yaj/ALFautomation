package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import AdminUtilities.AppUtil;
import AdminUtilities.ExtentManager;
import pageObjects.BasePage;
import pageObjects.EditDealerPage;
import pageObjects.LoginPage;

public class EditDealerTest extends BasePage {

	EditDealerPage editdealer;
	    AppUtil actionUtils = new AppUtil();

	    ExtentReports extent;
	    ExtentTest test;
	    ExtentSparkReporter sparkReporter;
 
	    
	    @BeforeTest
	    public void setUpReport() {
	        // Specify the report location
	    	 extent = ExtentManager.getInstance();
	    }
	    @BeforeMethod
	    public void beforeMethod() {
	        // Initialize ExtentTest before each test case
	        test = extent.createTest("Edit Lot Test: " + this.getClass().getSimpleName());
	    }
   @Test(priority = 1)
   public void tcEditDealer() throws InterruptedException {
	   try {
	  
	   EditDealerPage editdealer=new EditDealerPage();
	   editdealer.fnEditDealer();
	   test.pass("Dealer successfully edited");
       } catch (Exception e) {
           test.fail("Test Edit Dealer failed: " + e.getMessage());
           throw e;
       }
}       
@AfterTest
public void tearDown() {
   extent.flush();  // Writes the report to the specified location
}  
   }


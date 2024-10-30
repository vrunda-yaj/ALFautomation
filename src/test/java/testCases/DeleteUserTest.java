package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import AdminUtilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.DeleteUserPage;
import pageObjects.EditUserPage;

public class DeleteUserTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    DeleteUserPage Deleteuser;
    ExtentReports extent;
    ExtentTest test;
       
    @Test(priority = 1)
    public void TC_EditUser() throws InterruptedException {
    	try {
    	Deleteuser=new DeleteUserPage();
    	Deleteuser.fnDeleteUser();
    	test.pass("User successfully deleted");
        } catch (Exception e) {
            test.fail("Test Delete User failed: " + e.getMessage());
            throw e;
        }
 }       
 @AfterTest
 public void tearDown() {
    extent.flush();  // Writes the report to the specified location
 }  
    }

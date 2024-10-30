package testCases;

import java.util.HashMap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.github.javafaker.Faker;

import AdminUtilities.AppUtil;
import AdminUtilities.ExtentManager;
import pageObjects.AddUserPage;
import pageObjects.BasePage;
import pageObjects.EditUserPage;

public class EditUserTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    EditUserPage Edituser;
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
	        test = extent.createTest("Edit User Test: " + this.getClass().getSimpleName());
	    }
	    
    @Test(priority = 1)
    public void TC_EditUser() throws InterruptedException {
    	 try {
	          
    	Edituser=new EditUserPage();
    	Edituser.fnEditUser();
    	
    	test.pass("User successfully edited");
	        } catch (Exception e) {
	            test.fail("TestEditUser failed: " + e.getMessage());
	            throw e;
	        }
    }       
    @AfterTest
    public void tearDown() {
        extent.flush();  // Writes the report to the specified location
    }  

}

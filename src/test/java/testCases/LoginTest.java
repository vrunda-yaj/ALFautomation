package testCases;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
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
import pageObjects.BasePage;
import pageObjects.LoginPage;


public class LoginTest extends BasePage {

	 LoginPage login;
	    AppUtil actionUtils = new AppUtil();
	    Faker faker;
		HashMap<String, String> requestBody = new HashMap<>();
		
		 ExtentReports extent;
		    ExtentTest test;
		 
  
	    @BeforeTest
	    public void launchURL(){
	       
	             // Specify the report location
	    	 extent = ExtentManager.getInstance();
		        
		        getLaunchUrl("chrome");
		        login= new LoginPage();
		    }
	       
	    @BeforeMethod
	    public void beforeMethod() {
	        // Initialize ExtentTest before each test case
	        test = extent.createTest("Login Test: " + this.getClass().getSimpleName());
	    }

    @Test(priority = 1)
    public void userLogin() {
    	 try {
	            login.inputUserValidLogin();
	            test.pass("User successfully logged in");
	         } catch (Exception e) {
	            test.fail("LoginUser failed: " + e.getMessage());
	            throw e;
	        }
    }
    @AfterTest
    public void tearDown() {
        extent.flush();  // Writes the report to the specified location
    }
}

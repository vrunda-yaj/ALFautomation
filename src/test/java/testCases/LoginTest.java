package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.LoginPage;

public class LoginTest extends BasePage {

	 LoginPage login;
	    AppUtil actionUtils = new AppUtil();

  
	    @BeforeTest
	    public void launchURL(){
	        getLaunchUrl("chrome");
	        login= new LoginPage();
	       
	    }

    @Test(priority = 1)
    public void userLogin() {
        login.inputUserValidLogin();
    }
}
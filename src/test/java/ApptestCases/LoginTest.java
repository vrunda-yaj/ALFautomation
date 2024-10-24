package ApptestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import AppPageObject.BasePage;
import AppPageObject.LoginPage;
import AppUtilities.AppActionUtil;

public class LoginTest extends BasePage {
	LoginPage loginPage;
	AppActionUtil actionUtils = new AppActionUtil();

    @BeforeTest
    public void launchURL(){
        getLaunchUrl("chrome");
        loginPage = new LoginPage();
       // loginPage.deleteAllure();
    }

    
    @Test(priority = 1)
    public void passwordForget() {
        loginPage.forgetPassword();
    }

    
    @Test(priority = 2)
    public void invalidLogin(){
        loginPage.inputUserInValidLogin();
        //actionUtils.screenshot();
    }

   
    @Test(priority = 3)
    public void userLogin(){
        loginPage.inputUserValidLogin();
       // actionUtils.screenshot();
    }

   
  /*  @Test(priority = 4)
    public void clickSelectLot() throws InterruptedException {
        loginPage.selectLot();
        AppUtil.waitFor(2);
       // actionUtils.screenshot();
    }
*/
   
    @Test(priority = 5)
    public void clickCreateApplication() throws InterruptedException {
        loginPage.clickOnCreateApplication();
       // actionUtils.screenshot();
    }

    
    @AfterTest
    public void userLogout() throws InterruptedException {
    	AppActionUtil.waitFor(5);
        loginPage.logOut();
      //  actionUtils.screenshot();
//        driver.quit();
    }
	

}

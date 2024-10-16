package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.EditDealerPage;
import pageObjects.LoginPage;

public class EditDealerTest extends BasePage {

	EditDealerPage editdealer;
	    AppUtil actionUtils = new AppUtil();

 
	  
   @Test(priority = 1)
   public void tcEditDealer() throws InterruptedException {
	  
	   EditDealerPage editdealer=new EditDealerPage();
	   editdealer.fnEditDealer();
   }
}

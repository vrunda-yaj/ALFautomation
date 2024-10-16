package testCases;

import org.testng.annotations.Test;

import Utilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.DeleteDealerPage;


public class DeleteDealerTest extends BasePage {

	DeleteDealerPage deletedealer;
		    AppUtil actionUtils = new AppUtil();

	 
		  
	   @Test(priority = 1)
	   public void tcDeleteDealer() throws InterruptedException {
		  
		   deletedealer=new DeleteDealerPage();
		   deletedealer.fnDeleteDealer();
	   }

}

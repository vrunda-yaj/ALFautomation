package testCases;

import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.DeleteDealerPage;
import pageObjects.DeleteLotPage;

public class DeleteLotTest extends BasePage {

	DeleteLotPage deletelot;
		    AppUtil actionUtils = new AppUtil();

	 
		  
	   @Test(priority = 1)
	   public void tcDeleteLot() throws InterruptedException {
		  
		   deletelot=new DeleteLotPage();
		   deletelot.fnDeleteLot();
	   }

}

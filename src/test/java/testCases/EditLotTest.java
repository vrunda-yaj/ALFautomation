package testCases;

import org.testng.annotations.Test;

import Utilities.AppUtil;
import pageObjects.BasePage;
import pageObjects.EditLotPage;

public class EditLotTest extends BasePage {

	EditLotPage editlot;
	    AppUtil actionUtils = new AppUtil();

 
	  
   @Test(priority = 1)
   public void tcEditLot() throws InterruptedException {
	  
	   editlot=new EditLotPage();
	   editlot.fnEditLot();
   }

}

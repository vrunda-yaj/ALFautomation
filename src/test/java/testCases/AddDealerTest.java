package testCases;


import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import pageObjects.AddDealerPage;
import pageObjects.BasePage;



public class AddDealerTest extends BasePage {

	
	    AppUtil actionUtils = new AppUtil();
	    AddDealerPage Adddealer;
	    @Test(priority = 1)
	    public void tcCheckemptyDealer() throws InterruptedException {
	    	Adddealer=new AddDealerPage();
	 		 Adddealer.fnCheckEmpty();
	    }
	    
	    
 	    @Test(priority = 2)
	    public void tcAddDealer() throws InterruptedException {
	    	
 	    	Adddealer.fnAddDealer();
	    }
}

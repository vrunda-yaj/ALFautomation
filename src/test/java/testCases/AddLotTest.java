package testCases;

import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import pageObjects.AddLotPage;
import pageObjects.BasePage;

public class AddLotTest extends BasePage {

	
    AppUtil actionUtils = new AppUtil();
    AddLotPage Addlot;
    @Test(priority = 1)
    public void tcCheckemptyDealer() throws InterruptedException {
    	Addlot=new AddLotPage();
    	Addlot.fnCheckEmpty();
    }
    
    
	    @Test(priority = 2)
    public void tcAddDealer() throws InterruptedException {
    	
	    	Addlot.fnAddLot();
    }

}

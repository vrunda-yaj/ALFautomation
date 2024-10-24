package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;

public class DeleteLotPage extends BasePage {
	public DeleteLotPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for login page
    @FindBy(xpath = "//span[@class='fa fa-trash-o']") 
    WebElement btnLotDelete;
    @FindBy(xpath = "//*[@id='roofTops']/tbody/tr/td[2]")
    WebElement lotname;
   
    @FindBy(xpath = "//input[@type='search']")
    WebElement search;
   
    @FindBy(xpath = "//a[@id='confirmDeleteUser']")
    WebElement deletebtn;
    @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
   

    
   
    AppUtil actionUtils = new AppUtil();
    public void fnDeleteLot() throws InterruptedException
    {
    	 SoftAssert softAssert = new SoftAssert();
    	String lot_name=DELETE_LOTNAME;
    	AppUtil.waitFor(5);
    	 AppUtil.setText(search,lot_name);
    	 AppUtil.waitFor(2);
    	 String lotnm=AppUtil.getText(lotname);
    	 System.out.println(lotnm);
    	 Assert.assertEquals(lotnm, lot_name);
    	 AppUtil.click(btnLotDelete);
    	 
    	 AppUtil.waitFor(2); 	
    	 AppUtil.click(deletebtn);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "Lot deleted successfully");
    	
    	 
    	 
    	
    }


}

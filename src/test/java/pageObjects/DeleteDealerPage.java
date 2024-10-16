package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utilities.AppUtil;

public class DeleteDealerPage extends BasePage {
	public DeleteDealerPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for login page
    @FindBy(xpath = "//*[@title=\"Delete Dealer\"]/span") 
    WebElement firstdelete;
    @FindBy(xpath = "//*[@id=\"allDealers\"]/tbody/tr/td[2]") 
    WebElement dealername;
   
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
       
    @FindBy(xpath = "//input[@type='search']")
    WebElement search;
   
    @FindBy(xpath = "//a[@id='confirmDeleteOrganization']")
    WebElement deletebtn;
    @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
   

    
   
    AppUtil actionUtils = new AppUtil();
    public void fnDeleteDealer() throws InterruptedException
    {
    	 SoftAssert softAssert = new SoftAssert();
    	String dealer_name=DELETE_DEALNAME;
    	AppUtil.waitFor(5);
    	 AppUtil.setText(search,dealer_name);
    	 AppUtil.waitFor(2);
    	 String dealernm=AppUtil.getText(dealername);
    	 System.out.println(dealernm);
    	 Assert.assertEquals(dealernm, dealer_name);
    	 AppUtil.click(firstdelete);
    	 
    	 AppUtil.waitFor(2); 	
    	 AppUtil.click(deletebtn);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "Dealer deleted successfully");
    	
    	 
    	 
    	
    }


}

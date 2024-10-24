package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;

public class DeleteUserPage extends BasePage {

    public DeleteUserPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for user page
        
    @FindBy(xpath = "(//input[@id='userSearch'])[2]")
    WebElement search;
    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    WebElement matchLname;
    @FindBy(xpath = "//span[@class='fa fa-trash-o']")
    WebElement btnDelete;
    @FindBy(xpath = "//a[@id='confirmDeleteUser']")
    WebElement btn_confirmDel;
    
     @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
    
  
    AppUtil actionUtils = new AppUtil();
    SoftAssert softAssert = new SoftAssert();
    
      
    //Function without assigning dealer and lot
    public void fnDeleteUser() throws InterruptedException
    {
    	 SoftAssert softAssert = new SoftAssert();
    	 AppUtil.waitFor(13);
    		//AppUtil.setText(search,"Vrunda");
    		search.sendKeys(DELETE_UNAME + Keys.ENTER);
    		AppUtil.waitFor(3);  
    	 String lname = AppUtil.getText(search);
      softAssert.assertEquals(lname, matchLname);
      AppUtil.click(btnDelete);
      AppUtil.waitFor(2); 
     	 
     	 AppUtil.click(btn_confirmDel);
     	 
     	 String success = AppUtil.getText(successMsg);
          softAssert.assertEquals(success, "User deleted successfully");
    	    	
    }

}

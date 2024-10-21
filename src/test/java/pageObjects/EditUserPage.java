package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utilities.AppUtil;

public class EditUserPage extends BasePage {

    public EditUserPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for user page
        
    @FindBy(xpath = "(//input[@id='userSearch'])[2]")
    WebElement search;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    WebElement matchFname;
    @FindBy(xpath = "//span[@class='ion-edit'][1]")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='userPhone']")
    WebElement uphone;
    @FindBy(xpath = "//input[@id='motherLastName']")
    WebElement motherlname; 
    
    @FindBy(xpath = "//button[@id='btnSaveUserS']")
    WebElement btnSave;
    @FindBy(xpath = "//button[@id='btnSaveUser']")
    WebElement btnsaveuser;
    
     @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
    
  
    AppUtil actionUtils = new AppUtil();
    SoftAssert softAssert = new SoftAssert();
    
      
    //Function without assigning dealer and lot
    public void fnEditUser() throws InterruptedException
    {
    	AppUtil.waitFor(13);
   		//AppUtil.setText(search,"Vrunda");
   		search.sendKeys("Vrunda" + Keys.ENTER);
   		AppUtil.waitFor(3);  
   	 String fname = AppUtil.getText(search);
     softAssert.assertEquals(fname, matchFname);
     AppUtil.click(btnEdit);
     AppUtil.waitFor(2); 
   		AppUtil.clear(uphone);
   		AppUtil.setText(uphone,EDIT_UPHONE);
    	AppUtil.clear(motherlname);
   	 AppUtil.setText(motherlname,EDIT_UMOTHERLNAME);
   	AppUtil.scroll_till_element(btnSave);
    	AppUtil.click(btnSave);
    	 AppUtil.waitFor(2); 
    	 AppUtil.click(btnsaveuser);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "User details updated successfully.");
    	    	
    }

}

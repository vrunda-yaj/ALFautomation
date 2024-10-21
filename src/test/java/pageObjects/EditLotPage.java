package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Utilities.AppUtil;

public class EditLotPage extends BasePage {

    public EditLotPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for login page
    @FindBy(xpath = "//input[@type='search']")
    WebElement search;
    @FindBy(xpath = "//*[@id='roofTops']/tbody/tr/td[2]")
    WebElement lotname;
    @FindBy(xpath = "//span[@class='fa fa-pencil']")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='roofTopPhone']")
    WebElement lotphoneno;
       
    @FindBy(xpath = "//input[@id='roofTopZipCode']")
    WebElement lotzip;
    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement savebtn;
    @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
   

    
   
    AppUtil actionUtils = new AppUtil();
    public void fnEditLot() throws InterruptedException
    {
    	 SoftAssert softAssert = new SoftAssert();
    	
    	 String lot_name=EDIT_LOTNAME;
     	AppUtil.waitFor(3);
     	 AppUtil.setText(search,lot_name);
     	 AppUtil.waitFor(2);
     	 String lotnm=AppUtil.getText(lotname);
     	 System.out.println(lotnm);
     	 Assert.assertEquals(lotnm, lot_name);
     	 AppUtil.click(btnEdit);
     	 
     	 AppUtil.waitFor(2); 	
     	AppUtil.clear(lotphoneno);
   	 AppUtil.setText(lotphoneno,EDIT_LOTPHONE);
   	 AppUtil.clear(lotzip);
   	 AppUtil.setText(lotzip,EDIT_LOTZIP);
   	 AppUtil.scroll_till_element(savebtn);
          AppUtil.click(savebtn);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "Lot details updated successfully.");
    	
    	 
    	 
    	
    }

}

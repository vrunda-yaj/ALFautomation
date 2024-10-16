package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.AppUtil;

public class AddDealerPage  extends BasePage {

    public AddDealerPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for login page
    @FindBy(xpath = "//a[@class='btn-add-new-org']") 
    WebElement btnAdddealer;
    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement pageheading;
    @FindBy(xpath = "//ul/li[3]/a/span[1]")
    WebElement Dealermenu;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
       
    @FindBy(xpath = "//input[@id='dealerName']")
    WebElement dealernm;
    @FindBy(xpath = "//input[@id='dealerPOCName']")
    WebElement dealerpocnm;
    @FindBy(xpath = "//a[contains(text(),'Next')]")
    WebElement btnNext;
    @FindBy(xpath = "//input[@id='dealerEmail']")
    WebElement email;
    @FindBy(xpath = "//input[@id='dealerPhone']")
    WebElement phoneno;
    @FindBy(xpath = "//textarea[@id='dealerAddress']")
    WebElement address;
    @FindBy(xpath = "//input[@id='dealerCity']")
    WebElement city;
    @FindBy(xpath = "//select[@id='dealerState']")
    WebElement state;
    @FindBy(xpath = "//select[@id='dealerTimeZone']")
    WebElement timezone;
    
    @FindBy(xpath = "//input[@id='dealerZip']")
    WebElement zipCode;
    @FindBy(xpath = "//a[contains(text(),'Previous')]")
    WebElement previousbtn;
    @FindBy(xpath = "//a[contains(text(),'Next')]")
    WebElement nextbtn;
    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement savebtn;
    @FindBy(xpath= "//a[contains(text(),'  Contact Information ')]")
    WebElement contacttab;
    @FindBy(xpath= "//a[contains(text(),'Address Information')]")
    WebElement addresstab;
    @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
    @FindBy(xpath = "//small[@data-fv-for='dealerName']")
    WebElement err_dealernm; 
    @FindBy(xpath = "//small[@data-fv-for='dealerPOCName']")
    WebElement err_dealerpocnm;
    @FindBy(xpath = "//small[@data-fv-for='dealerEmail']")
    WebElement err_dealeremail;
    @FindBy(xpath = "//small[@data-fv-for='dealerPhone']")
    WebElement err_dealerphone;
  
    AppUtil actionUtils = new AppUtil();
    SoftAssert softAssert = new SoftAssert();
    public void fnAddDealer() throws InterruptedException
    {
    	 
    	
    	 AppUtil.waitFor(4);
    	
    	 AppUtil.setText(dealernm,ADD_DEALNAME);
    	 AppUtil.setText(dealerpocnm,ADD_DEALPOCNAME);
    	 AppUtil.setText(email,ADD_EMAIL);
    	 AppUtil.setText(phoneno,ADD_PHONENO);
    	 AppUtil.waitFor(2);
    	 AppUtil.click(nextbtn);
    	 AppUtil.waitFor(4);
    	 AppUtil.setText(address,ADD_ADDRESS);
    	 AppUtil.setText(city,ADD_CITY);
    	 AppUtil.select_by_value(state, "PR");
    	 AppUtil.waitFor(2);    	
    	 AppUtil.clear(zipCode);
    	 AppUtil.setText(zipCode,ADD_ZIP);
    	 AppUtil.select_by_value(timezone, "America/Phoenix");
    	 AppUtil.click(savebtn);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "Dealer has been created successfully.");
    	    	
    }
	
    
    public void fnCheckEmpty() throws InterruptedException
    {
    	AppUtil.waitFor(10);
   	 	AppUtil.click(btnAdddealer);
    	 AppUtil.waitFor(4);
    	 
    	 AppUtil.click(nextbtn);
    	 
    	 String err_dealername = AppUtil.getText(err_dealernm);
         softAssert.assertEquals(err_dealername, "Dealer name is required");
         
         String err_dealerpocname = AppUtil.getText(err_dealerpocnm);
         softAssert.assertEquals(err_dealerpocname, "Dealer Legal name is required");
    	 
         String err_dealermail = AppUtil.getText(err_dealeremail);
         softAssert.assertEquals(err_dealermail, "Dealer POC email is required");
         
         String err_dealerphoneno = AppUtil.getText(err_dealerphone);
         softAssert.assertEquals(err_dealerphoneno, "Dealer POC phone number is required");
    	
    }
	

}

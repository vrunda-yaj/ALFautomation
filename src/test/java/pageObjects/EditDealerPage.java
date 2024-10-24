package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;

public class EditDealerPage  extends BasePage {

    public EditDealerPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for login page
    @FindBy(xpath = "//*[@id=\"allDealers\"]/tbody/tr[1]/td[5]/div/a[1]/span") 
    WebElement firstedit;
    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement pageheading;
    @FindBy(xpath = "//ul/li[3]/a/span[1]")
    WebElement Dealermenu;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
       
    @FindBy(xpath = "//input[@id='dealerPhone']")
    WebElement phoneno;
    @FindBy(xpath = "//input[@id='dealerEmail']")
    WebElement email;
    @FindBy(xpath = "//a[contains(text(),'Next')]")
    WebElement btnNext;
    @FindBy(xpath = "//input[@id='dealerZip']")
    WebElement zipCode;
    @FindBy(xpath = "//a[contains(text(),'Previous')]")
    WebElement previousbtn;
    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement savebtn;
    @FindBy(xpath= "//a[contains(text(),'  Contact Information ')]")
    WebElement contacttab;
    @FindBy(xpath= "//a[contains(text(),'Address Information')]")
    WebElement addresstab;
    @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
   

    
   
    AppUtil actionUtils = new AppUtil();
    public void fnEditDealer() throws InterruptedException
    {
    	 SoftAssert softAssert = new SoftAssert();
    	
    	AppUtil.waitFor(5);
    	 AppUtil.click(firstedit);
    	 
    	 String showcontactinfo = AppUtil.getText(contacttab);
         softAssert.assertEquals(showcontactinfo, "Contact Information");
    	 AppUtil.clear(phoneno);
    	 AppUtil.setText(phoneno,EDIT_PHONENO);
    	 AppUtil.clear(email);
    	 AppUtil.setText(email,EDIT_EMAIL);
    	 AppUtil.waitFor(2);
    	 AppUtil.click(addresstab);
    	 AppUtil.waitFor(2);
    	 AppUtil.clear(zipCode);
    	 AppUtil.setText(zipCode,EDIT_ZIP);
    	
    	 AppUtil.click(savebtn);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "Dealer details saved successfully.");
    	
    	 
    	 
    	
    }
	
	

}

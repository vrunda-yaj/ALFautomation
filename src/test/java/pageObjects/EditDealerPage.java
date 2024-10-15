package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utilities.AppUtil;

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
    @FindBy(xpath = "//button[contains(text(),'Verify OTP')]")
    WebElement btn_otp;

    // Method to handle valid user login
    public void clickDealermenu() {
        SoftAssert softAssert = new SoftAssert();

        try {
        	
          AppUtil.click(Dealermenu);
           
       //  String pagehead = AppUtil.getText(pageheading);
         // softAssert.assertEquals(pagehead, "Dealers");
          AppUtil.waitFor(2);
          AppUtil.click(Dealermenu);
          
         
            
        } catch (Exception e) {
            // Handle any exception that occurs during login process
            System.out.println("An error occurred: " + e.getMessage());
            softAssert.fail("Dealer process failed due to exception: " + e.getMessage());
        } finally {
            // Ensure all assertions are verified at the end
            softAssert.assertAll();
        }
    }
    
    public void clickEdit() throws InterruptedException
    {
    	 SoftAssert softAssert1 = new SoftAssert();
    	AppUtil.waitFor(5);
    	 AppUtil.click(firstedit);
    	 
    	 String showcontactinfo = AppUtil.getText(contacttab);
         softAssert1.assertEquals(showcontactinfo, "Contact Information");
    	 AppUtil.clear(phoneno);
    	 AppUtil.setText(phoneno,"(888) 343-1264");
    	 AppUtil.clear(email);
    	 AppUtil.setText(email,"test02@yopmail.com");
    	 AppUtil.waitFor(2);
    	 AppUtil.click(addresstab);
    	 AppUtil.waitFor(2);
    	 AppUtil.clear(zipCode);
    	 AppUtil.setText(zipCode,"00975");
    	
    	 AppUtil.click(savebtn);
    	 String success = AppUtil.getText(successMsg);
         softAssert1.assertEquals(success, "Dealer details saved successfully.");
    	
    	 
    	 
    	
    }
	
	

}

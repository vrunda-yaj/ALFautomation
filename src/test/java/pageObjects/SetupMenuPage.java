package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utilities.AppUtil;

public class SetupMenuPage  extends BasePage {

    public SetupMenuPage() {
    	PageFactory.initElements(driver,this);
    }

	
	 @FindBy(xpath = "//ul/li[3]/a/span[1]")
	    WebElement Dealermenu;
	 AppUtil actionUtils = new AppUtil();
	 public void fnDealermenu() {
	        SoftAssert softAssert = new SoftAssert();

	        try {       	
	      
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

}

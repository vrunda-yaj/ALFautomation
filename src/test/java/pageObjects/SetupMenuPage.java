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
	 @FindBy(xpath = "//ul/li[4]/a/span[1]")  //ul/li[5]/a/span[1]
	    WebElement Lotmenu;
	 @FindBy(xpath = "//span[normalize-space()='Users']")  //ul/li[5]/a/span[1]
	    WebElement Usermenu;
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
	 
	 public void fnLotmenu() {
	        SoftAssert softAssert = new SoftAssert();

	        try {       	
	      
	        	AppUtil.waitFor(2);
	        	AppUtil.click(Lotmenu);  
	                     
	        } catch (Exception e) {
	            // Handle any exception that occurs during login process
	            System.out.println("An error occurred: " + e.getMessage());
	            softAssert.fail("Lot process failed due to exception: " + e.getMessage());
	        } finally {
	            // Ensure all assertions are verified at the end
	            softAssert.assertAll();
	        }
	    }
	 public void fnUsermenu() {
	        SoftAssert softAssert = new SoftAssert();

	        try {       	
	      
	        	AppUtil.waitFor(2);
	        	AppUtil.click(Usermenu);  
	                     
	        } catch (Exception e) {
	            // Handle any exception that occurs during login process
	            System.out.println("An error occurred: " + e.getMessage());
	            softAssert.fail("User process failed due to exception: " + e.getMessage());
	        } finally {
	            // Ensure all assertions are verified at the end
	            softAssert.assertAll();
	        }
	    }

}

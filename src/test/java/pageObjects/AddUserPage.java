package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;

public class AddUserPage extends BasePage {

    public AddUserPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for user page
        
    @FindBy(xpath = "//a[@class='add-new-btn']")
    WebElement btnadduser;
    
    @FindBy(xpath = "//input[@id='firstName']")
    WebElement uname;
    @FindBy(xpath = "//input[@id='middleName']")
    WebElement mname;
    @FindBy(xpath = "//input[@id='userPhone']")
    WebElement uphone;
      @FindBy(xpath = "//input[@id='jobTitle']")
    WebElement title;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lname;
    @FindBy(xpath = "//input[@id='motherLastName']")
    WebElement motherlname; 
    @FindBy(xpath = "//select[@id='role']")
    WebElement jobrole;
    @FindBy(xpath = "//select[@id='getDealers']")
    WebElement DealerList;
    @FindBy(xpath = "//select[@id='setroofTops']")
    WebElement LotList;
  
    @FindBy(xpath = "//button[@id='btnSaveUserS']")
    WebElement btnSave;
    @FindBy(xpath = "//button[@id='btnSaveUser']")
    WebElement btnsaveuser;
    
     @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
    
  
    AppUtil actionUtils = new AppUtil();
    SoftAssert softAssert = new SoftAssert();
    
    public void fnSetUserdetails()
    {
    	 AppUtil.setText(uname,ADD_UFNAME);
    	 AppUtil.setText(mname,ADD_UMNAME);
    	 AppUtil.setText(uphone,ADD_UPHONE);
    	 AppUtil.setText(title,ADD_UTITLE);
    	 AppUtil.setText(email,ADD_UEMAIL);    	
    	 AppUtil.setText(lname,ADD_ULNAME);   	
      	
    	 AppUtil.setText(motherlname,ADD_UMOTHERLNAME);
    	
    }
    
    //Function without assigning dealer and lot
    public void fnAddUser1() throws InterruptedException
    {
    	AppUtil.waitFor(13);
   		AppUtil.click(btnadduser);
   		AppUtil.waitFor(4);  
   		
   		fnSetUserdetails(); //function inserts the user details
    	 AppUtil.select_by_value(jobrole, "R_ANKITTEST_F_AND_I");
    	 AppUtil.waitFor(2); 
    	 AppUtil.click(btnSave);
    	 AppUtil.waitFor(2); 
    	 AppUtil.click(btnsaveuser);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "New user successfully created.");
    	    	
    }
    
    ////Function with assigning dealer and lot
    public void fnAddUser2() throws InterruptedException
    {
    	AppUtil.waitFor(13);
   		AppUtil.click(btnadduser);
   		AppUtil.waitFor(4);
   		
   		 fnSetUserdetails(); //function inserts the user details   	   		
    	 AppUtil.select_by_value(jobrole, "R_ANKITTEST_F_AND_I");
    	 AppUtil.waitFor(4); 
    	 AppUtil.select_by_visiblityText(DealerList, "Audi");
    	 AppUtil.waitFor(4); 
    	 AppUtil.select_by_visiblityText(LotList, "Audi store 2");
    	 AppUtil.click(btnSave);
    	 AppUtil.waitFor(2); 
    	 AppUtil.click(btnsaveuser);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "New user successfully created.");
    	    	
    }
    
    ////Function with assigning dealer and lot
    public void fnAddUser3() throws InterruptedException
    {
    	AppUtil.waitFor(13);
   		AppUtil.click(btnadduser);
   		AppUtil.waitFor(4);    	
   		
   		fnSetUserdetails(); //function inserts the user details
    	 AppUtil.select_by_value(jobrole, "R_ANKITTEST_F_AND_I");
    	 AppUtil.waitFor(4); 
    	 AppUtil.select_by_visiblityText(DealerList, "Audi");
    	 AppUtil.waitFor(4); 
    	 AppUtil.select_by_visiblityText(LotList, "Audi store 2");
    	 AppUtil.select_by_visiblityText(LotList, "Audi store3");
    	 AppUtil.click(btnSave);
    	 AppUtil.waitFor(2); 
    	 AppUtil.click(btnsaveuser);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "New user successfully created.");
    	    	
    }
	
    
   
}

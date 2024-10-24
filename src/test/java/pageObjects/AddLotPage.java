package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;

public class AddLotPage extends BasePage {

    public AddLotPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for lot page
        
    @FindBy(xpath = "//a[@id='getLinks1']")
    WebElement btnaddlot;
    @FindBy(xpath = "//select[@id='getDealers']")
    WebElement selectdealer; //value=1042
    @FindBy(xpath = "//input[@id='roofTopName']")
    WebElement lotnm;
    @FindBy(xpath = "//input[@id='roofTopPocName']")
    WebElement lotpocnm;
    @FindBy(xpath = "//input[@id='lotCode']")
    WebElement lotcd;
      @FindBy(xpath = "//input[@id='roofTopPhone']")
    WebElement lotphoneno;
    @FindBy(xpath = "//input[@id='roofTopPoc']")
    WebElement lotemail;
    @FindBy(xpath = "//textarea[@id='roofTopAddress']")
    WebElement lotaddress;
    @FindBy(xpath = "//input[@id='roofTopPocPhone']")
    WebElement lotpocphoneno; 
    @FindBy(xpath = "//select[@id='roofTopState']")
    WebElement lotstate;
    @FindBy(xpath = "//select[@id='roofTopTimeZone']")
    WebElement lottimezone;
    @FindBy(xpath = "//input[@id='roofTopZipCode']")
    WebElement lotzip;
    @FindBy(xpath = "//input[@id='roofTopCity']")
    WebElement lotcity;
    @FindBy(xpath = "//a[contains(text(),'Previous')]")
    WebElement previousbtn;
    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement savebtn;
     @FindBy(xpath = "//div[@class='toast-title']")
    WebElement successMsg;
     
     @FindBy(xpath = "//small[@data-fv-for='roofTopName']")
     WebElement err_lotnm; 
     @FindBy(xpath = "//small[@data-fv-for='lotCode']")
     WebElement err_lotcd;
     @FindBy(xpath = "//small[@data-fv-for='roofTopPhone']")
     WebElement err_lotphone;
     @FindBy(xpath = "//small[@data-fv-for='roofTopPocName']")
     WebElement err_lotPocnm;
     @FindBy(xpath = "//small[@data-fv-for='roofTopPocPhone']")
     WebElement err_lotpocphone;
     @FindBy(xpath = "//small[@data-fv-for='roofTopPoc']")
     WebElement err_lotpocemail;
     
     @FindBy(xpath = "//small[@data-fv-for='roofTopAddress']")
     WebElement err_lotaddress;
     @FindBy(xpath = "//small[@data-fv-for='roofTopCity']")
     WebElement err_lotcity;
     @FindBy(xpath = "//small[@data-fv-for='roofTopState']")
     WebElement err_lotstate;
     @FindBy(xpath = "//small[@data-fv-for='roofTopZipCode']")
     WebElement err_lotzip;
     @FindBy(xpath = "//small[@data-fv-for='roofTopTimeZone']")
     WebElement err_lottimezone;
    
     
  
  
    AppUtil actionUtils = new AppUtil();
    SoftAssert softAssert = new SoftAssert();
    public void fnAddLot() throws InterruptedException
    {
    	 
    	
    	 AppUtil.waitFor(4);
    	
    	 AppUtil.setText(lotnm,ADD_LOTNAME);
    	 AppUtil.setText(lotcd,ADD_LOTCODE);
    	 AppUtil.setText(lotphoneno,ADD_LOTPHONE);
    	 AppUtil.setText(lotpocnm,ADD_LOTPOCNAME);
    	 AppUtil.setText(lotemail,ADD_LOTPOCEMAIL);    	
    	 AppUtil.setText(lotpocphoneno,ADD_LOTPOCPHONE);
    	
    	 AppUtil.waitFor(2);    	
    	 AppUtil.setText(lotaddress,ADD_LOTADDRESS);
    	 AppUtil.setText(lotcity,ADD_LOTCITY);
    	 AppUtil.select_by_value(lotstate, "PR");
    	 AppUtil.waitFor(2);    	
    	 AppUtil.setText(lotzip,ADD_LOTZIP);
    	 AppUtil.select_by_value(lottimezone, "America/Phoenix");
    	 AppUtil.waitFor(2); 
    	 AppUtil.click(savebtn);
    	 String success = AppUtil.getText(successMsg);
         softAssert.assertEquals(success, "Lot details saved successfully.");
    	    	
    }
	
    
    public void fnCheckEmpty() throws InterruptedException
    {
    	AppUtil.waitFor(10);
    	 AppUtil.select_by_value(selectdealer, "1042");
   	 	AppUtil.click(btnaddlot);
    	 AppUtil.waitFor(4);
    	 AppUtil.scroll_till_element(savebtn);
    	 AppUtil.click(savebtn);
    	 
    	 String err_lotname = AppUtil.getText(err_lotnm);
         softAssert.assertEquals(err_lotname, "Lot name is required");
         
         String err_lotocde = AppUtil.getText(err_lotcd);
         softAssert.assertEquals(err_lotocde, "Lot code is required");
    	 
         String err_lotphoneno = AppUtil.getText(err_lotphone);
         softAssert.assertEquals(err_lotphoneno, "Lot phone is required");
         
         String err_lotPocName = AppUtil.getText(err_lotPocnm);
         softAssert.assertEquals(err_lotPocName, "Lot POC name is required");
         
         String err_lotemailid = AppUtil.getText(err_lotpocemail);
         softAssert.assertEquals(err_lotemailid, "Lot POC email is required");
         
         String err_lotpocphoneno = AppUtil.getText(err_lotpocphone);
         softAssert.assertEquals(err_lotpocphoneno, "Dealer POC phone number is required");
         
         String err_lotadd = AppUtil.getText(err_lotaddress);
         softAssert.assertEquals(err_lotadd, "Lot address is required");
         
         String err_lotciti = AppUtil.getText(err_lotcity);
         softAssert.assertEquals(err_lotciti, "City is required");
         
         String err_lotstat = AppUtil.getText(err_lotstate);
         softAssert.assertEquals(err_lotstat, "State is required");
         
         String err_lotzipcd = AppUtil.getText(err_lotzip);
         softAssert.assertEquals(err_lotzipcd, "Zip code is required");
         
         String err_lottime = AppUtil.getText(err_lottimezone);
         softAssert.assertEquals(err_lottime, "Zip code is required");
         
         
    	
    } 

}

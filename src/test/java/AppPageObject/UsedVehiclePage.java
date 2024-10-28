package AppPageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AppUtilities.AppActionUtil;
//import AppPageObject.BasePage;


public class UsedVehiclePage extends BasePage {
	AppActionUtil actionUtils = new AppActionUtil();
	 public UsedVehiclePage(){
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(xpath = "//input[@id='salesPrice']")
	    WebElement salesPrice;
	    @FindBy(xpath = "//input[@id='downPayment']")
	    WebElement downPayment;
	    @FindBy(xpath = "//select[@id='insuranceType']")
	    WebElement insuranceType;
	    @FindBy(xpath = "//input[@id='insurance']")
	    WebElement Insurance;
	    @FindBy(xpath = "//input[@id='tradeInValue']")
	    WebElement tradeInValue;
	    @FindBy(xpath = "//input[@id='tradeInDebt']")
	    WebElement tradeInDebt;
	    @FindBy(xpath = "//input[@id='netTradeIn']")
	    WebElement netTradeIn;
	    @FindBy(xpath = "//select[@id='vehicleType']")
	    WebElement Vehicle_type;
	    @FindBy(xpath = "//select[@id='term']")
	    WebElement term;
	    @FindBy(xpath = "//input[@id='mileage']")
	    WebElement Mileage;
	    @FindBy(xpath = "//input[@id='vin']")
	    WebElement VIN;
	    @FindBy(xpath = "//select[@id='series']")
	    WebElement series;
	    @FindBy(xpath = "//select[@id='style']")
	    WebElement style;
	    @FindBy(xpath = "//select[@id='imported']")
	    WebElement imported;
	    @FindBy(xpath = "//input[@id='color']")
	    WebElement color;
	    @FindBy(xpath = "//small[@data-fv-for='color']")
	    WebElement colorError;
	    @FindBy(xpath = "//input[@id='licensePlate']")
	    WebElement licensePlate;
	    @FindBy(xpath = "//small[@data-fv-for='licensePlate' and @data-fv-validator='regexp']")
	    WebElement licensePlateError;
	    @FindBy(xpath = "//tr[@class='on  GV ']//input[@type='checkbox']")
	    WebElement Additional_Equipment_1;
	    @FindBy(xpath = "//tr[@class='on  9L ']//input[@type='checkbox']")
	    WebElement Additional_Equipment_2;
	    @FindBy(xpath = "//label[@for='additionalProduct5']")
	    WebElement APBox1;
	    @FindBy(xpath = "//select[@id='coverageProductType5']")
	    WebElement APCoverage1;
	    @FindBy(xpath = "//input[@id='priceCoverageProductType5']")
	    WebElement APSalesPrice1;
	    @FindBy(xpath = "//label[@for='additionalProduct6']")
	    WebElement APBox2;
	    @FindBy(xpath = "//select[@id='coverageProductType6']")
	    WebElement APCoverage2;
	    @FindBy(xpath = "//input[@id='priceCoverageProductType6']")
	    WebElement APSalesPrice2;

	    public void fillDealDetailForUsed() throws InterruptedException {
	    	AppActionUtil.click(salesPrice);
	    	AppActionUtil.setText(salesPrice, SALESPRICE);
	    	AppActionUtil.click(downPayment);
	    	AppActionUtil.setText(downPayment, DOWNPAYMENT);
	    	AppActionUtil.select_by_value(insuranceType, "Double Interest");
	    	AppActionUtil.setText(Insurance,INSURANCE);
	    	AppActionUtil.click(tradeInValue);
	    	AppActionUtil.setText(tradeInValue,TRADE_INVALUE);
	    	AppActionUtil.click(tradeInDebt);
	    	AppActionUtil.setText(tradeInDebt,TRADE_INDEBT);
	    	AppActionUtil.waitFor(2);
	        //AppUtil.click(tradeInValue);
	       // tradeInValue.sendKeys(Keys.BACK_SPACE);
	     //   AppUtil.waitFor(3);
	    	AppActionUtil.select_by_value(Vehicle_type,"Used");
//	        ApplicationUtility.click(Vehicle_type);
//	        ApplicationUtility.waitFor(2);
//	        ApplicationUtility.click(New);
	    	AppActionUtil.waitFor(2);
	    	AppActionUtil.select_by_value(term,"60");
	    }

	    public void fillCollateralInformationForUsed() throws InterruptedException {
	    	 SoftAssert soft = new SoftAssert();
		        AppActionUtil.setText(Mileage, MILEAGE);
		        AppActionUtil.setText(VIN,VINNO);
		        AppActionUtil.waitFor(3);
		        AppActionUtil.scrollToElement(color);
	        AppActionUtil.waitFor(5);	       
	        AppActionUtil.select_by_value(series,"SE");
	        AppActionUtil.waitFor(3);
	        AppActionUtil.visibilityOfElement(style);
	        AppActionUtil.select_by_value(style,"4D Hatchback 6sp");
	        AppActionUtil.waitFor(5);
	        AppActionUtil.select_by_value(imported, "0");
	        AppActionUtil.setText(color,"123455");
	        String ColorError = AppActionUtil.getText(colorError);
	        soft.assertEquals(ColorError,"Please enter a valid string");
	        AppActionUtil.clear(color);
	        AppActionUtil.setText(color, COLOR);
	        AppActionUtil.setText(licensePlate,"!@#$123");
	        String licenseError = AppActionUtil.getText(licensePlateError);
	        soft.assertEquals(licenseError,"Please enter a valid string");
	        AppActionUtil.clear(licensePlate);
	        AppActionUtil.setText(licensePlate, LICENSE_PLATE);
//	        Application_Uitility.scroll_till_element(Additional_Equipment_1);
//	        Application_Uitility.click(Additional_Equipment_1);
//	        Application_Uitility.scroll_till_element(Additional_Equipment_2);
//	        Application_Uitility.click(Additional_Equipment_2);
	        soft.assertAll();
	    }

	    public void addAdditionalProduct() throws InterruptedException {

	    	 AppActionUtil.scroll_till_element(APBox1);
		        AppActionUtil.click(APBox1);
		        AppActionUtil.waitFor(2);
		        AppActionUtil.select_by_value(APCoverage1,"124");
		        AppActionUtil.setText(APSalesPrice1,"599");
	      
	    }

}

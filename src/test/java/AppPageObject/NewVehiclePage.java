package AppPageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


import AppUtilities.AppActionUtil;

public class NewVehiclePage extends BasePage{

	AppActionUtil actionUtils = new AppActionUtil();
	    public NewVehiclePage(){
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(xpath = "//input[@id='salesPrice']")
	    public static WebElement salesPrice;
	    @FindBy(xpath = "//input[@id='downPayment']")
	    public static WebElement downPayment;
	    @FindBy(xpath = "//select[@id='insuranceType']")
	    WebElement insuranceType;
	    @FindBy(xpath = "//input[@id='insurance']")
	    public static WebElement insurance;
	    @FindBy(xpath = "//input[@id='tradeInValue']")
	    WebElement tradeInValue;
	    @FindBy(xpath = "//input[@id='tradeInDebt']")
	    WebElement tradeInDebt;
	    @FindBy(xpath = "//input[@id='netTradeIn']")
	    public static WebElement netTradeIn;
	    @FindBy(xpath = "//select[@id='vehicleType']")
	    WebElement vehicleType;
	    @FindBy(xpath = "//option[@value='New']")
	    WebElement New;
	    @FindBy(xpath = "//select[@id='term']")
	    WebElement term;
	    @FindBy(xpath = "//input[@id='mileage']")
	    WebElement Mileage;
	    @FindBy(xpath = "//input[@id='vin']")
	    WebElement VIN;
	    @FindBy(xpath = "//input[@id='year']")
	    WebElement year;
	    @FindBy(xpath = "//span[@aria-labelledby='select2-make-container']")
	    WebElement make;
	    @FindBy(xpath = "//li[contains(text(),'NISSAN')]")
	    WebElement makeNISSAN;
	    @FindBy(xpath = "//span[@aria-labelledby='select2-model-container']")
	    WebElement model;
	    @FindBy(xpath = "//li[contains(text(),'ALTIMA')]")
	    WebElement modelALTIMA;
	    @FindBy(xpath = "//span[@aria-labelledby='select2-series-container']")
	    WebElement series;
	    @FindBy(xpath = "//li[contains(text(),'SV')]")
	    WebElement seriesSV;
	    @FindBy(xpath = "//span[@aria-labelledby='select2-manufacturerCode-container']")
	    WebElement manufacturerCode;
	    @FindBy(xpath = "//input[@id='style']")
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
	    @FindBy(xpath = "//input[@id='value']")
	    WebElement value;
	    @FindBy(xpath = "//label[@for='additionalProduct5']")
	    WebElement APBox1;
	    @FindBy(xpath = "//select[@id='coverageProductType5']")
	    WebElement APCoverage1;
	    @FindBy(xpath = "//input[@id='priceCoverageProductType5']")
	    public static WebElement APSalesPrice1;
	    @FindBy(xpath = "//label[@for='additionalProduct6']")
	    WebElement APBox2;
	    @FindBy(xpath = "//select[@id='coverageProductType6']")
	    WebElement APCoverage2;
	    @FindBy(xpath = "//input[@id='priceCoverageProductType6']")
	    public static WebElement APSalesPrice2;

	    public void fillDealDetailForNew() throws InterruptedException {
	       // AppUtil.set_value(salesPrice,SALESPRICE);
	    	AppActionUtil.click(salesPrice);
	    	AppActionUtil.setText(salesPrice, SALESPRICE);
	    	AppActionUtil.click(downPayment);
	    	AppActionUtil.setText(downPayment, DOWNPAYMENT);
	    	AppActionUtil.select_by_value(insuranceType, "Double Interest");
	    	AppActionUtil.setText(insurance,INSURANCE);
	    	AppActionUtil.click(tradeInValue);
	    	AppActionUtil.setText(tradeInValue,TRADE_INVALUE);
	    	AppActionUtil.click(tradeInDebt);
	    	AppActionUtil.setText(tradeInDebt,TRADE_INDEBT);
	    	AppActionUtil.waitFor(2);
	        //AppUtil.click(tradeInValue);
	       // tradeInValue.sendKeys(Keys.BACK_SPACE);
	     //   AppUtil.waitFor(3);
	    	AppActionUtil.select_by_value(vehicleType,"New");
//	        ApplicationUtility.click(Vehicle_type);
//	        ApplicationUtility.waitFor(2);
//	        ApplicationUtility.click(New);
	    	AppActionUtil.waitFor(2);
	    	AppActionUtil.select_by_value(term,"60");
	    }

	    public void fillCollateralInformationForNew() throws InterruptedException {
	        SoftAssert soft = new SoftAssert();
	        AppActionUtil.setText(Mileage, MILEAGE);
	        AppActionUtil.setText(VIN,VINNO);
	        AppActionUtil.waitFor(3);
	        AppActionUtil.scrollToElement(color);
	        AppActionUtil.setText(year,YEAR);
	        AppActionUtil.waitFor(3);	        
	        AppActionUtil.click(make);	       
	        AppActionUtil.click(makeNISSAN);	       
	        AppActionUtil.waitFor(2);
	        AppActionUtil.click(model);
	        AppActionUtil.click(modelALTIMA);
	        AppActionUtil.waitFor(2);
	        AppActionUtil.click(series);
	        AppActionUtil.click(seriesSV);
	        AppActionUtil.waitFor(2);
	        String mCode = AppActionUtil.getText(manufacturerCode);
	         System.out.printf("The Manufacturer Code is "+mCode);
	        AppActionUtil.waitFor(2);
//	        String Style = ApplicationUtility.get_text(style);
//	        System.out.printf("The Style is "+ Style);

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
	        AppActionUtil.clear(VIN);
//	        ApplicationUtility.visibilityOfElement(value);
//	        ApplicationUtility.scroll_till_element(value);
//	        String value_of_vehicle = ApplicationUtility.get_text(value);
//	        System.out.println("The Value of Vehicle is "+value_of_vehicle);
	        soft.assertAll();
	    }

	    public void addAdditionalProduct() throws InterruptedException {

	       AppActionUtil.scroll_till_element(APBox1);
	        AppActionUtil.click(APBox1);
	        AppActionUtil.waitFor(2);
	        AppActionUtil.select_by_value(APCoverage1,"124");
	        AppActionUtil.setText(APSalesPrice1,"599");
	       // AppActionUtil.screenshot();
	       // AppActionUtil.scroll_till_element(APBox2);
	      //  AppActionUtil.click(APBox2);
	       // AppActionUtil.waitFor(2);
	      //  AppActionUtil.select_by_value(APCoverage2,"85");
	       // AppActionUtil.setText(APSalesPrice2,"699");
	    }
	
}

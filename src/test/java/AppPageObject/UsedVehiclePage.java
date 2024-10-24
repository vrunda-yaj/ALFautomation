package AppPageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;
import AppUtilities.AppActionUtil;
import pageObjects.BasePage;

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
	        AppUtil.set_value(salesPrice, ExcelUtility.excel("VehicleType",0));
	        AppUtil.set_value(downPayment, ExcelUtility.excel("VehicleType", 1));
	        AppUtil.select_by_value(insuranceType, "Double Interest");
	        AppUtil.set_text(Insurance, ExcelUtility.excel("VehicleType",2));
	        AppUtil.set_value(tradeInValue,ExcelUtility.excel("VehicleType",3));
	        AppUtil.waitFor(2);
	        AppUtil.set_value(tradeInDebt, ExcelUtility.excel("VehicleType",4));
	        AppUtil.waitFor(2);
	        AppUtil.click(tradeInValue);
	        tradeInValue.sendKeys(Keys.BACK_SPACE);
	        AppUtil.waitFor(3);
	        AppUtil.select_by_value(Vehicle_type,"Used");
	        AppUtil.visibilityOfElement(term);
	        AppUtil.select_by_value(term,"60");
	    }

	    public void fillCollateralInformationForUsed() throws InterruptedException {
	        SoftAssert soft = new SoftAssert();
	        AppUtil.set_text(Mileage, ExcelUtility.excel("VehicleType",5));
	        AppUtil.set_text(VIN, ExcelUtility.excel("VehicleType",6));
	        AppUtil.waitFor(10);
	        AppUtil.visibilityOfElement(series);
	        AppUtil.waitFor(5);
	        AppUtil.select_by_value(series,"SE");
	        AppUtil.waitFor(3);
	        AppUtil.visibilityOfElement(style);
	        AppUtil.select_by_value(style,"4D Hatchback 6sp");
	        AppUtil.waitFor(5);
	        AppUtil.select_by_value(imported, "0");
	        AppUtil.set_text(color,"123455");
	        String ColorError = AppUtil.get_text(colorError);
	        soft.assertEquals(ColorError,"Please enter a valid string");
	        AppUtil.clear(color);
	        AppUtil.set_text(color, ExcelUtility.excel("VehicleType",8));
	        AppUtil.set_text(licensePlate,"!@#$123");
	        String licenseError = AppUtil.get_text(licensePlateError);
	        soft.assertEquals(licenseError,"Please enter a valid string");
	        AppUtil.clear(licensePlate);
	        AppUtil.set_text(licensePlate, ExcelUtility.excel("VehicleType",9));
//	        Application_Uitility.scroll_till_element(Additional_Equipment_1);
//	        Application_Uitility.click(Additional_Equipment_1);
//	        Application_Uitility.scroll_till_element(Additional_Equipment_2);
//	        Application_Uitility.click(Additional_Equipment_2);
	        soft.assertAll();
	    }

	    public void addAdditionalProduct() throws InterruptedException {

	        AppUtil.scroll_till_element(APBox1);
	        AppUtil.click(APBox1);
	        AppUtil.select_by_value(APCoverage1,"17");
	        AppUtil.set_text(APSalesPrice1,"599");
	        AppUtil.scroll_till_element(APBox2);
	        AppUtil.click(APBox2);
	        AppUtil.select_by_value(APCoverage2,"36");
	        AppUtil.set_text(APSalesPrice2,"699");
	    }

}

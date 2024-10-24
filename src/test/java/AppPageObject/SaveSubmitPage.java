package AppPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AppUtilities.AppActionUtil;
import AppPageObject.BasePage;

public class SaveSubmitPage extends BasePage {
	
	AppActionUtil actionUtils = new AppActionUtil();
    FillApplicantDetailsPage fill = new FillApplicantDetailsPage();
    public SaveSubmitPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//button[contains(text(),'Submit')])[1]")
    WebElement Submit;
    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    WebElement Save;
    @FindBy(xpath = "//div[contains(text(),'Do you want to save this application as draft?')]")
    WebElement saveAlert;
    @FindBy(xpath = "//button[contains(text(),'Yes, save as draft!')]")
    WebElement yesSave;
    @FindBy(xpath = "//div[contains(text(),'Application saved in draft successfully')]")
    WebElement saveSuccessfully;
    @FindBy(xpath = "//div[contains(text(),'Application submitted successfully')]")
    WebElement submitSuccessfully;
    @FindBy(xpath = "(//p[@class='value-name'])[1]")
    WebElement getDataValue;
    public void save() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        AppActionUtil.scroll_till_element(Save);
        AppActionUtil.click(Save);
        String SaveAlert = AppActionUtil.getText(saveAlert);
        soft.assertEquals(SaveAlert,"Do you want to save this application as draft?");
        AppActionUtil.click(yesSave);
        AppActionUtil.visibilityOfElement(saveSuccessfully);
        String confirmSave = AppActionUtil.getText(saveSuccessfully);
        soft.assertEquals(confirmSave,"Application saved in draft successfully");
        System.out.println(confirmSave);
       // AppActionUtil.screenshot();
        AppActionUtil.waitFor(10);
        soft.assertAll();
    }

    public void editInDraft() throws InterruptedException {
        AppActionUtil.scroll_till_element(FillApplicantDetailsPage.SSN);
        AppActionUtil.clear(FillApplicantDetailsPage.SSN);
        AppActionUtil.setText(FillApplicantDetailsPage.SSN,"666870267");
        AppActionUtil.scroll_till_element(FillApplicantDetailsPage.applicantDateOfBirth );
        AppActionUtil.clear(FillApplicantDetailsPage.applicantDateOfBirth);
        AppActionUtil.setText(FillApplicantDetailsPage.applicantDateOfBirth,"09/12/2004");
        AppActionUtil.click(FillApplicantDetailsPage.first_name );
        AppActionUtil.waitFor(10);
    }

    public void submitAndFinanceCalculation() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        AppActionUtil.scroll_till_element(NewVehiclePage.salesPrice);
        String SalesPrice = NewVehiclePage.salesPrice.getAttribute("value");
        String DownPayment = NewVehiclePage.downPayment.getAttribute("value");
        String Insurance = NewVehiclePage.insurance.getAttribute("value");
        String Net_Trade_In = NewVehiclePage.netTradeIn.getAttribute("value");
        AppActionUtil.scroll_till_element(NewVehiclePage.APSalesPrice1);
        String apSalesPrice1 = NewVehiclePage.APSalesPrice1.getAttribute("value");
       // String apSalesPrice2 = APSalesPrice2.getAttribute("value");
        AppActionUtil.scroll_till_bottom_page();
        AppActionUtil.waitFor(5);
        AppActionUtil.click(Submit);
        AppActionUtil.waitFor(2);
        AppActionUtil.visibilityOfElement(submitSuccessfully);
        String confirmSubmit = AppActionUtil.getText(submitSuccessfully);
        soft.assertEquals(confirmSubmit,"Application submitted successfully");
        System.out.println(confirmSubmit);
        float amountValue = Float.parseFloat(SalesPrice.replaceAll(",",""))
                + Float.parseFloat(Insurance.replaceAll(",",""))
                + Float.parseFloat(apSalesPrice1)   // Float.parseFloat(apSalesPrice1) + Float.parseFloat(apSalesPrice2.replaceAll(",",""))
                - Float.parseFloat(DownPayment.replaceAll(",",""))
                -Float.parseFloat(Net_Trade_In.replaceAll(",",""));
        float getAmountValue = Float.parseFloat(AppActionUtil.getText(getDataValue).replaceAll("[,$]",""));
        System.out.println("The Amount is : " + amountValue);
        System.out.println("The getAmount is :"+getAmountValue);
        soft.assertEquals(amountValue,getAmountValue);
        soft.assertAll();
    }

}

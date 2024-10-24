package AppPageObject;

//import excelUtility.ExcelUtility;
import AppPageObject.BasePage;
import AppUtilities.AppActionUtil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;


public class AddCoApplicantPage extends BasePage{
	
	AppActionUtil actionUtils = new AppActionUtil();
    public AddCoApplicantPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='hasCoApplicant']")
    WebElement add_co_applicant_check_box;
    @FindBy(xpath = "//input[@id='cosocialSecurityNumber']")
    WebElement co_SSN;
    @FindBy(xpath = "//input[@id='codateOfBirth']")
    WebElement coDateOfBirth;
    @FindBy(xpath = "//select[@id='cocitizenship']")
    WebElement coCitizenship;
    @FindBy(xpath = "//select[@id='comaritalStatus']")
    WebElement comaritalStatus;
    @FindBy(xpath = "//select[@id='cogender']")
    WebElement coGender;
    @FindBy(xpath = "//input[@id='cofirstName']")
    WebElement coFirstName;
    @FindBy(xpath = "//input[@id='comiddleName']")
    WebElement coMiddleName;
    @FindBy(xpath = "//input[@id='colastName']")
    WebElement coLastName;
    @FindBy(xpath = "//input[@id='comotherMaidenName']")
    WebElement coMotherMaidenName;
    @FindBy(xpath = "//select[@id='coidType']")
    WebElement coIdType;
    @FindBy(xpath = "//input[@id='coidNumber']")
    WebElement coIdNumber;
    @FindBy(xpath = "//select[@id='cocountry']")
    WebElement coCountry;
    @FindBy(xpath = "//select[@id='costate']")
    WebElement coState;
    @FindBy(xpath = "//select[@id='coprimaryNumberType']")
    WebElement coPrimaryNumberType;
    @FindBy(xpath = "//input[@id='cohomePhone']")
    WebElement coHomePhone;
    @FindBy(xpath = "//input[@id='comobilePhone']")
    WebElement coMobilePhone;
    @FindBy(xpath = "//input[@id='coemail']")
    WebElement coEmail;
    @FindBy(xpath = "//select[@id='cocountryPhyAddress']")
    WebElement coCountryPhyAddress;
    @FindBy(xpath = "//select[@id='costateAPhyddress']")
    WebElement coStatePhyAddress;
    @FindBy(xpath = "//select[@id='cocity']")
    WebElement coCity;
    @FindBy(xpath = "//select[@id='copostalCode']")
    WebElement coPostalCode;
    @FindBy(xpath = "//input[@id='coline1']")
    WebElement coline1;
    @FindBy(xpath = "//input[@id='coline2']")
    WebElement coline2;
    @FindBy(xpath = "//select[@id='coresidenceType']")
    WebElement coResidenceType;
    @FindBy(xpath = "//input[@id='comonthlyPayment']")
    WebElement coMonthlyPayment;
    @FindBy(xpath = "//input[@id='coyearsInResidence']")
    WebElement coYearsInResidence;
    @FindBy(xpath = "//input[@id='comonthsInResidence']")
    WebElement coMonthsInResidence;
    @FindBy(xpath = "//select[@id='copreviousCountryPhyAddress']")
    WebElement coPreviousCountryPhyAddress;
    @FindBy(xpath = "//select[@id='copreviousStateAPhyddress']")
    WebElement coPreviousStatePhyAddress;
    @FindBy(xpath = "//select[@id='copreviousCity']")
    WebElement coPreviousCity;
    @FindBy(xpath = "//select[@id='copreviousPostalCode']")
    WebElement coPreviousPostalCode;
    @FindBy(xpath = "//input[@id='copreviousLine1']")
    WebElement coPreviousLine1;
    @FindBy(xpath = "//input[@id='copreviousLine2']")
    WebElement coPreviousLine2;
    @FindBy(xpath = "//select[@id='copreviousResidenceType']")
    WebElement coPreviousResidenceType;
    @FindBy(xpath = "//input[@id='comailingCheckbox']//..")
    WebElement coMailingCheckbox;
    @FindBy(xpath = "//input[@id='coidExpirationDate']")
    WebElement coIdExpirationDate;
    public void coApplicantDetails() throws InterruptedException {
//        SoftAssert soft = new SoftAssert();
        AppActionUtil.scroll_till_element(add_co_applicant_check_box);
        AppActionUtil.click(add_co_applicant_check_box);
        add_co_applicant_check_box.isSelected();
//        soft.assertTrue(add_co_applicant_check_box.isSelected());
      //  AppActionUtil.screenshot();
        
        AppActionUtil.setText(co_SSN, CO_SSNNO);
        AppActionUtil.waitFor(2);
        AppActionUtil.setText(coDateOfBirth, CO_DOB);
        AppActionUtil.click(co_SSN);
        AppActionUtil.select_by_value(coCitizenship, "Resident");
        AppActionUtil.select_by_value(comaritalStatus, "Married");
        AppActionUtil.select_by_value(coGender, "F");
        AppActionUtil.setText(coFirstName, CO_FNAME);
        AppActionUtil.setText(coMiddleName, CO_MNAME);
        AppActionUtil.setText(coLastName, CO_LNAME);
        AppActionUtil.setText(coMotherMaidenName, CO_MOTHERNAME);
        AppActionUtil.select_by_value(coIdType, "DTOP ID");
        AppActionUtil.setText(coIdNumber, CO_IDNO);
        AppActionUtil.select_by_value(coCountry, "US");
        AppActionUtil.select_by_value(coState, "PR");
        AppActionUtil.select_by_value(coPrimaryNumberType, "Residential");
       // AppActionUtil.screenshot();
        AppActionUtil.scroll_till_element(coIdExpirationDate);
        AppActionUtil.setText(coIdExpirationDate, CO_EXPDATE);
        AppActionUtil.click(coHomePhone);
        AppActionUtil.setText(coHomePhone, CO_HOMEPHONE);
        AppActionUtil.setText(coMobilePhone, CO_MOBPHONE);
        AppActionUtil.setText(coEmail, CO_EMAIL1);
//        soft.assertAll();
    }

    public void coApplicantPhysicalAddress() {
        AppActionUtil.select_by_value(coCountryPhyAddress, "US");
        AppActionUtil.select_by_value(coStatePhyAddress, "PR");
        AppActionUtil.select_by_value(coCity, "Aibonito");
        AppActionUtil.select_by_value(coPostalCode, "00705");
        AppActionUtil.setText(coline1, CO_PHY_LINE1);
        AppActionUtil.setText(coline2, CO_PHY_LINE2);
        AppActionUtil.select_by_value(coResidenceType, "Family");
        AppActionUtil.setText(coMonthlyPayment, CO_PHY_MONTHLYPAY);
        AppActionUtil.setText(coYearsInResidence, CO_PHY_YEAR);
        AppActionUtil.setText(coMonthsInResidence, CO_PHY_MONTH);
    }

    public void coPreviousPhysicalAddress() throws InterruptedException {
        AppActionUtil.select_by_value(coPreviousCountryPhyAddress,"US");
        AppActionUtil.select_by_value(coPreviousStatePhyAddress,"PR");
        AppActionUtil.select_by_value(coPreviousCity,"Isabela");
        AppActionUtil.select_by_value(coPreviousPostalCode,"00622");
        AppActionUtil.setText(coPreviousLine1,CO_PRE_LINE1);
        AppActionUtil.setText(coPreviousLine2,CO_PRE_LINE2);
        AppActionUtil.select_by_value(coPreviousResidenceType,"Others");
        AppActionUtil.scroll_till_element(coMailingCheckbox);
        AppActionUtil.click(coMailingCheckbox);
    }

    @FindBy(xpath = "//select[@id='coemploymentType']")
    WebElement coEmploymentType;
    @FindBy(xpath = "//input[@id='coemployerName']")
    WebElement coEmployerName;
    @FindBy(xpath = "//input[@id='cosupervisor']")
    WebElement coSupervisor;
    @FindBy(xpath = "//select[@id='coposition']")
    WebElement coPosition;
    @FindBy(xpath = "//select[@id='coindustry']")
    WebElement coIndustry;
    @FindBy(xpath = "//input[@id='coemployerPhone']")
    WebElement coEmployerPhone;
    @FindBy(xpath = "//input[@id='cootherEmployerPhone']")
    WebElement coOtherEmployerPhone;
    @FindBy(xpath = "//select[@id='copaymentMethod']")
    WebElement coPaymentMethod;
    @FindBy(xpath = "//input[@id='coyears']")
    WebElement coEmployerYears;
    @FindBy(xpath = "//input[@id='comonths']")
    WebElement coEmployerMonth;
    @FindBy(xpath = "//input[@id='cosalary']")
    WebElement coEmployerSalary;
    @FindBy(xpath = "//input[@id='coworkEmail']")
    WebElement coEmploymentWorkEmail;
    @FindBy(xpath = "//select[@id='cocountryWork']")
    WebElement coCountryWork;
    @FindBy(xpath = "//select[@id='costateWork']")
    WebElement coStateWork;
    @FindBy(xpath = "//select[@id='coemploymentCity']")
    WebElement coEmploymentCity;
    @FindBy(xpath = "//select[@id='coemploymentPostalCode']")
    WebElement coEmploymentPostalCode;
    @FindBy(xpath = "//input[@id='coline1Work']")
    WebElement coline1Work;
    @FindBy(xpath = "//input[@id='coline2Work']")
    WebElement coline2Work;
    @FindBy(xpath = "//button[@id='coaddNewEmployInfo']")
    WebElement coAddNewEmployInfo;
    @FindBy(xpath = "//select[@id='coemploymentStatus']")
    WebElement coEmploymentStatus;
    @FindBy(xpath = "//select[@id='coemploymentType2']")
    WebElement coEmploymentType2;
    @FindBy(xpath = "//input[@id='coemployerName2']")
    WebElement coEmployerName2;
    @FindBy(xpath = "//input[@id='cosupervisor2']")
    WebElement coSupervisor2;
    @FindBy(xpath = "//select[@id='coposition2']")
    WebElement coPosition2;
    @FindBy(xpath = "//select[@id='coindustry2']")
    WebElement coIndustry2;
    @FindBy(xpath = "//input[@id='coemployerPhone2']")
    WebElement coEmployerPhone2;
    @FindBy(xpath = "//input[@id='cootherEmployerPhone2']")
    WebElement coOtherEmployerPhone2;
    @FindBy(xpath = "//select[@id='copaymentMethod2']")
    WebElement coPaymentMethod2;
    @FindBy(xpath = "//input[@id='coyears2']")
    WebElement coOtherEmployerYears2;
    @FindBy(xpath = "//input[@id='comonths2']")
    WebElement coOtherEmployerMonths2;
    @FindBy(xpath = "//input[@id='cosalary2']")
    WebElement coSalary2;
    @FindBy(xpath = "//input[@id='coworkEmail2']")
    WebElement coWorkEmail2;
    @FindBy(xpath = "//select[@id='cocountryWork2']")
    WebElement coCountryWork2;

    @FindBy(xpath = "//select[@id='costateWork2']")
    WebElement coStateWork2;

    @FindBy(xpath = "//select[@id='coemploymentCity2']")
    WebElement coEmploymentCity2;

    @FindBy(xpath = "//select[@id='coemploymentPostalCode2']")
    WebElement coEmploymentPostalCode2;
    @FindBy(xpath = "//input[@id='coline1Work2']")
    WebElement coline1Work2;
    @FindBy(xpath = "//input[@id='coline2Work2']")
    WebElement coline2Work2;
    @FindBy(xpath = "//button[@id='cobtnAddNewAdditional']")
    WebElement coAddNewAdditionalIncome;
    @FindBy(xpath = "//select[@id='coadditionalIncomeType']")
    WebElement coAdditionalIncomeType;
    @FindBy(xpath = "//input[@id='coadditionalAmount-0-1']")
    WebElement coAdditionalAmount;
    @FindBy(xpath = "//select[@id='coadditionalSource']")
    WebElement coAdditionalSource;
    public void coApplicantEmploymentInformation() throws InterruptedException {
        AppActionUtil.select_by_value(coEmploymentType, "Self Employed");
        AppActionUtil.setText(coEmployerName,CO_EMP_NAME);
        AppActionUtil.setText(coSupervisor, CO_SUPERVISOR);
        AppActionUtil.select_by_value(coPosition, "55");
        AppActionUtil.select_by_value(coIndustry, "Leisure and hospitality");
        AppActionUtil.setText(coEmployerPhone, CO_EMP_PHONE1);
        AppActionUtil.setText(coOtherEmployerPhone, CO_EMP_PHONE2);
        AppActionUtil.select_by_value(coPaymentMethod, "Direct Deposit");
        AppActionUtil.setText(coEmployerYears,CO_EMP_YEAR);
        AppActionUtil.setText(coEmployerMonth, CO_EMP_MONTH);
        AppActionUtil.setText(coEmployerSalary, CO_EMP_SALARY);
        AppActionUtil.setText(coEmploymentWorkEmail, CO_EMP_EMAIL);
        AppActionUtil.select_by_value(coCountryWork, "US");
        AppActionUtil.select_by_value(coStateWork, "PR");
        AppActionUtil.select_by_value(coEmploymentCity, "Aguas Buenas");
        AppActionUtil.select_by_value(coEmploymentPostalCode, "00703");
        AppActionUtil.setText(coline1Work, CO_EMP_LINE1);
        AppActionUtil.setText(coline2Work, CO_EMP_LINE2);
    }

    @FindBy(xpath = "//div[@id='coemployInfo2']//label[contains(text(),'Employment Status')]")
    WebElement conformAddCoEmployment;
    @FindBy(xpath = "//button[@id='coremoveNewEmployInfo']")
    WebElement coEmploymentDelete;

    public void deleteAddCoEmploymentInformation() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        AppActionUtil.scroll_till_element(coAddNewEmployInfo);
        AppActionUtil.click(coAddNewEmployInfo);
        String conformAdd = AppActionUtil.getText(conformAddCoEmployment);
        soft.assertEquals(conformAdd,"Employment Status\n*");
        AppActionUtil.scroll_till_element(coEmploymentDelete);
        AppActionUtil.click(coEmploymentDelete);
        soft.assertAll();
    }

    public void addCoEmploymentInformation() throws InterruptedException {
        AppActionUtil.scroll_till_element(coAddNewEmployInfo);
        AppActionUtil.click(coAddNewEmployInfo);
        AppActionUtil.select_by_value(coEmploymentStatus, "P");
        AppActionUtil.select_by_value(coEmploymentType2, "Self Employed");
        AppActionUtil.setText(coEmployerName2, CO_EMP_NAME);
        AppActionUtil.setText(coSupervisor2, CO_SUPERVISOR);
        AppActionUtil.select_by_value(coPosition2, "55");
       // AppActionUtil.screenshot();
        AppActionUtil.select_by_value(coIndustry2, "Information");
        AppActionUtil.setText(coEmployerPhone2, CO_EMP_PHONE1);
        AppActionUtil.setText(coOtherEmployerPhone2, CO_EMP_PHONE2);
        AppActionUtil.select_by_value(coPaymentMethod2, "Check");
        AppActionUtil.setText(coOtherEmployerYears2, CO_EMP_YEAR);
        AppActionUtil.setText(coOtherEmployerMonths2, CO_EMP_MONTH);
        AppActionUtil.setText(coSalary2, CO_EMP_SALARY);
        AppActionUtil.setText(coWorkEmail2, CO_EMP_EMAIL);
        AppActionUtil.select_by_value(coCountryWork2, "US");
        AppActionUtil.select_by_value(coStateWork2, "PR");
        AppActionUtil.select_by_value(coEmploymentCity2, "Patillas");
        AppActionUtil.select_by_value(coEmploymentPostalCode2, "00723");
        AppActionUtil.setText(coline1Work2, CO_EMP_LINE1);
        AppActionUtil.setText(coline2Work2, CO_EMP_LINE2);
    }
    @FindBy(xpath = "//div[contains(text(),'Max 2 records can be added')]")
    WebElement warningCo;
    @FindBy(xpath = "(//i[@class='fa fa-trash delete-row text-dark'])[2]")
    WebElement deleteCoAdd;

    public void coApplicantAdditionalMonthlyIncome() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        AppActionUtil.scroll_till_element(coAddNewAdditionalIncome);
        AppActionUtil.click(coAddNewAdditionalIncome);
        AppActionUtil.click(coAddNewAdditionalIncome);
        AppActionUtil.click(coAddNewAdditionalIncome);
        String Warning = AppActionUtil.getText(warningCo);
        soft.assertEquals(Warning,"Max 2 records can be added");
      //  AppActionUtil.screenshot();
        AppActionUtil.waitFor(2);
        AppActionUtil.click(deleteCoAdd);
        AppActionUtil.select_by_value(coAdditionalIncomeType,"7");
        AppActionUtil.setText(coAdditionalAmount, CO_ADD_AMT);
        AppActionUtil.select_by_value(coAdditionalSource,"2");
        soft.assertAll();
    }

}

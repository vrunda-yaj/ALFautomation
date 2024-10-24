package AppPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import AppPageObject.BasePage;
import AppUtilities.AppActionUtil;

public class FillApplicantDetailsPage extends BasePage {
	
	public FillApplicantDetailsPage(){
        PageFactory.initElements(driver,this);
    }
	AppActionUtil actionUtils = new AppActionUtil();

    @FindBy(xpath = "//input[@id='socialSecurityNumber']")
    static WebElement SSN;
    @FindBy(xpath = "//input[@id='dateOfBirth']")
    static WebElement applicantDateOfBirth;
    @FindBy(xpath = "//select[@id='citizenship']")
    WebElement citizenship;
    @FindBy(xpath = "//select[@id='maritalStatus']")
    WebElement marital_status;
    @FindBy(xpath = "//select[@id='gender']")
    WebElement gender;
    @FindBy(xpath = "//input[@id='firstName']")
    static WebElement first_name;
    @FindBy(xpath = "//input[@id='middleName']")
    WebElement middleName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='motherMaidenName']")
    WebElement motherName;
    @FindBy(xpath = "//select[@id='idType']")
    WebElement idType;
    @FindBy(xpath = "//input[@id='idNumber']")
    WebElement idNumber;
    @FindBy(xpath = "//select[@id='country']")
    WebElement country;
    @FindBy(xpath = "//select[@id='state']")
    WebElement state;
    @FindBy(xpath = "//select[@id='primaryNumberType']")
    WebElement primaryNumberType;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='homePhone']")
    WebElement homePhone;
    @FindBy(xpath = "//input[@id='idExpirationDate']")
    WebElement applicantIdExpirationDate;
    @FindBy(xpath = "//input[@id='mobilePhone']")
    WebElement mobilePhone;
    @FindBy(xpath = "//select[@id='countryPhyAddress']")
    WebElement countryPhy;
    @FindBy(xpath = "//select[@id='stateAPhyddress']")
    WebElement statePhy;
    @FindBy(xpath = "//select[@id='city']")
    WebElement cityPhy;
    @FindBy(xpath = "//select[@id='postalCode']")
    WebElement postalCodePhy;
    @FindBy(xpath = "//input[@id='line1']")
    WebElement line_1_Phy;
    @FindBy(xpath = "//input[@id='line2']")
    WebElement line_2_Phy;
    @FindBy(xpath = "//select[@id='residenceType']")
    WebElement residenceType_Phy;
    @FindBy(xpath = "//input[@id='monthlyPayment']")
    WebElement monthlyPayment_Phy;
    @FindBy(xpath = "//input[@id='yearsInResidence']")
    WebElement yearInResidence_Phy;
    @FindBy(xpath = "//input[@id='monthsInResidence']")
    WebElement monthInResidence_Phy;
    @FindBy(xpath = "//select[@id='previousCountryPhyAddress']")
    WebElement previousCountryPhy;
    @FindBy(xpath = "//select[@id='previousStateAPhyddress']")
    WebElement previousStatePhy;
    @FindBy(xpath = "//select[@id='previousCity']")
    WebElement previousCityPhy;
    @FindBy(xpath = "//select[@id='previousPostalCode']")
    WebElement previousPostalCode_Phy;
    @FindBy(xpath = "//input[@id='previousLine1']")
    WebElement previousLine1_Phy;
    @FindBy(xpath = "//input[@id='previousLine2']")
    WebElement previousLine2_Phy;
    @FindBy(xpath = "//select[@id='previousResidenceType']")
    WebElement previousResidenceType_Phy;
    @FindBy(xpath = "//input[@id='mailingCheckbox']//..")
    WebElement samePhysicalAddress;
    public void applicantInformation() throws InterruptedException {
        AppActionUtil.setText(SSN,SSNNO);
        AppActionUtil.waitFor(2);
        AppActionUtil.setText(applicantDateOfBirth,DOB);
        AppActionUtil.click(SSN);
        AppActionUtil.select_by_value(citizenship, "Resident");
        AppActionUtil.select_by_value(marital_status, "Married");
        AppActionUtil.select_by_value(gender, "M");
        AppActionUtil.click(first_name);
        AppActionUtil.setText(first_name,FNAME);
        AppActionUtil.setText(middleName, MNAME);
        AppActionUtil.setText(lastName,LNAME);
        AppActionUtil.setText(motherName,MOTHERNAME);
        AppActionUtil.select_by_value(idType, "Passport");
        AppActionUtil.setText(idNumber, IDNO);
        AppActionUtil.select_by_value(country, "US");
        AppActionUtil.select_by_value(state, "PR");
        AppActionUtil.select_by_value(primaryNumberType, "Mobile");
        //AppActionUtil.screenshot();
//        String PrimeryNubertype = AppActionUtil.get_text(primaryNumberType);
//        System.out.println(PrimeryNubertype);
        AppActionUtil.scroll_till_element(applicantIdExpirationDate);
        AppActionUtil.setText(applicantIdExpirationDate,EXPDATE);
        AppActionUtil.click(homePhone);
        AppActionUtil.setText(homePhone, HOMEPHONE);
        AppActionUtil.setText(mobilePhone, MOBPHONE);
        AppActionUtil.setText(email,EMAIL1);
    }

    public void physicalAddress() {
        AppActionUtil.select_by_value(countryPhy, "US");
        AppActionUtil.select_by_value(statePhy, "PR");
        AppActionUtil.select_by_value(cityPhy, "Aibonito");
        AppActionUtil.select_by_value(postalCodePhy, "00705");
        AppActionUtil.setText(line_1_Phy,PHY_LINE1);
        AppActionUtil.setText(line_2_Phy, PHY_LINE2);
        AppActionUtil.select_by_value(residenceType_Phy, "Owner");
        AppActionUtil.setText(monthlyPayment_Phy, PHY_MONTHLYPAY);
        AppActionUtil.setText(yearInResidence_Phy, PHY_YEAR);
        AppActionUtil.setText(monthInResidence_Phy, PHY_MONTH);
    }

    public void previousPhysicalAddress() throws InterruptedException {
        AppActionUtil.select_by_value(previousCountryPhy,"US");
        AppActionUtil.select_by_value(previousStatePhy,"PR");
        AppActionUtil.select_by_value(previousCityPhy,"Florida");
        AppActionUtil.select_by_value(previousPostalCode_Phy,"00650");
        AppActionUtil.setText(previousLine1_Phy, PRE_LINE1);
        AppActionUtil.setText(previousLine2_Phy,PRE_LINE2);
        AppActionUtil.select_by_value(previousResidenceType_Phy,"Renter");
       // AppActionUtil.screenshot();
        AppActionUtil.scroll_till_element(samePhysicalAddress);
        AppActionUtil.click(samePhysicalAddress);
    }

    @FindBy(xpath = "//select[@id='employmentType']")
    WebElement EmploymentType;
    @FindBy(xpath = "//input[@id='employerName']")
    WebElement employerName;
    @FindBy(xpath = "//input[@id='supervisor']")
    WebElement supervisor;
    @FindBy(xpath = "//select[@id='position']")
    WebElement position;
    @FindBy(xpath = "//select[@id='industry']")
    WebElement industry;
    @FindBy(xpath = "//input[@id='employerPhone']")
    WebElement employerPhone;
    @FindBy(xpath = "//input[@id='otherEmployerPhone']")
    WebElement otherEmployerPhone;
    @FindBy(xpath = "//select[@id='paymentMethod']")
    WebElement paymentMethod;
    @FindBy(xpath = "//input[@id='years']")
    WebElement employerYears;
    @FindBy(xpath = "//input[@id='months']")
    WebElement employerMonths;
    @FindBy(xpath = "//input[@id='salary']")
    WebElement employerSalary;
    @FindBy(xpath = "//input[@id='workEmail']")
    WebElement workEmail;
    @FindBy(xpath = "//select[@id='countryWork']")
    WebElement workCountry;
    @FindBy(xpath = "//select[@id='stateWork']")
    WebElement workState;
    @FindBy(xpath = "//select[@id='employmentCity']")
    WebElement employmentCity;
    @FindBy(xpath = "//select[@id='employmentPostalCode']")
    WebElement employmentPostalCode;
    @FindBy(xpath = "//input[@id='line1Work']")
    WebElement line1Work;
    @FindBy(xpath = "//input[@id='line2Work']")
    WebElement line2Work;
    @FindBy(xpath = "//button[@id='btnAddNewAdditional']")
    WebElement AddNewAdditional;
    @FindBy(xpath = "//select[@id='additionalIncomeType']")
    WebElement additionalIncomeType;
    @FindBy(xpath = "//input[@id='additionalAmount-0-0-0']")
    WebElement additionalAmount;
    @FindBy(xpath = "//select[@id='additionalSource']")
    WebElement additionalSource;
    @FindBy(xpath = "//button[@id='addNewEmployInfo']")
    WebElement addNewEmployInfo;
    @FindBy(xpath = "//select[@id='employmentStatus']")
    WebElement employmentStatus;
    @FindBy(xpath = "//select[@id='employmentType2']")
    WebElement employmentType2;
    @FindBy(xpath = "//input[@id='employerName2']")
    WebElement employerName2;
    @FindBy(xpath = "//input[@id='supervisor2']")
    WebElement supervisor2;
    @FindBy(xpath = "//select[@id='position2']")
    WebElement position2;
    @FindBy(xpath = "//select[@id='industry2']")
    WebElement industry2;
    @FindBy(xpath = "//input[@id='employerPhone2']")
    WebElement employerPhone2;
    @FindBy(xpath = "//input[@id='otherEmployerPhone2']")
    WebElement otherEmployerPhone2;
    @FindBy(xpath = "//select[@id='paymentMethod2']")
    WebElement paymentMethod2;
    @FindBy(xpath = "//input[@id='years2']")
    WebElement addEmploymentYears2;
    @FindBy(xpath = "//input[@id='months2']")
    WebElement addEmploymentMonths2;
    @FindBy(xpath = "//input[@id='salary2']")
    WebElement salary2;
    @FindBy(xpath = "//input[@id='workEmail2']")
    WebElement workEmail2;
    @FindBy(xpath = "//select[@id='countryWork2']")
    WebElement countryWork2;
    @FindBy(xpath = "//select[@id='stateWork2']")
    WebElement stateWork2;
    @FindBy(xpath = "//select[@id='employmentCity2']")
    WebElement employmentCity2;
    @FindBy(xpath = "//select[@id='employmentPostalCode2']")
    WebElement employmentPostalCode2;
    @FindBy(xpath = "//input[@id='line1Work2']")
    WebElement line1Work2;
    @FindBy(xpath = "//input[@id='line2Work2']")
    WebElement line2Work2;
    @FindBy(xpath = "//div[contains(text(),'Max 2 records can be added')]")
    WebElement warning;
    @FindBy(xpath = "(//i[@class='fa fa-trash delete-row text-dark'])[2]")
    WebElement deleteAdd;
   
    public void employmentInformation(){
        AppActionUtil.select_by_value(EmploymentType, "Permanent");
        AppActionUtil.setText(employerName,EMP_NAME);
        AppActionUtil.setText(supervisor, SUPERVISOR);
        AppActionUtil.select_by_value(position, "8");
        //AppActionUtil.screenshot();
        AppActionUtil.select_by_value(industry, "Finance");
        AppActionUtil.setText(employerPhone, EMP_PHONE1);
        AppActionUtil.setText(otherEmployerPhone,EMP_PHONE2);
        AppActionUtil.select_by_value(paymentMethod, "Check");
        AppActionUtil.setText(employerYears,EMP_YEAR);
        AppActionUtil.setText(employerMonths, EMP_MONTH);
        AppActionUtil.setText(employerSalary, EMP_SALARY);
        AppActionUtil.setText(workEmail, EMP_EMAIL);
        AppActionUtil.select_by_value(workCountry, "US");
        AppActionUtil.select_by_value(workState, "PR");
        AppActionUtil.select_by_value(employmentCity, "Garrochales");
        AppActionUtil.select_by_value(employmentPostalCode, "00652");
        AppActionUtil.setText(line1Work, EMP_LINE1);
        AppActionUtil.setText(line2Work, EMP_LINE2);
    }

    @FindBy(xpath = "//div[@id='employInfo2']//label[contains(text(),'Employment Status')]")
    WebElement conformAddEmployment;
    @FindBy(xpath = "//button[@id='removeNewEmployInfo']")
    WebElement employmentDelete;

   /* public void deleteAddEmploymentInformation() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        AppActionUtil.scroll_till_element(addNewEmployInfo);
        AppActionUtil.click(addNewEmployInfo);
        String conformAdd = AppActionUtil.get_text(conformAddEmployment);
        soft.assertEquals(conformAdd,"Employment Status\n*");
        AppActionUtil.scroll_till_element(employmentDelete);
        AppActionUtil.click(employmentDelete);
        soft.assertAll();
    }
*/
    public void addEmploymentInformation() throws InterruptedException {
        AppActionUtil.scroll_till_element(addNewEmployInfo);
        AppActionUtil.click(addNewEmployInfo);
        AppActionUtil.select_by_value(employmentStatus, "P");
        AppActionUtil.select_by_value(employmentType2, "Temporary");
        AppActionUtil.setText(employerName2,EMP2_NAME);
        AppActionUtil.setText(supervisor2,SUPERVISOR2);
        AppActionUtil.select_by_value(position2, "5");
        AppActionUtil.select_by_value(industry2, "Government");
        AppActionUtil.setText(employerPhone2, EMP2_PHONE1);
        AppActionUtil.setText(otherEmployerPhone2, EMP2_PHONE2);
        AppActionUtil.select_by_value(paymentMethod2, "Cash");
        AppActionUtil.setText(addEmploymentYears2,EMP2_YEAR);
        AppActionUtil.setText(addEmploymentMonths2, EMP2_MONTH);
        AppActionUtil.setText(salary2, EMP2_SALARY);
        AppActionUtil.setText(workEmail2, EMP2_EMAIL);
        AppActionUtil.select_by_value(countryWork2, "US");
        AppActionUtil.select_by_value(stateWork2, "PR");
        AppActionUtil.select_by_value(employmentCity2, "Adjuntas");
        AppActionUtil.select_by_value(employmentPostalCode2, "00601");
        AppActionUtil.setText(line1Work2, EMP2_LINE1);
        AppActionUtil.setText(line2Work2,EMP2_LINE2);
    }

    public void additionalMonthlyIncome() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        AppActionUtil.scroll_till_element(AddNewAdditional);
        AppActionUtil.click(AddNewAdditional);
        AppActionUtil.click(AddNewAdditional);
        AppActionUtil.click(AddNewAdditional);
        String Warning = AppActionUtil.getText(warning);
        soft.assertEquals(Warning,"Max 2 records can be added");
        //AppActionUtil.screenshot();
        AppActionUtil.waitFor(2);
        AppActionUtil.click(deleteAdd);
        AppActionUtil.select_by_value(additionalIncomeType,"7");
        AppActionUtil.setText(additionalAmount,ADD_AMT);
        AppActionUtil.select_by_value(additionalSource,"1");
        soft.assertAll();
    }

}

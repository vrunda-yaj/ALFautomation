package ApptestCases;

import org.testng.annotations.Test;


import AppPageObject.AddCoApplicantPage;
import AppUtilities.AppActionUtil;
import AppPageObject.BasePage;

public class AddCoApplicantTest extends BasePage {
	AddCoApplicantPage ob;
	AppActionUtil actionUtils = new AppActionUtil();
    
    @Test(priority = 1)
    public void fillCoApplicantDetails() throws InterruptedException {
        ob = new AddCoApplicantPage();
        ob.coApplicantDetails();
      //  AppUtil.screenshot();
    }

    
    @Test(priority = 2)
    public void fillCoApplicantPhysicalAddressDetails() throws InterruptedException {
        ob.coApplicantPhysicalAddress();
      //  AppUtil.screenshot();
    }

   
    @Test(priority = 3)
    public void fillCoApplicantPreviousPhysicalAddressDetails() throws InterruptedException {
        ob.coPreviousPhysicalAddress();
       // AppUtil.screenshot();
    }

   
    @Test(priority = 4)
    public void fillCoApplicantEmploymentInformation() throws InterruptedException {
        ob.coApplicantEmploymentInformation();
       // AppUtil.screenshot();
    }

   
    @Test(priority = 5)
    public void verifyDeleteAddCoEmployment() throws InterruptedException {
        ob.deleteAddCoEmploymentInformation();
    }

    
    @Test(priority = 6)
    public void fillAddCoEmploymentInformation() throws InterruptedException {
        ob.addCoEmploymentInformation();
       // AppUtil.screenshot();
    }

    
    @Test(priority = 7)
    public void fillCoApplicantAdditionalMonthlyIncome() throws InterruptedException {
        ob.coApplicantAdditionalMonthlyIncome();
       // AppUtil.screenshot();
    }

}

package ApptestCases;

import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import AppPageObject.FillApplicantDetailsPage;
import AppUtilities.AppActionUtil;
import AppPageObject.BasePage;

public class FillApplicantDetailsTest extends BasePage{

	FillApplicantDetailsPage ob;
	AppActionUtil actionUtils = new AppActionUtil();
   
    @Test(priority = 1)
    public void fillApplicantDetails() throws InterruptedException {
        ob = new FillApplicantDetailsPage();
        ob.applicantInformation();
       // actionUtils.screenshot();
    }

    
    @Test(priority = 2)
    public void fillPhysicalAddressDetails() throws InterruptedException {
        ob.physicalAddress();
       // actionUtils.screenshot();
    }

  
    @Test(priority = 3)
    public void fillPreviousPhysicalAddressDetails() throws InterruptedException {
        ob.previousPhysicalAddress();
       // actionUtils.screenshot();
    }

   
    @Test(priority = 4)
    public void fillEmploymentInformationDetails() throws InterruptedException {
        ob.employmentInformation();
       // actionUtils.screenshot();
    }
   
   /* @Test(priority = 5)
    public void verifyDeleteAddEmployment() throws InterruptedException {
        ob.deleteAddEmploymentInformation();
      //  actionUtils.screenshot();
    }

   */
    @Test(priority = 6)
    public void fillAddEmploymentInformationDetails() throws InterruptedException {
        ob.addEmploymentInformation();
      //  actionUtils.screenshot();
    }

   
    @Test(priority = 7)
    public void fillAdditionalMonthlyIncomeDetails() throws InterruptedException {
        ob.additionalMonthlyIncome();
       // actionUtils.screenshot();
    }
	
}

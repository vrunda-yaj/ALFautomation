package ApptestCases;

import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import AppPageObject.SaveSubmitPage;
import AppUtilities.AppActionUtil;
import AppPageObject.BasePage;

public class SaveSubmitTest extends BasePage{
	SaveSubmitPage ob;
	AppActionUtil actionUtils = new AppActionUtil();

    
    @Test
    public void tc_applicationSave() throws InterruptedException {
        ob = new SaveSubmitPage();
        ob.save();
    }

    
    @Test
    public void tc_verifyEditDraft() throws InterruptedException {
        ob.editInDraft();
      //  actionUtils.screenshot();
    }
    
    @Test
    public void tc_applicationSubmit() throws InterruptedException {
       ob = new SaveSubmitPage();
        ob.submitAndFinanceCalculation();
       // actionUtils.screenshot();
    }

}

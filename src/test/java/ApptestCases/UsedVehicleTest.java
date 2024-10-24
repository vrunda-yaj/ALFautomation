package ApptestCases;

import org.testng.annotations.Test;

import AdminUtilities.AppUtil;
import AppPageObject.UsedVehiclePage;
import pageObjects.BasePage;

public class UsedVehicleTest extends BasePage {
	UsedVehiclePage ob;
    AppUtil actionUtils = new AppUtil();

   
    @Test(priority = 1)
    public void fillDealDetailUsed() throws InterruptedException {
        ob = new UsedVehiclePage();
        ob.fillDealDetailForUsed();
      //  actionUtils.screenshot();
    }

   
    @Test(priority = 2)
    public void fillCollateralInformationUsed() throws InterruptedException {
        ob.fillCollateralInformationForUsed();
       // actionUtils.screenshot();
    }

  
    @Test(priority = 3)
    public void selectAdditionalProductUsed() throws InterruptedException {
        ob.addAdditionalProduct();
      //  actionUtils.screenshot();
    }

}

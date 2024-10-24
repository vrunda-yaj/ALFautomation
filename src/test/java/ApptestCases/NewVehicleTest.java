package ApptestCases;

import org.testng.annotations.Test;


import AppPageObject.NewVehiclePage;
import AppUtilities.AppActionUtil;
import AppPageObject.BasePage;

public class NewVehicleTest extends BasePage {
	NewVehiclePage ob;
	AppActionUtil actionUtils = new AppActionUtil();
   
    @Test(priority = 1)
    public void fillDealDetailNew() throws InterruptedException {
        ob = new NewVehiclePage();
        ob.fillDealDetailForNew();
     //   actionUtils.screenshot();
    }

 
    @Test(priority = 2)
    public void fillCollateralInformationNew() throws InterruptedException {
        ob.fillCollateralInformationForNew();
       // actionUtils.screenshot();
    }
   
    @Test(priority = 3)
    public void selectAdditionalProductNew() throws InterruptedException {
        ob.addAdditionalProduct();
     //   actionUtils.screenshot();
    }

}

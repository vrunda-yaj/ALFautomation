package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.SetupMenuPage;

public class SetupMenuTest extends BasePage {
	
SetupMenuPage setupmenu;

@Test   
    public void tcClickDealer() {
    	setupmenu= new SetupMenuPage();
    	setupmenu.fnDealermenu();
    }

@Test   
public void tcClickLot() {
	setupmenu.fnLotmenu();
}

}

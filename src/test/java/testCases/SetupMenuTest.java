package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BasePage;
import pageObjects.SetupMenuPage;

public class SetupMenuTest extends BasePage {
	
SetupMenuPage setupmenu;

@Test   
    public void TC_dealerMenuSetuUp() {
    	setupmenu= new SetupMenuPage();
    	setupmenu.fnDealermenu();
    }

@Test   
public void TC_lotMenuSetUp() {
	setupmenu= new SetupMenuPage();
	setupmenu.fnLotmenu();
}
@Test   
public void TC_userMenuSetUp() {
	setupmenu= new SetupMenuPage();
	setupmenu.fnUsermenu();
}

}

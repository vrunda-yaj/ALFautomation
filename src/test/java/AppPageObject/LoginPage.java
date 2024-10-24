package AppPageObject;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;
import AppUtilities.AppActionUtil;

public class LoginPage extends BasePage{
	AppActionUtil ActionUtil = new AppActionUtil();
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[contains(text(),'Login into your account')]")
    WebElement verifyLoginPage;
    @FindBy(xpath = "//a[contains(text(),'Did you forget your password?')]")
    WebElement forgetPassword;
    @FindBy(xpath = "//div[contains(text(),'Reset password')]")
    WebElement verifyResetPage;
    @FindBy(xpath = "//button[contains(text(),' Send email ')]")
    WebElement sendEmail;
    @FindBy(xpath = "//LI[contains(text(),'The email does not exist.')]")
    WebElement resetPageError;
    @FindBy(xpath = "//img[@src='https://alfosv2-dev.americasleading.com/alf_images/arrow_left_alt.svg']")
    WebElement goBack;
    @FindBy(xpath = "//input[@type='email']")
    WebElement userName;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(xpath = "//li[@class='dropdown language language-menu']")  ////div[@class='profile-details']//..//..//..//a[@class='dropdown-toggle']
    WebElement change_language;
    @FindBy(xpath = "//a[contains(text(),'EN')]")
    WebElement english;
    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement Home;
    @FindBy(xpath = "(//a[@class='menu-link'])[2]")
    WebElement FinanceApplications;
    @FindBy(xpath = "//li[contains(text(),'Email not found. Please contact support team for further assistance.')]")
    WebElement loginError;
    @FindBy(xpath = "//h1[contains(text(),'Create Finance Application')]")
    WebElement verifyApplicationPage;
    @FindBy(xpath = "(//a[@class='menu-link'])[3]") //(//ul[@class='treeview-menu  menu-open']//li[2])
    WebElement create_application;
    @FindBy(xpath = "//li[@class='dropdown dropdown-width']")
    WebElement userProfile;
    @FindBy(xpath = "//i[@class='fa fa-sign-out fa-fw']")
    WebElement logout;
    @FindBy(xpath = "//p[@title='Ferrari 1']")
    WebElement byDefaultLot;
    @FindBy(xpath = "//a[@data-rooftopid='79']")
    WebElement Ferrari2;


   
    public void forgetPassword(){
        SoftAssert soft = new SoftAssert();
        AppActionUtil.click(change_language);
        AppActionUtil.click(english);
        AppActionUtil.click(forgetPassword);
        String screen_title = AppUtil.getText(verifyResetPage);
        soft.assertEquals(screen_title,"Reset password");
        AppActionUtil.setText(userName, INVALIDUSERNAME);
        AppActionUtil.click(sendEmail);
        String pageError = AppUtil.getText(resetPageError);
        soft.assertEquals(pageError,"The email does not exist.");
       // AppUtil.screenshot();
        AppActionUtil.click(goBack);
        soft.assertAll();
    }

    public void inputUserInValidLogin(){
        SoftAssert soft = new SoftAssert();
        String screen_title = AppUtil.getText(verifyLoginPage);
        soft.assertEquals(screen_title,"Login into your account");
        AppUtil.setText(userName, INVALIDUSERNAME);
        AppUtil.setText(password, INVALIDPASSWORD);
        AppUtil.click(submit);
        String page_error = AppUtil.getText(loginError);
        soft.assertEquals(page_error,"Email not found. Please contact support team for further assistance.");
        soft.assertAll();
    }

    public void inputUserValidLogin(){
        SoftAssert soft = new SoftAssert();
        AppUtil.setText(userName, USERNAME);
        AppUtil.setText(password, PASSWORD);
        AppUtil.click(submit);
        String homePage = AppUtil.getText(Home);
        soft.assertEquals(homePage,"Home");
        soft.assertAll();
    }

   /* public void selectLot(){
        SoftAssert soft = new SoftAssert();
        String lots = AppUtil.getText(byDefaultLot);
        soft.assertEquals(lots,"Ferrari 1");
        AppUtil.click(byDefaultLot);
        AppUtil.click(Ferrari2);
        soft.assertAll();
    }
*/
    public void clickOnCreateApplication() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
//        AppUtil.visibilityOfElement(FinanceApplications);
        AppUtil.waitFor(2);
       // AppUtil.click(FinanceApplications);
       // AppUtil.visibilityOfElement(create_application);
        AppUtil.click(create_application);
        String createApplicationPage = AppUtil.getText(verifyApplicationPage);
        soft.assertEquals(createApplicationPage,"Create Finance Application");
        soft.assertAll();
    }

    public void logOut() throws InterruptedException {
        AppUtil.visibilityOfElement(userProfile);
        AppUtil.scroll_till_element(userProfile);
        AppUtil.click(userProfile);
        AppUtil.click(logout);
        System.out.println("Logout successfully");
    }

}

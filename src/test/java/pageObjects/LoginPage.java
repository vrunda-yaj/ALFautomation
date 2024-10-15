package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import Utilities.AppUtil;

public class LoginPage extends BasePage {

    public LoginPage() {
    	PageFactory.initElements(driver,this);
    }

    // Elements for login page
    @FindBy(xpath = "//div[contains(text(),'Login into your account')]")
    WebElement verifyLoginPage;
    @FindBy(xpath = "//input[@type='email']")
    WebElement userName;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(xpath = "//input[@name='otp']")
    WebElement otp;
    @FindBy(xpath = "//li[@class='dropdown language language-menu']")
    WebElement change_language;
    @FindBy(xpath = "//a[contains(text(),'EN')]")
    WebElement english;
    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement Home;
    
    // Additional elements for further navigation
    @FindBy(xpath = "(//a[@class='menu-link'])[2]")
    WebElement FinanceApplications;
    @FindBy(xpath = "//li[contains(text(),'Email not found. Please contact support team for further assistance.')]")
    WebElement loginError;
    @FindBy(xpath = "//h1[contains(text(),'Create Finance Application')]")
    WebElement verifyApplicationPage;
    @FindBy(xpath = "(//a[@class='menu-link'])[4]")
    WebElement create_application;
    @FindBy(xpath = "//li[@class='dropdown dropdown-width']")
    WebElement userProfile;
    @FindBy(xpath = "//i[@class='fa fa-sign-out fa-fw']")
    WebElement logout;
    @FindBy(xpath = "//p[@title='Ferrari 1']")
    WebElement byDefaultLot;
    @FindBy(xpath = "//button[contains(text(),'Verify OTP')]")
    WebElement btn_otp;

    // Method to handle valid user login
    public void inputUserValidLogin() {
        SoftAssert softAssert = new SoftAssert();

        try {
            // Change language to English
            AppUtil.click(change_language);
            AppUtil.click(english);
            
            // Input login credentials
            AppUtil.setText(userName, "alfdev@yopmail.com");
            AppUtil.setText(password, "R0@$7263GGat");
            AppUtil.click(submit);
            
            // Input OTP
            AppUtil.setText(otp, "118269");
            AppUtil.click(btn_otp);

            // Verify login success by checking Home page visibility
            String homePage = AppUtil.getText(Home);
            softAssert.assertEquals(homePage, "Home", "Login was not successful, 'Home' not displayed!");

        } catch (Exception e) {
            // Handle any exception that occurs during login process
            System.out.println("An error occurred during login: " + e.getMessage());
            softAssert.fail("Login process failed due to exception: " + e.getMessage());
        } finally {
            // Ensure all assertions are verified at the end
            softAssert.assertAll();
        }
    }
}
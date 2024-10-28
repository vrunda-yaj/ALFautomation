package AppPageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AdminUtilities.AppUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	 public static WebDriver driver;
	 
	 //LOGIN PAGE VARIABLES
	 public static final String BASE_URL = "https://alfosv2-dev.americasleading.com/login";
	    public static final String USERNAME = "marlyndealermgr@yopmail.com";
	    public static final String PASSWORD = "R0@$7263GGat";
	    public static final String INVALIDUSERNAME = "mlyndealer@yopmail.com";
	    public static final String INVALIDPASSWORD = "mlyndealer@12345";
	    
	    // ADD DEAL DETAILS PAGE VARIABLES
	    public static final String SALESPRICE = "150000";
	    public static final String DOWNPAYMENT  = "14000";
	    public static final String INSURANCE  = "13000";
	    public static final String TRADE_INVALUE = "50000";
	    public static final String TRADE_INDEBT = "3000";
	    public static final String MILEAGE = "1100";
	    public static final String VINNO = "5YFEPMAE7MP250544";	   
	   public static final String YEAR = "2024";
	    public static final String COLOR = "Black";
	    public static final String LICENSE_PLATE = "AK1453790";
	    
	  //APPLICANT DETAILS PAGE VARIABLES
	    public static final String SSNNO = "666761433";
	    public static final String DOB = "03/24/2000";
	    public static final String FNAME = "ISABEL";
	    public static final String MNAME = "GARY";
	    public static final String LNAME = "ALVIRA";
	    public static final String MOTHERNAME = "HERINA";
	    public static final String IDNO = "5647648";
	    public static final String EXPDATE = "05/20/2027";
	    public static final String HOMEPHONE = "9765458943";
	    public static final String MOBPHONE = "7354623143";
	    public static final String EMAIL1 = "isabeltest123@gmail.com";
	    public static final String PHY_LINE1 = "50 Cambridge Road";
	    public static final String PHY_LINE2 = "NORTH CARLTON";
	    public static final String PHY_MONTHLYPAY = "5000";
	    public static final String PHY_YEAR = "13";
	    public static final String PHY_MONTH = "7";
	    public static final String PRE_LINE1 = "50 Cambridge Road";
	    public static final String PRE_LINE2 = "NORTH CARLTON";
	    
	    public static final String EMP_NAME = "Robin";
	    public static final String SUPERVISOR = "JOHN";
	    public static final String EMP_PHONE1 = "6473846754";
	    public static final String EMP_PHONE2 = "4539786543";
	    public static final String EMP_YEAR = "5";
	    public static final String EMP_MONTH = "10";
	    public static final String EMP_SALARY = "2500";
	    public static final String EMP_EMAIL = "robintest@yopmail.com";
	    public static final String EMP_LINE1 = "36 Thirsk Road";
	    public static final String EMP_LINE2 = "BLANKNEY";
	    
	    public static final String EMP2_NAME = "MORRIS";
	    public static final String SUPERVISOR2 = "JOHN";
	    public static final String EMP2_PHONE1 = "6473846754";
	    public static final String EMP2_PHONE2 = "4539786543";
	    public static final String EMP2_YEAR = "5";
	    public static final String EMP2_MONTH = "10";
	    public static final String EMP2_SALARY = "2500";
	    public static final String EMP2_EMAIL = "morristest@yopmail.com";
	    public static final String EMP2_LINE1 = "36 Thirsk Road";
	    public static final String EMP2_LINE2 = "BLANKNEY";
	    public static final String ADD_AMT = "700";
	    
	    public static final String CO_SSNNO = "666761433";
	    public static final String CO_DOB = "03/24/1976";
	    public static final String CO_FNAME = "THOMAS";
	    public static final String CO_MNAME = "M";
	    public static final String CO_LNAME = "CURTIS";
	    public static final String CO_MOTHERNAME = "REES";
	    public static final String CO_IDNO = "5640048";
	    public static final String CO_EXPDATE = "06/20/2027";
	    public static final String CO_HOMEPHONE = "8976656432";
	    public static final String CO_MOBPHONE = "7354623143";
	    public static final String CO_EMAIL1 = "thomastest123@gmail.com";
	    public static final String CO_PHY_LINE1 = "51 Newgate Street";
	    public static final String CO_PHY_LINE2 = "NORTH CARLTON";
	    public static final String CO_PHY_MONTHLYPAY = "KEIL,PA28 7XF";
	    public static final String CO_PHY_YEAR = "10";
	    public static final String CO_PHY_MONTH = "3";
	    public static final String CO_PRE_LINE1 = "NORTH CARLTON";
	    public static final String CO_PRE_LINE2 = "KEIL,PA28 7XF";
	    
	    public static final String CO_EMP_NAME = "Thrift Auto Parts";
	    public static final String CO_SUPERVISOR = "KEIL";
	    public static final String CO_EMP_PHONE1 = "6473846754";
	    public static final String CO_EMP_PHONE2 = "4539786543";
	    public static final String CO_EMP_YEAR = "2";
	    public static final String CO_EMP_MONTH = "10";
	    public static final String CO_EMP_SALARY = "2500";
	    public static final String CO_EMP_EMAIL = "robintest@yopmail.com";
	    public static final String CO_EMP_LINE1 = "36 Thirsk Road";
	    public static final String CO_EMP_LINE2 = "BLANKNEY";	    
	    public static final String CO_ADD_AMT = "700";
	    
	    
	    public void getLaunchUrl(String browser) {

	        if (browser.equalsIgnoreCase("Chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            System.out.println("Chrome is Launched ");
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	            System.out.println("Firebox is Launched ");
	        } else if (browser.equalsIgnoreCase("edge")) {
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	            System.out.println("Edge Browser is Launched ");
	        }
	        driver.get(BASE_URL);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
	        driver.manage().window().maximize();
	        System.out.println(driver.getTitle());

	    }
	    
	    

	    
	   
}
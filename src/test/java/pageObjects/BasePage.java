package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utilities.AppUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	 public static WebDriver driver;
	 
	 //LOGIN PAGE VARIABLES
	 public static final String BASE_URL = "https://alfosv2-dev.americasleading.com/login";
	    public static final String USERNAME = "alfdev@yopmail.com";
	    public static final String PASSWORD = "R0@$7263GGat";
	    public static final String LOGIN_OTP = "118269";
	    
	    // ADD DEALER PAGE VARIABLES
	    public static final String ADD_DEALNAME = "Test ALF deAler11";
	    public static final String ADD_DEALPOCNAME = "Test ALF deAler11";
	    public static final String ADD_EMAIL = "alftest106@yopmail.com";
	    public static final String ADD_PHONENO = "2346543120";
	    public static final String ADD_ADDRESS = "FLORIDA";
	    public static final String ADD_CITY = "MIAMI";
	    public static final String ADD_ZIP = "43212";
	    
	    //EDIT DEALER PAGE VARIABLES
	    public static final String EDIT_PHONENO = "5674599880";
	    public static final String EDIT_ZIP = "43211";
	    public static final String EDIT_EMAIL = "alftest108@yopmail.com";
	    
	  //DELETE DEALER PAGE VARIABLES
	    public static final String DELETE_DEALNAME = "Test ALF deAler11";
	   
	  
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
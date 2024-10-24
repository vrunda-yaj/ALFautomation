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

import AdminUtilities.AppUtil;
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
	    
	   // ADD LOT PAGE VARIABLES
	    public static final String ADD_LOTNAME = "Alf motor lot7";
	    public static final String ADD_LOTCODE = "907";
	    public static final String ADD_LOTPHONE = "8654432322";
	    public static final String ADD_LOTPOCNAME = "Alf motor lot7";
	    public static final String ADD_LOTPOCEMAIL = "alfmotor07@yopmail.com";
	    public static final String ADD_LOTPOCPHONE = "8654432322";
	    public static final String ADD_LOTADDRESS = "FLORIDA";
	    public static final String ADD_LOTCITY = "MIAMI";
	    public static final String ADD_LOTZIP = "56743";
	    
	    //EDIT LOT PAGE VARIABLES
	    public static final String EDIT_LOTNAME = "Alf motor lot3";
	    public static final String EDIT_LOTPHONE = "9033452890";
	    public static final String EDIT_LOTZIP = "54432";
	    
	    //DELETE LOT PAGE VARIABLES
	    public static final String DELETE_LOTNAME = "Alf motor lot4";
	    
	   //ADD USER PAGE VARIABLES
	    public static final String ADD_UFNAME = "Robin";
	    public static final String ADD_UMNAME = "JOHN";
	    public static final String ADD_UPHONE = "5443232110";
	    public static final String ADD_UTITLE = "F and I dealer";
	    public static final String ADD_UEMAIL = "robin011@yopmail.com";
	    public static final String ADD_ULNAME = "ZUCOWICH";
	    public static final String ADD_UMOTHERLNAME = "MARY";
	    
	    
	  //EDIT USER PAGE VARIABLES
	    
	    public static final String EDIT_UPHONE = "5443232110";
	    public static final String EDIT_UMOTHERLNAME = "MARY";
	  
	    //DELETE USER PAGE VARIABLES
	    
	    public static final String DELETE_UNAME = "new test";
	    
	    
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
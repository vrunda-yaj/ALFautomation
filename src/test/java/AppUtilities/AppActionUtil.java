package AppUtilities;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import AppPageObject.BasePage;

public class AppActionUtil extends BasePage{
	

	
	    // Click method with element visibility check
	    public static void click(WebElement element) {
	        visibilityOfElement(element);
	        element.click();
	    }

	    // Set text in input fields
	    public static void setText(WebElement element, String text) {
	        visibilityOfElement(element);
	        element.sendKeys(text);
	    }

	    // Get text from element
	    public static String getText(WebElement element) {
	        visibilityOfElement(element);
	        return element.getText();
	    }

	    // Wait until the element is visible
	    public static void visibilityOfElement(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    // Wait for a certain time (use only if absolutely necessary)
	    public static void waitFor(int timeInSeconds) throws InterruptedException {
	        Thread.sleep(timeInSeconds * 1000);
	    }

	    // Clear input fields
	    public static void clear(WebElement element) {
	        visibilityOfElement(element);
	        element.clear();
	    }
	    public static void select_by_value(WebElement element, String text){
	        visibilityOfElement(element);
	        Select sle = new Select(element);
	        sle.selectByValue(text);
	    }
	    
	    public static void select_by_visiblityText(WebElement element, String text){
	        visibilityOfElement(element);
	        Select sle = new Select(element);
	       sle.selectByVisibleText(text);
	    }
	    
	    public static void scroll_till_element(WebElement element) throws InterruptedException {

	        visibilityOfElement(element);
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("arguments[0].scrollIntoView()", element);
	        waitFor(3);
	    }
	    public static void set_value (WebElement ele, String text){
	        visibilityOfElement(ele);
	        String script = "arguments[0].value = arguments[1]";
	        ((JavascriptExecutor) driver).executeScript(script,ele, text);	
	    }
	    
	    public static void scrollToElement(WebElement element) {
	    	visibilityOfElement(element);
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).perform();
	    }
	    public static void scroll_till_bottom_page(){
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    }
	}




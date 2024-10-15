package Utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;

public class AppUtil extends BasePage {

   

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
}

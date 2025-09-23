package Utiles.CommonHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {

    //Variables
    private static final int waitingTime = 10;
    private static WebDriverWait wait;

    //Waits Functions
    public static WebElement waitForVisibility(WebDriver driver, By locator){
        wait=new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForElementClickable(WebDriver driver,By locator){
       wait=new WebDriverWait(driver,Duration.ofSeconds(waitingTime));
       return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    //Selenium Actions Functions
    public static void clickOnElement(WebDriver driver,By locator){
        waitForElementClickable(driver,locator).click();
    }
    public static void type(WebDriver driver,By locator, String text){
        WebElement element=waitForVisibility(driver,locator);
        element.sendKeys(text);
    }
    public static String getText(WebDriver driver,By locator){
        return waitForVisibility(driver,locator).getText();
    }
    public static WebElement findElementByText(WebDriver driver,String text){
        return waitForVisibility(driver,By.xpath("//*[contains(text(),'"+text+"')]"));
    }
    public static void selectFromDropDownByText(WebDriver driver, By locator,String Text){
        Select select=new Select(waitForElementClickable(driver,locator));
        select.selectByVisibleText(Text);

    }
    public static void selectFromDropDownByIndex(WebDriver driver,By locator, int index){
        Select select=new Select(waitForElementClickable(driver,locator));
        select.selectByIndex(index);
    }
    public static void selectFromDropDownByValue(WebDriver driver, By locator,String Value) {
        Select select = new Select(waitForElementClickable(driver, locator));
        select.selectByValue(Value);
    }
    public static boolean isElementDisplayed(By locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    //JS Actions Functions
    public void scrollToElement(WebDriver driver,By locator) {
        WebElement element=waitForVisibility(driver,locator);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void jsClick(WebDriver driver,By locator) {
        WebElement element=waitForElementClickable(driver,locator);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public static String getCurrentUrl(WebDriver driver){
        return driver.getCurrentUrl();
    }

}

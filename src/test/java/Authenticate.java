import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Authenticate {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Wait<WebDriver> fluentwait;
    protected String Email="Paula999999999@gmail.com";
    protected String Password="123456789";

    @BeforeClass
    public void setUp(){
        ChromeOptions options=new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("autofill.profile_enabled", false);
        prefs.put("autofill.passwords_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--incognito");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-features=PasswordManager,PasswordLeakDetection,PasswordCheck");
        driver = new ChromeDriver(options);

        // First Type of Waits is implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");

        //Define Fluent Wait with Maximum 20 Seconds and Searching for the Web element every 2 Seconds
        fluentwait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }

    @Test
    public void Register(){

        // Second Type of Waits is Explicit wait which Catch the element when a specific condition is true
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Signup / Login"))).click();

        //Name
        driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Paula");

        //Email
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys(Email);

        //SignUp Button
        driver.findElement(By.xpath("//button[text()='Signup']")).click();

        //Title
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")))
                .click();

        //Password
        driver.findElement(By.id("password")).sendKeys(Password);

        //Date Of Birth DropdownList
        //Days Dropdown
        Select Days=new Select(driver.findElement(By.id("days")));
        Days.selectByVisibleText("9");
        //Month Dropdown
        Select Months=new Select(driver.findElement(By.id("months")));
        Months.selectByVisibleText("January");
        //Year Dropdown
        Select Years=new Select(driver.findElement(By.id("years")));
        Years.selectByVisibleText("2000");

        // The full Name
        driver.findElement(By.id("first_name")).sendKeys("Paula");
        driver.findElement(By.id("last_name")).sendKeys("Farid");

        //Address
        driver.findElement(By.id("address1")).sendKeys("Street12984");

        //Country
        Select Country=new Select(driver.findElement(By.id("country")));
        Country.selectByVisibleText("Canada");

        //State
        driver.findElement(By.id("state")).sendKeys("KJM");

        //City
        driver.findElement(By.id("city")).sendKeys("Cairo");

        //ZipCode
        driver.findElement(By.id("zipcode")).sendKeys("65789");

        //Mobile Number
        driver.findElement(By.id("mobile_number")).sendKeys("012789745");

        //CreateAccount Button Using Fluent Wait
        WebElement createBtn = wait.until(d -> d.findElement(By.cssSelector("button[data-qa='create-account']")));
        createBtn.click();

        //Assert That Account Created Using Api And Hard Assert
        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL="https://automationexercise.com/account_created";
        Assert.assertEquals(ActualURL,ExpectedURL,"URL Is Not Correct");


        //Assert That Account Created Successfully Using SoftAssert
        String ActualResult="Account Created!";
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(ActualResult,"Account Created!","Account Not Created Try Again");
        softAssert.assertAll();

        //Logout Button
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Signup / Login")))
                .click();
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")))
                .click();
    }

    @Test(dependsOnMethods = {"Register"})
    public void Login(){

        //Email
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys(Email);

        //Password
        driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys(Password);

        //Login Button
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-qa='login-button']")))
                .click();

        //Assert That logged in Successfully Using Explicit Wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logged in as')]"))
        );
        Assert.assertTrue(message.isDisplayed(), "Failed Login!");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

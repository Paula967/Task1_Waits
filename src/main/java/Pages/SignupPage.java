package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

    //Variables
    WebDriver driver;

    //Locators
    private final By Name=By.cssSelector("input[data-qa='signup-name']");
    private final By registerEmail=By.cssSelector("input[data-qa='signup-email']");
    private final By signUpButton=By.xpath("//button[text()='Signup']");
    private final By mrGender=By.id("id_gender1");
    private final By password=By.id("password");
    private final By daysDropDown=By.id("days");
    private final By monthsDropDown=By.id("months");
    private final By yearsDropDown=By.id("years");
    private final By f_Name=By.id("first_name");
    private final By l_Name=By.id("last_name");
    private final By address=By.id("address1");
    private final By countryDropDown=By.id("country");
    private final By state=By.id("state");
    private final By city=By.id("city");
    private final By zipCode=By.id("zipcode");
    private final By mobilePhone=By.id("mobile_number");
    private final By createAccountBtn =By.cssSelector("button[data-qa='create-account']");

    //Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public SignupPage enterName(String name){
        driver.findElement(Name).sendKeys(name);
        return  this;
    }
    public  SignupPage EnterEmail(String email){
        driver.findElement(registerEmail).sendKeys( email);
        return  this;
    }
    public  SignupPage  clickOnSignupBtn (){
        driver.findElement(signUpButton).click();
        return this;
    }
    public  SignupPage  chooseGender(){
        driver.findElement(mrGender).click();
        return this;
    }
    public  SignupPage enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
        return this;
    }
    public  SignupPage chooseDay(String day){
        Select Days = new Select(driver.findElement(daysDropDown));
        Days.selectByVisibleText(day);
        return this;
    }
    public  SignupPage chooseMonth(String month){
        Select Months = new Select(driver.findElement(monthsDropDown));
        Months.selectByVisibleText(month);
        return this;
    }
    public  SignupPage chooseYear (String year){
        Select Years = new Select(driver.findElement(yearsDropDown));
        Years.selectByValue(year);
        return this;
    }
    public  SignupPage enterFirstName  (String name){
        driver.findElement(f_Name).sendKeys(name);
        return this;
    }
    public  SignupPage enterLastName  (String name){
        driver.findElement(l_Name).sendKeys(name);
        return this;
    }
    public  SignupPage  enterAddress (String address){
        driver.findElement(this.address).sendKeys(address);
        return this;
    }
    public  SignupPage  chooseCountry ( String country){
        Select Countries = new Select(driver.findElement(countryDropDown));
        Countries.selectByVisibleText(country);
        return this;
    }
    public  SignupPage enterCity  ( String city){
        driver.findElement(this.city).sendKeys(city);
        return this;
    }
    public  SignupPage enterState  (String state){
        driver.findElement(this.state).sendKeys(state);
        return this;
    }
    public  SignupPage enterZipCode (String code){
        driver.findElement(zipCode).sendKeys(code);
        return this;
    }
    public  SignupPage  enterMobileNumber( String number){
        driver.findElement(mobilePhone).sendKeys(number);
        return this;
    }
    public  SignupPage clickOnCreateAccountBtn(){
        driver.findElement(createAccountBtn).click();
        return this;
    }

}

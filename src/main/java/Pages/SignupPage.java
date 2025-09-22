package Pages;

import Utiles.CommonHelper.ElementHelper;
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
        ElementHelper.type(driver,Name,name);
        return  this;
    }
    public SignupPage EnterEmail(String email){
        ElementHelper.type(driver,registerEmail,email);
        return  this;
    }
    public SignupPage clickOnSignupBtn (){
        ElementHelper.clickOnElement(driver,signUpButton);
        return this;
    }
    public SignupPage chooseGender(){
        ElementHelper.clickOnElement(driver,mrGender);
        return this;
    }
    public SignupPage enterPassword(String pass){
        ElementHelper.type(driver,password,pass);
        return this;
    }
    public  SignupPage chooseDay(String day){
        ElementHelper.selectFromDropDownByText(driver,daysDropDown,day);
        return this;
    }
    public  SignupPage chooseMonth(String month){
        ElementHelper.selectFromDropDownByText(driver,monthsDropDown,month);
        return this;
    }
    public  SignupPage chooseYear (String year){
        ElementHelper.selectFromDropDownByText(driver,yearsDropDown,year);
        return this;
    }
    public  SignupPage enterFirstName  (String name){
        ElementHelper.type(driver,f_Name,name);
        return this;
    }
    public  SignupPage enterLastName  (String name){
        ElementHelper.type(driver,l_Name,name);
        return this;
    }
    public  SignupPage  enterAddress (String address){
        ElementHelper.type(driver,this.address,address);
        return this;
    }
    public  SignupPage  chooseCountry ( String country){
        ElementHelper.selectFromDropDownByText(driver,countryDropDown,country);
        return this;
    }
    public  SignupPage enterCity  ( String city){
        ElementHelper.type(driver,this.city,city);
        return this;
    }
    public  SignupPage enterState  (String state){
        ElementHelper.type(driver,this.state,state);
        return this;
    }
    public  SignupPage enterZipCode (String code){
        ElementHelper.type(driver,zipCode,code);
        return this;
    }
    public  SignupPage  enterMobileNumber( String number){
        ElementHelper.type(driver,mobilePhone,number);
        return this;
    }
    public  SignupPage clickOnCreateAccountBtn(){
        ElementHelper.clickOnElement(driver,createAccountBtn);
        return this;
    }

}

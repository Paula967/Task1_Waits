package Pages;

import Utiles.CommonHelper.ElementHelper;
import Utiles.CommonHelper.Global;
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

    public SignupPage enterName(){
        ElementHelper.type(driver,Name, Global.fullName);
        return  this;
    }
    public SignupPage EnterEmail(){
        ElementHelper.type(driver,registerEmail,Global.email);
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
    public SignupPage enterPassword(){
        ElementHelper.type(driver,password,Global.password);
        return this;
    }
    public  SignupPage chooseDay(){
        ElementHelper.selectFromDropDownByText(driver,daysDropDown,Global.birthDay);
        return this;
    }
    public  SignupPage chooseMonth(){
        ElementHelper.selectFromDropDownByText(driver,monthsDropDown,Global.birthMonth);
        return this;
    }
    public  SignupPage chooseYear(){
        ElementHelper.selectFromDropDownByText(driver,yearsDropDown,Global.birthYear);
        return this;
    }
    public SignupPage enterFirstName(){
        ElementHelper.type(driver,f_Name,Global.firstName);
        return this;
    }
    public SignupPage enterLastName(){
        ElementHelper.type(driver,l_Name,Global.lastName);
        return this;
    }
    public SignupPage enterAddress(){
        ElementHelper.type(driver,this.address,Global.address);
        return this;
    }
    public SignupPage chooseCountry (String country){
        ElementHelper.selectFromDropDownByText(driver,countryDropDown,country);
        return this;
    }
    public SignupPage enterCity(){
        ElementHelper.type(driver,this.city,Global.city);
        return this;
    }
    public SignupPage enterState(){
        ElementHelper.type(driver,this.state,Global.state);
        return this;
    }
    public SignupPage enterZipCode(){
        ElementHelper.type(driver,zipCode,Global.zipCode);
        return this;
    }
    public SignupPage enterMobileNumber(){
        ElementHelper.type(driver,mobilePhone,Global.phoneNumber);
        return this;
    }
    public void clickOnCreateAccountBtn(){
        ElementHelper.clickOnElement(driver,createAccountBtn);
    }

}

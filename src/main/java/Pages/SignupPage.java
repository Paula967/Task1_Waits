package Pages;

import Utiles.CommonHelper.ElementHelper;
import Utiles.CommonHelper.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManager;

public class SignupPage {

    //Variables
    WebDriver driver;
    Global global;

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
    public SignupPage() {
        this.driver = DriverManager.getDriver();
        global=Global.getInstance();
    }

    public SignupPage enterName(){
        ElementHelper.type(driver,this.Name,global.getFullName());
        return this;
    }
    public SignupPage EnterEmail(){
        ElementHelper.type(driver,registerEmail,global.getEmail());
        return this;
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
        ElementHelper.type(driver,password,global.getPassword());
        return this;
    }
    public  SignupPage chooseDay(){
        ElementHelper.selectFromDropDownByText(driver,daysDropDown,global.getBirthDay());
        return this;
    }
    public  SignupPage chooseMonth(){
        ElementHelper.selectFromDropDownByText(driver,monthsDropDown,global.getBirthMonth());
        return this;
    }
    public  SignupPage chooseYear(){
        ElementHelper.selectFromDropDownByText(driver,yearsDropDown,global.getBirthYear());
        return this;
    }
    public SignupPage enterFirstName(){
        ElementHelper.type(driver,f_Name,global.getFirstName());
        return this;
    }
    public SignupPage enterLastName(){
        ElementHelper.type(driver,l_Name,global.getLastName());
        return this;
    }
    public SignupPage enterAddress(){
        ElementHelper.type(driver,this.address,global.getAddress());
        return this;
    }
    public SignupPage chooseCountry (String country){
        ElementHelper.selectFromDropDownByText(driver,countryDropDown,country);
        return this;
    }
    public SignupPage enterCity(){
        ElementHelper.type(driver,this.city,global.getCity());
        return this;
    }
    public SignupPage enterState(){
        ElementHelper.type(driver,this.state,global.getState());
        return this;
    }
    public SignupPage enterZipCode(){
        ElementHelper.type(driver,zipCode,global.getZipCode());
        return this;
    }
    public SignupPage enterMobileNumber(){
        ElementHelper.type(driver,mobilePhone,global.getPhoneNumber());
        return this;
    }
    public void clickOnCreateAccountBtn(){
        ElementHelper.clickOnElement(driver,createAccountBtn);
    }

}

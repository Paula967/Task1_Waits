package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SigninPage {

    //Variables
    WebDriver driver;

    private final By loginEmail=By.cssSelector("input[data-qa='login-email']");
    private final By loginPassword=By.cssSelector("input[data-qa='login-password']");
    private final By loginButton=By.cssSelector("button[data-qa='login-button']");

    //Constructor
    public SigninPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public SigninPage enterLoginEmail(String Email){
        driver.findElement(loginEmail).sendKeys(Email);
        return this;
    }
    public SigninPage enterLoginPassword(String Password){
        driver.findElement(loginPassword).sendKeys(Password);
        return this;
    }
    public SigninPage clickLogin(){
        driver.findElement(loginButton).click();
        return this;
    }

}

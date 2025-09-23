package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverManager.DriverManager;

public class HomePage {

    //Variables
     WebDriver driver;

    //Locators
     private final By signInUpBtn=By.linkText("Signup / Login");

    //Constructor
    public HomePage() {
        this.driver = DriverManager.getDriver();
    }

    //Actions
    public void clickOnSignInUpButton(){
        driver.findElement(signInUpBtn).click();
    }
}

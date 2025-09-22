package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //Variables
     WebDriver driver;

    //Locators
     private final By signInUpBtn=By.linkText("Signup / Login");

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickOnSignInUpButton(){
        driver.findElement(signInUpBtn).click();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;


public class DriverManager {

    static WebDriver driver;
    static String BrowserName="chrome";
    static String  URL="https://automationexercise.com/";

    public static void driverSetup(){
        switch (BrowserName.toLowerCase())
        {
            case "chrome":
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("--disable-save-password-bubble");
                options.addArguments("--disable-features=PasswordManager,PasswordLeakDetection,PasswordCheck");
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions=new FirefoxOptions();
                firefoxOptions.addArguments("--incognito");
                firefoxOptions.addArguments("--disable-save-password-bubble");
                firefoxOptions.addArguments("--disable-features=PasswordManager,PasswordLeakDetection,PasswordCheck");
                driver =new FirefoxDriver(firefoxOptions);
                break;
            default:
                EdgeOptions edgeOptions=new EdgeOptions();
                edgeOptions.addArguments("--incognito");
                edgeOptions.addArguments("--disable-save-password-bubble");
                edgeOptions.addArguments("--disable-features=PasswordManager,PasswordLeakDetection,PasswordCheck");
                driver = new EdgeDriver(edgeOptions);
                break;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to(URL);
    }
    static public WebDriver getDriver(){
        if(driver==null){
            driverSetup();
        }
        return driver;
    }
    static public void closeDriver(){
        driver.quit();
    }

}

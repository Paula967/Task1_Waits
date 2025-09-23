import DriverManager.DriverManager;
import Pages.HomePage;
import Pages.SignupPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    HomePage Home ;
    SignupPage signupPage ;

    @BeforeClass
    public void setup(){
        Home= new HomePage();
        signupPage=new SignupPage();
    }
    @Test(testName = "Signup", groups = "regression",priority =1)
    public  void signupHappyPathFlow (){
        Home.clickOnSignInUpButton();
        signupPage.EnterEmail()
                .clickOnSignupBtn().chooseGender()
                .enterPassword().chooseDay()
                .chooseMonth().chooseYear()
                .enterFirstName().enterLastName()
                .enterAddress().chooseCountry("India")
                .enterState().enterCity()
                .enterZipCode().enterMobileNumber()
                .clickOnCreateAccountBtn();
    }

}

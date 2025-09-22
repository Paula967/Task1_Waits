import Pages.HomePage;
import Pages.SignupPage;
import Utiles.CommonHelper.Global;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    HomePage Home ;
    SignupPage signupPage ;

    @BeforeClass
    public void setup(){
        Home= new HomePage(DriverManager.getDriver());
        signupPage=new SignupPage(DriverManager.getDriver());
    }
    @Test(testName = "Signup", groups = "regression",priority =1)
    public  void signupHappyPathFlow (){
        Home.clickOnSignInUpButton();
        SignupPage signupPage1=signupPage.enterName(Global.fullName)
                .EnterEmail(Global.email)
                .clickOnSignupBtn()
                .chooseGender()
                .enterPassword(Global.password)
                .chooseDay(Global.birthDay)
                .chooseMonth(Global.birthMonth)
                .chooseYear(Global.birthYear)
                .enterFirstName(Global.firstName)
                .enterLastName(Global.lastName)
                .enterAddress(Global.address)
                .chooseCountry("India")
                .enterState(Global.state)
                .enterCity(Global.city)
                .enterZipCode(Global.zipCode)
                .enterMobileNumber(Global.phoneNumber)
                .clickOnCreateAccountBtn();
    }

}

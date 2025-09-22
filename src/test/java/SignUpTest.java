import Pages.HomePage;
import Pages.SignupPage;
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
        signupPage.enterName("Ahmed").EnterEmail("Atos@gmail").clickOnSignupBtn()
                .chooseGender()
                .enterPassword("P@ssw0rd")
                .chooseDay("6").chooseMonth("March").chooseYear("2003")
                .enterFirstName("Mo").enterLastName("Mo")
                .enterAddress("Address").chooseCountry("India").enterState("state").enterCity("city")
                .enterZipCode("+20").enterMobileNumber("0100")
                .clickOnCreateAccountBtn();
    }

}

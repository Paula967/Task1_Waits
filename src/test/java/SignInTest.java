import DriverManager.DriverManager;
import Pages.HomePage;

import Pages.SigninPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{

    HomePage Home;
    SigninPage signinPage;

    @BeforeClass
    public void setUp(){
        Home=new HomePage();
        signinPage=new SigninPage();
    }

    @Test
    public void signIn(){
        Home.clickOnSignInUpButton();
        signinPage.enterLoginEmail("").enterLoginPassword("").clickLogin();

    }

}

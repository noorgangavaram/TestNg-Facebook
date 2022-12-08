import org.testng.annotations.Test;

//THIS IS THE LOGIN PAGE WHERE WE CAN CALL ALL THE METHODS PRESENT IN THE (Page Object) CLASS

public class FacebookLogin extends BaseTest {

    @Test
    public void facebooklogin() {
        FacebookLoginPO facebookLoginPO = new FacebookLoginPO(driver);

        facebookLoginPO.setEmailId();

        facebookLoginPO.setPassword();

        facebookLoginPO.setLogin_btn();

    }

}

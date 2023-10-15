package features;

import org.junit.Test;
import utils.Constans;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.waitABit(1000);
        loginSteps.loginButton();
    }

    @Test
    public void loginWithInvalidCredentials() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.INVALID_USER_EMAIl);
        loginSteps.setPassword(Constans.INVALID_USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.waitABit(1000);
        loginSteps.authenticationButton();
        loginSteps.verifyUserNotLoggedIn();
    }
    @Test
    public void loginWithValidCredentialsChangingPassword() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.myAccountFromDropDown();
        loginSteps.waitABit(2000);
        loginSteps.changePasswordCheckBox();
        loginSteps.waitABit(3000);
        loginSteps.setPassword(Constans.NEW_USER_PASS);
        loginSteps.updateButton();
        loginSteps.waitABit(2000);
        loginSteps.changePasswordCheckBox();
        loginSteps.waitABit(1000);
        loginSteps.changePasswordCheckBox();
        loginSteps.waitABit(3000);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.updateButton();
    }

    @Test
    public void loginAlternativeWithValidCredentials() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.loginButton2();
        loginSteps.setUserEmail2(Constans.USER_EMAIl);
        loginSteps.setPassword2(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField("abc123");
        loginSteps.authenticationButton2();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.waitABit(1000);
        loginSteps.loginButton();
        loginSteps.waitABit(2000);
    }



}

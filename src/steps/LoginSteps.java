package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {



    @Step
    public void cookieAcceptButton() {
        loginPage.clickCookieAcceptButton();}

    @Step
    public void loginButton() {
        loginPage.clickLoginButton();
    }


    @Step
    public void setUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void setPassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void authenticationButton() {
        loginPage.clickAuthenticationButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName) {
    Assert.assertEquals( loginPage.getWelcomeMessage(),loginPage.getWelcomeMessage() + userName);
    }

    @Step
      public void verifyUserNotLoggedIn() {
         Assert.assertEquals("Ne pare rău, dar combinația dintre utilizator și parolă nu este validă. Te rugăm să încerci din nou.", loginPage.getAuthenticationErrorMessage());
      }

    @Step
    public void myAccountFromDropDown(){
        loginPage.clickMyAccountFromDropDown();
    }

    @Step
    public void changePasswordCheckBox(){
        loginPage.changePasswordCheckBox();
    }

    @Step
    public void updateButton(){loginPage.updateButton();}

    @Step
    public void loginButton2(){loginPage.clickLoginButton2();}

    @Step
    public void setUserEmail2(String email) {
        loginPage.setEmailField2(email);
    }
    @Step
    public void setPassword2(String password) {
        loginPage.setPasswordField2(password);
    }

    @Step
    public void authenticationButton2() {
        loginPage.clickAuthenticationButton2();
    }

    @Step
    public void authenticationCaptchaField(String value){
        loginPage.setAuthenticationCaptchaField(value);
    }

    @Step
    public void authenticationCaptchaField2(String value){
        loginPage.setAuthenticationCaptchaField2(value);
    }




}

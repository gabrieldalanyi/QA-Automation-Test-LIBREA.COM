package features;

import org.junit.Test;
import utils.Constans;

public class ContactTest extends BaseTest{

    @Test
    public void contactPageFormLoggedIn(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.loginButton2();
        loginSteps.setUserEmail2(Constans.USER_EMAIl);
        loginSteps.setPassword2(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField("abc123");
        loginSteps.authenticationButton2();
        contactSteps.contactHoverBlogButton();
        productSteps.ratingProductTitle();
        productSteps.ratingProductDescription();
        productSteps.sendTheOrderButton();

    }
    @Test
    public void contactPageFormNotLoggedIn() {

        loginSteps.cookieAcceptButton();
        contactSteps.contactHoverBlogButton();
        contactSteps.contactNameField();
        contactSteps.contactEmailField();
        productSteps.ratingProductTitle();
        productSteps.ratingProductDescription();
        contactSteps.contactCaptchaField();
        contactSteps.contactIAgreeTermsButton();
        productSteps.sendTheOrderButton();
        contactSteps.waitABit(1000);

    }

}

package features;

import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void newsLetterSubscribeNotLoggedIn(){
        loginSteps.cookieAcceptButton();
        homeSteps.newsLetterField("minebostudio@gmail.com");
        homeSteps.newsLetterTermsButton();
        homeSteps.newsLetterTermsExitButton();
        homeSteps.newsLetterCheckBox();
        homeSteps.newsLetterSubmitButton();
        homeSteps.checkNewsLetterSuccessMessage();
    }

    @Test
    public void newsLetterSubscribe2NotLoggedIn(){
        loginSteps.cookieAcceptButton();
        homeSteps.newsLetterField2("minebostudio@gmail.com");
        homeSteps.newsLetterTermsButton2();
        homeSteps.newsLetterTermsExitButton();
        homeSteps.newsLetterCheckBox2();
        homeSteps.newsLetterSubmitButton2();
        homeSteps.checkNewsLetterSuccessMessage2();
    }

    @Test
    public void changingCurrencyOnToolbar() {
        loginSteps.cookieAcceptButton();
        homeSteps.waitABit(500);
        homeSteps.currencyToolbarButton();
        homeSteps.checkCookieCurrency();
        homeSteps.waitABit(500);
        homeSteps.currencyToolbarButton();
        homeSteps.checkCookieCurrency();

    }

    @Test
    public void changingLanguageOnToolbar() {
        loginSteps.cookieAcceptButton();
        homeSteps.languageToolbarButton();
        homeSteps.waitABit(1000);


    }

}

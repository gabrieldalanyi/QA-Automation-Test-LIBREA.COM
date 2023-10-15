package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeSteps extends BaseSteps{

    @Step
    public void newsLetterField(String value){
        homePage.setNewsLetterField(value);
    }
    @Step
    public void newsLetterSubmitButton(){
        homePage.clickNewsLetterSubmitButton();
 }

    @Step
    public void newsLetterCheckBox(){
        homePage.clickNewsLetterCheckBox();
 }

    @Step
    public void checkNewsLetterSuccessMessage(){
        Assert.assertEquals("Te-ai abonat cu succes la newsletter.",homePage.getNewsLetterSuccessMessage());}

    @Step
    public void newsLetterField2(String value){homePage.setNewsLetterField2(value);}

    @Step
    public void newsLetterCheckBox2(){
        homePage.clickNewsLetterCheckBox2();
    }

    @Step
    public void newsLetterSubmitButton2(){
        homePage.clickNewsLetterSubmitButton2();
    }
    @Step
    public void newsLetterTermsButton(){homePage.clickNewsLetterTermsButton();}

    @Step
    public void newsLetterTermsExitButton(){
        homePage.clickNewsLetterTermsExitButton();
    }
    @Step
    public void checkNewsLetterSuccessMessage2(){
        Assert.assertEquals("Te-ai abonat cu succes la newsletter.",homePage.getNewsLetterSuccessMessage2());}

    @Step
    public void newsLetterTermsButton2(){
        homePage.clickNewsLetterTermsButton2();
    }

    @Step
    public void currencyToolbarButton(){
        homePage.clickCurrencyToolbarButton();
    }

    @Step
    public void languageToolbarButton(){
        homePage.clickLanguageToolbarButton();
    }

    @Step
    public void checkCookieCurrency(){
        homePage.getCookieCurrency();
    }



}


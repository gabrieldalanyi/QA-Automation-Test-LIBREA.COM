package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Cookie;

import java.util.Set;

@DefaultUrl("https://test.shopoteque.com/")
public class HomePage extends PageObject {

    @FindBy(css=".flex-1.my-1.mobile-full")
    private WebElementFacade newsLetterField;

    @FindBy(css=".button--secondary.mobile-full.btn-submit.my-1.mx-2.js-newsletter")
    private WebElementFacade newsLetterSubmitButton;

    @FindBy(css=".custom-type.pl-0 .checkmark")
    private WebElementFacade newsLetterCheckBox;

    @FindBy(css=".input-wrapper.col-12.col-sm-12.pt-2.alert.alert-success.p-2.my-2")
    private WebElementFacade newsLetterSuccessMessage;

    @FindBy(css=".input--fluid.text-lowercase")
    private WebElementFacade newsLetterField2;

    @FindBy(css=".col-4.col-md-6.col-sm-12.col-xs-12 .checkmark")
    private WebElementFacade newsLetterCheckBox2;

    @FindBy(css=".newsletter .btn-submit")
    private WebElementFacade newsLetterSubmitButton2;

    @FindBy(css=".link--white")
    private WebElementFacade newsLetterTermsButton;

    @FindBy(css="#terms_of_service > div > div > button > i")
    private WebElementFacade newsLetterTermsExitButton;

    @FindBy(css=".footer-top .alert.alert-success.p-2.my-2")
    private WebElementFacade newsLetterSuccessMessage2;

    @FindBy(css="body > footer > div > div.footer-top > div > div.col-4.col-md-6.col-sm-12.col-xs-12 > form > div.input-wrapper.pt-2 > label > span.custom-type__label > a")
    private WebElementFacade newsLetterTermsButton2;

    @FindBy(css=".group.pr-2.text-left .selected")
    private WebElementFacade currencyToolbarButton;

    @FindBy(css="a.js-currency")
    private WebElementFacade currencyIconButton;

    @FindBy(css="div.group:last-child")
    private WebElementFacade languageIconButton;

    @FindBy(css="body > div.toolbar > div > div > div:nth-child(4) > ul > li:nth-child(2) > a")
    private WebElementFacade englishIconButton;

    @FindBy(css="body > div.toolbar > div > div > div:nth-child(4) > ul > li:nth-child(3) > a")
    private WebElementFacade frenchIconButton;



    public void setNewsLetterField(String value){typeInto(newsLetterField,value);}
    public void clickNewsLetterSubmitButton(){clickOn(newsLetterSubmitButton);}
    public void clickNewsLetterCheckBox(){clickOn(newsLetterCheckBox);}
    public String getNewsLetterSuccessMessage(){return newsLetterSuccessMessage.getText();}

    public void setNewsLetterField2(String value){typeInto(newsLetterField2,value);}
    public void clickNewsLetterCheckBox2(){clickOn(newsLetterCheckBox2);}

    public void clickNewsLetterSubmitButton2(){clickOn(newsLetterSubmitButton2);}
    public void clickNewsLetterTermsButton(){clickOn(newsLetterTermsButton);}
    public void clickNewsLetterTermsExitButton(){clickOn(newsLetterTermsExitButton);}

    public String getNewsLetterSuccessMessage2(){return newsLetterSuccessMessage2.getText();}

    public void clickNewsLetterTermsButton2(){clickOn(newsLetterTermsButton2);}

    public void clickCurrencyToolbarButton(){
      clickOn(currencyToolbarButton);
      clickOn(currencyIconButton);}

    public void clickLanguageToolbarButton() {
        clickOn(languageIconButton);
        String actualUrl = getDriver().getCurrentUrl();
        System.out.println("Actual URL: " + actualUrl);
        sleep();

        clickOn(englishIconButton);
        String aactualUrl = getDriver().getCurrentUrl();
        System.out.println("Actual URL: " + aactualUrl);
        sleep();

        clickOn(languageIconButton);
        sleep();

        clickOn(frenchIconButton);
        String aaactualUrl = getDriver().getCurrentUrl();
        System.out.println("Actual URL: " + aaactualUrl);
    }
    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getCookieCurrency() {

        Set<Cookie> cookies = getDriver().manage().getCookies();

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("cookie_currency")) {
                String currencyValue = cookie.getValue();
                System.out.println("Cookie Currency Value: " + currencyValue + " !");
                break;
            }
        }
    }


}

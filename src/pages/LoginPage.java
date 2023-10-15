package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class LoginPage extends PageObject {

    @FindBy(css = "#cookiebar__accept")
    private WebElementFacade cookieAcceptButton;

    @FindBy(css="#userDropdown")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//input[@name='contact[email]']")
    private WebElementFacade emailField;
    @FindBy(xpath = "//input[@name='contact[password]']")
    private WebElementFacade passwordField;

    @FindBy(css = ".button--primary.button--fluid.btn-submit")
    private WebElementFacade authenticationButton;

    @FindBy(css = ".pb-2.m-0")
    private WebElementFacade welcomeMessage;

    @FindBy(css = ".alert.alert-danger.mb-2")
    private WebElementFacade authenticationErrorMessage;

    @FindBy(css = "#header > div > div > ul > li:nth-child(2) > div > div > a:nth-child(4)")
    private WebElementFacade myAccountFromDropDown;

    @FindBy(css = "#account > div.row.mb-2 > div > label > span.custom-type__label")
    private WebElementFacade changePasswordCheckBox;

    @FindBy(css = ".button.button--primary.btn-submit")
    private WebElementFacade updateButton;

    @FindBy(css = ".button--tertiary.button--fluid.mt-2.js-remove-local-storage")
    private WebElementFacade loginButton2;

    @FindBy(css=".text-lowercase:last-child")
    private WebElementFacade emailField2;

    @FindBy(css="input[name='contact[password]']:nth-child(2)")
    private WebElementFacade passwordField2;

    @FindBy(css = ".button.button--primary.btn-submit.js-remove-local-storage")
    private WebElementFacade authenticationButton2;

    @FindBy(css = ".col-6.col-sm-12 .text-center")
    private WebElementFacade authenticationCaptchaField;

    @FindBy(css = ".col-7.col-sm-12.input-row .text-center")
    private WebElementFacade authenticationCaptchaField2;


    public void clickCookieAcceptButton() {
        clickOn(cookieAcceptButton);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickAuthenticationButton() {
        clickOn(authenticationButton);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();}

    public String getAuthenticationErrorMessage() {
        return authenticationErrorMessage.getText();}

    public void clickMyAccountFromDropDown(){
        clickOn(myAccountFromDropDown);
    }
    public void changePasswordCheckBox(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(changePasswordCheckBox).build().perform();
        clickOn(changePasswordCheckBox);}

    public void updateButton(){clickOn(updateButton);}

    public void clickLoginButton2() {clickOn(loginButton2);}

    public void setEmailField2(String value) {
        typeInto(emailField2, value);
    }

    public void setPasswordField2(String value) {
        typeInto(passwordField2, value);
    }

    public void clickAuthenticationButton2() {
        clickOn(authenticationButton2);
    }

    public void setAuthenticationCaptchaField(String value){typeInto(authenticationCaptchaField,value);}

    public void setAuthenticationCaptchaField2(String value){typeInto(authenticationCaptchaField2,value);}











}

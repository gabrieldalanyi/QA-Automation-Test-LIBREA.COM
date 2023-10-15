package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;


@DefaultUrl("https://test.shopoteque.com/")
public class ContactPage extends PageObject {

    @FindBy(css = ".menu-main [data-link=\"/blog\"]")
    private WebElementFacade contactHoverBlogButton;

    @FindBy(css=".menu-level-two [title=\"Contact\"]")
    private WebElementFacade contactClickContactButton;

    @FindBy(css=".col-7 .col-sm-12 [name=\"contact[name]\"]")
    private WebElementFacade contactNameField;

    @FindBy(css=".col-7 .col-sm-12 [name=\"contact[email]\"]")
    private WebElementFacade contactEmailField;

    @FindBy(css=".col-5.col-sm-5 .text-center")
    private WebElementFacade contactCaptchaField;

    @FindBy(css=".input-wrapper.mb-1 .checkmark")
    private WebElementFacade contactIAgreeTermsButton;

    public void clickContactHoverBlogButton(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(contactHoverBlogButton).build().perform();
        clickOn(contactClickContactButton);
    }
    public void setContactNameField(String name){typeInto(contactNameField,name);}

    public void setContactEmailField(String email){typeInto(contactEmailField,email);}

    public void setContactCaptchaField(String captcha){typeInto(contactCaptchaField,captcha);}

    public void clickContactIAgreeTermsButton() {
        clickOn(contactIAgreeTermsButton);
    }


}

package steps;

import net.thucydides.core.annotations.Step;

public class ContactSteps extends BaseSteps{

    @Step
    public void contactHoverBlogButton(){
        contactPage.clickContactHoverBlogButton();
    }
    @Step
    public void contactNameField(){
        contactPage.setContactNameField("Maria Branzas");
    }

    @Step
    public void contactEmailField(){
        contactPage.setContactEmailField("minebostudio@gmail.com");
    }

    @Step
    public void contactCaptchaField(){
        contactPage.setContactCaptchaField("CBA321");
    }

    @Step
    public  void contactIAgreeTermsButton(){
        contactPage.clickContactIAgreeTermsButton();
    }
}

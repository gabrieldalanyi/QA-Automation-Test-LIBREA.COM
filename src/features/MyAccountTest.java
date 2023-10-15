package features;

import org.junit.Test;
import utils.Constans;

public class MyAccountTest extends BaseTest{
    @Test
    public void myAccountDashboard() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        myaccountSteps.myAccountDropDownList();
        myaccountSteps.waitABit(1000);
        myaccountSteps.myAccountAddressField();
        myaccountSteps.updateButton();
        myaccountSteps.scrollUpButton();
        myaccountSteps.waitABit(1000);
        loginSteps.loginButton();
        myaccountSteps.myMessageDropDownList();
        myaccountSteps.inboxMessageField();
        myaccountSteps.waitABit(1000);
        myaccountSteps.fileUploadModule();
        myaccountSteps.waitABit(2000);
        myaccountSteps.inboxSubmitButton();
        myaccountSteps.waitABit(1000);
        myaccountSteps.scrollUpButton2();
        loginSteps.loginButton();
        myaccountSteps.myOrderDropDownList();
        myaccountSteps.myOrdersList();
        myaccountSteps.checkOrderStatus();
        loginSteps.loginButton();
        myaccountSteps.myReviewDropDownList();
        myaccountSteps.scrollDownButton();
        myaccountSteps.scrollUpButton();
        myaccountSteps.waitABit(1000);
    }

    @Test
    public void checkInvoiceFromMyOrders(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        myaccountSteps.myOrderDropDownList();
        myaccountSteps.myOrdersList();
        myaccountSteps.verifyInvoiceCustomerBilling();
        myaccountSteps.verifyInvoiceCustomerDelivery();

    }

    @Test
    public void checkInvoiceDetailsWithOutShipping(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        productSteps.clickShopButton();
        productSteps.product1();
        productSteps.quantityIncreaseButton();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.productViewCartButton();
        productSteps.productCompleteTheOrderButton();
        productSteps.paymentOrderButton();
        productSteps.iAgreeTermsAndConditionButton();
        productSteps.sendTheOrderButton();
        myaccountSteps.waitABit(4000);
        loginSteps.loginButton();
        myaccountSteps.myOrderDropDownList();
        myaccountSteps.myOrdersList();
        myaccountSteps.verifyInvoiceDetailsWithOutShipping();

    }

    @Test
    public void checkInvoiceDetailsWithShipping(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        productSteps.clickShopButton();
        productSteps.product1();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.productViewCartButton();
        productSteps.productCompleteTheOrderButton();
        productSteps.paymentOrderButton();
        productSteps.iAgreeTermsAndConditionButton();
        productSteps.sendTheOrderButton();
        myaccountSteps.waitABit(3000);
        loginSteps.loginButton();
        myaccountSteps.myOrderDropDownList();
        myaccountSteps.myOrdersList();
        myaccountSteps.verifyInvoiceDetailsWithShipping();
    }


}

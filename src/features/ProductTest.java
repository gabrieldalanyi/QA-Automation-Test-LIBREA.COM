package features;

import org.junit.Test;
import utils.Constans;

public class ProductTest extends BaseTest {

    @Test
    public void addProductToCartLoggedIn(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.loginButton();
        productSteps.clickShopButton();
        productSteps.product1();
        productSteps.productAddToWishList();
        productSteps.clickShopButton();
        productSteps.product2();
        productSteps.productAddToWishList();
        productSteps.productAddToCartButton();
        productSteps.clickShopPage2Button();
        productSteps.product3();
        productSteps.clickShopButton();
        productSteps.product4();
        productSteps.productAddToWishList();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.waitABit(1000);
        productSteps.productViewCartButton();
        productSteps.waitABit(1000);
        productSteps.productCompleteTheOrderButton();
        productSteps.waitABit(3000);

    }
    @Test
    public void checkoutCartCalculateWithShippingLoggedIn() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.loginButton();
        productSteps.productCartButton();
        productSteps.cartButtonFinalizeStep();
        productSteps.waitABit(1000);
        productSteps.checkoutCartCalculateWithShipping();
        productSteps.checkTotalPriceWithShipping();

    }
    @Test
    public void checkoutCartCalculateWithInternationalShippingLoggedIn() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.loginButton();
        productSteps.productCartButton();
        productSteps.cartButtonFinalizeStep();
        productSteps.internationalShippingCheckboxButton();
        productSteps.waitABit(1000);
        productSteps.checkoutCartCalculateWithShipping();


    }
    @Test
    public void checkoutCartCalculateWithoutShippingLoggedIn() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.loginButton();
        productSteps.clickShopButton();
        productSteps.checkProductPageVerifyMessage();
        productSteps.product1();
        productSteps.productAddToCartButton();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.cartButtonFinalizeStep();
        productSteps.checkoutCartCalculateWithoutShipping();
    }
    @Test
    public void addProductAndCheckOutUserLoggedIn(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.loginButton();
        productSteps.clickShopButton();
        productSteps.checkProductPageVerifyMessage();
        productSteps.product1();
        productSteps.clickShopButton();
        productSteps.product2();
        productSteps.productAddToCartButton();
        productSteps.clickShopPage2Button();
        productSteps.product3();
        productSteps.clickShopButton();
        productSteps.product4();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.waitABit(1000);
        productSteps.productViewCartButton();
        productSteps.waitABit(1000);
        productSteps.productCompleteTheOrderButton();
        productSteps.waitABit(3000);
        productSteps.paymentOrderButton();
        productSteps.iAgreeTermsAndConditionButton();
        productSteps.sendTheOrderButton();
        productSteps.waitABit(3000);
        productSteps.checkSuccessOrderMessage();
        productSteps.waitABit(3000);

    }
    @Test
    public void removeProductFromCart(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.loginButton();
        productSteps.clickShopButton();
        productSteps.checkProductPageVerifyMessage();
        productSteps.product1();
        productSteps.productAddToCartButton();
        productSteps.clickShopButton();
        productSteps.product2();
        productSteps.productAddToCartButton();
        productSteps.clickShopButton();
        productSteps.product4();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.waitABit(1000);
        productSteps.productViewCartButton();
        productSteps.waitABit(1000);
        productSteps.removeProductButton1();
        productSteps.removeProductButton1();
        productSteps.removeProductButton1();
        productSteps.waitABit(2000);
    }
    @Test
    public void addProductWithAllVariations() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        loginSteps.verifyUserIsLoggedIn("");
        loginSteps.loginButton();
        productSteps.clickShopButton();
        productSteps.checkProductPageVerifyMessage();
        productSteps.product1();
        productSteps.productAddToCartButton();
        productSteps.selectProductAttribute1();
        productSteps.quantityIncreaseButton();
        productSteps.productAddToCartButton();
        productSteps.selectProductAttribute2();
        productSteps.quantityIncreaseButton();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.removeProductButtonFromCartIcon();
        productSteps.removeProductButtonFromCartIcon();
        productSteps.removeProductButtonFromCartIcon();
    }
 @Test
    public void addProductToCartBeforeLoggInAndCheckOut(){
     loginSteps.cookieAcceptButton();
     productSteps.clickShopButton();
     productSteps.checkProductPageVerifyMessage();
     productSteps.product1();
     productSteps.productAddToCartButton();
     productSteps.clickShopButton();
     productSteps.product5();
     productSteps.selectProductAttribute3();
     productSteps.quantityIncreaseButton();
     productSteps.productAddToCartButton();
     loginSteps.loginButton();
     loginSteps.setUserEmail(Constans.USER_EMAIl);
     loginSteps.setPassword(Constans.USER_PASS);
     loginSteps.authenticationCaptchaField2("abc123");
     loginSteps.authenticationButton();
     loginSteps.loginButton();
     productSteps.productCartButton();
     productSteps.productViewCartButton();
     productSteps.productCompleteTheOrderButton();
     productSteps.paymentOrderButton();
     productSteps.iAgreeTermsAndConditionButton();
     productSteps.sendTheOrderButton();
     productSteps.waitABit(3000);
     productSteps.checkSuccessOrderMessage();
    }
    @Test
    public void orderProductWithoutLoggIn(){
        loginSteps.cookieAcceptButton();
        productSteps.clickShopButton();
        productSteps.checkProductPageVerifyMessage();
        productSteps.product1();
        productSteps.productAddToCartButton();
        productSteps.clickShopButton();
        productSteps.product5();
        productSteps.selectProductAttribute3();
        productSteps.quantityIncreaseButton();
        productSteps.productAddToCartButton();
        productSteps.clickShopButton();
        productSteps.product2();
        productSteps.productAddToCartButton();
        productSteps.productCartButton();
        productSteps.finalsOrderButton();
        productSteps.waitABit(2000);
        productSteps.firstNameField();
        productSteps.lastNameField();
        productSteps.emailField();
        productSteps.phoneField();
        productSteps.stateField();
        productSteps.cityField();
        productSteps.postalCodeField();
        productSteps.addressField();
        productSteps.paymentOrderButton();
        productSteps.iAgreeTermsAndConditionButton();
        productSteps.iAgreeTermsButton2();
        productSteps.sendTheOrderButton();
        productSteps.waitABit(1000);
        productSteps.checkSuccessOrderMessage();

    }
    @Test
    public void productPreviewVariationsAndAddToWishlist(){
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        headerNavbar1Steps.headerNavbar1Button();
        productSteps.checkPreviewAttribute();
        productSteps.previewAddToWishList();
        productSteps.previewFirstProduct();
        productSteps.previewModalGetAttribute2();
        productSteps.previewAddToCartButton();
        productSteps.selectProductAttribute3();
        productSteps.selectProductAttribute4();
        productSteps.selectProductAttribute5();
        productSteps.previewGetAttribute3();
        productSteps.productAddToCartButton();

    }
    @Test
    public void modalTest()
    {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        loginSteps.loginButton();
        headerNavbar1Steps.headerNavbar1Button();
        productSteps.previewFirstProduct();
        productSteps.waitABit(1000);
        productSteps.previewModalGetAttribute2();
    }

    @Test
    public void reviewProduct() {
        loginSteps.cookieAcceptButton();
        loginSteps.loginButton();
        loginSteps.setUserEmail(Constans.USER_EMAIl);
        loginSteps.setPassword(Constans.USER_PASS);
        loginSteps.authenticationCaptchaField2("abc123");
        loginSteps.authenticationButton();
        productSteps.clickShopButton();
        productSteps.product1();
        productSteps.reviewProductButton();
        productSteps.ratingProduct();
        productSteps.ratingProductTitle();
        productSteps.ratingProductDescription();
        productSteps.waitABit(3000);
        productSteps.sendTheOrderButton();

    }
}




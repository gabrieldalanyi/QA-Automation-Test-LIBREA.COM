package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class ProductSteps extends BaseSteps {

    @Step
    public void checkProductPageVerifyMessage() {assertEquals("Cei mai buni chiloți menstruali - Librea",productPage.getProductPageVerifyMessage());}

    @Step
    public void product1(){
        productPage.clickProduct1();
    }

    @Step
    public void productAddToWishList(){
        productPage.clickProductAddToWishList();
    }

    @Step
    public void product2(){
        productPage.clickProduct2();
    }

    @Step
    public void product3(){
        productPage.clickProduct3();
    }

    @Step
    public void product4(){
        productPage.clickProduct4();
    }

    @Step
    public void product5(){
        productPage.clickProduct5();
    }

    @Step
    public void productAddToCartButton(){
        productPage.clickProductAddToCartButton();
    }

    @Step
    public void productCartButton(){
        productPage.clickProductCartButton();
    }

    @Step
    public void productViewCartButton(){
        productPage.clickProductViewCartButton();
    }

    @Step
    public void productCompleteTheOrderButton(){
        productPage.clickProductCompleteTheOrderButton();
    }

    @Step
    public void checkoutCartCalculateWithShipping()  {
        productPage.checkoutCartCalculateWithShipping();
    }

    @Step
    public void internationalShippingCheckboxButton(){
        productPage.clickInternationalShippingCheckboxButton();
    }

    @Step
    public void checkoutCartCalculateWithoutShipping()  {
        productPage.checkoutCartCalculateWithoutShipping();
    }

    @Step
    public void checkTotalPriceWithShipping(){
        Assert.assertEquals(productPage.checkoutCartCalculateWithShipping(),productPage.getCartTotalValue(),100f);
    }

    @Step
    public void paymentOrderButton(){
        productPage.clickPaymentOrderButton();
    }

    @Step
    public void iAgreeTermsAndConditionButton(){
        productPage.clickIAgreeTermsAndConditionButton();
    }

    @Step
    public void sendTheOrderButton(){
        productPage.clickSendTheOrderButton();
    }

    @Step
    public void checkSuccessOrderMessage(){
        Assert.assertEquals("Comanda a fost trimisă cu succes! Te rugăm să îți verifici căsuța de e-mail :)",productPage.getCheckOrderSuccessMessage());
    }

    @Step
    public void removeProductButton1(){
        productPage.clickRemoveProductButton1();
    }

    @Step
    public void selectProductAttribute1(){productPage.clickSelectProductAttribute1();
    }

    @Step
    public void selectProductAttribute2(){productPage.clickSelectProductAttribute2();
    }

    @Step
    public void quantityIncreaseButton(){productPage.clickQuantityIncreaseButton(3);}

    @Step
    public void removeProductButtonFromCartIcon(){productPage.clickRemoveProductButtonFromCartIcon();}

    @Step
    public void selectProductAttribute3(){productPage.clickSelectProductAttribute3();
    }

    @Step
    public void finalsOrderButton(){productPage.clickFinalsOrderButton();
    }
    @Step
    public void firstNameField(){productPage.setFirstNameField("Maria");}

    @Step
    public void lastNameField(){productPage.setLastNameField("Popescu");}

    @Step
    public void emailField(){productPage.setEmailField("maria.popescu@gmail.com");}

    @Step
    public void phoneField(){productPage.setPhoneField("0755678798");}

    @Step
    public void stateField(){productPage.setStateField("Cluj");}

    @Step
    public void cityField(){productPage.setCityField("Cluj Napoca");}

    @Step
    public void postalCodeField(){productPage.setPostalCodeField("410568");}

    @Step
    public void addressField(){productPage.setAddressField("Str. Iza Nr. 27 BLoc. F12 Scara. E Et. 2 Ap. 92");}

    @Step
    public void iAgreeTermsButton2(){
        productPage.clickIAgreeTermsButton2();
    }

    @Step
    public void previewAddToWishList() {
        productPage.clickPreviewAddToWishList();
    }

    @Step
    public void previewFirstProduct() {productPage.clickPreviewFirstProduct();}
    @Step
    public void previewAddToCartButton(){
        productPage.clickPreviewAddToCartButton();
    }

    @Step
    public void selectProductAttribute4() {productPage.clickSelectProductAttribute4();}

    @Step
    public void selectProductAttribute5(){
        productPage.clickSelectProductAttribute5();
    }

    @Step
    public void checkPreviewAttribute(){Assert.assertEquals( "6",productPage.getPreviewGetAttribute1());}
    @Step
    public void previewModalGetAttribute2(){
        Assert.assertEquals("6",productPage.getPreviewModalGetAttribute2());
    }

    @Step
    public void previewGetAttribute3(){
        Assert.assertEquals("6",productPage.getPreviewGetAttribute3());
    }

    @Step
    public void reviewProductButton(){
        productPage.clickReviewProductButton();
    }

    @Step
    public void ratingProduct(){productPage.clickRatingProduct();}

     @Step
     public void ratingProductTitle(){productPage.setRatingProductTitle("În mod cert o alegere bună!");}

    @Step
    public void ratingProductDescription(){productPage.setRatingProductDescription("Mulțumesc, Librea!! E a doua comandă pe care o fac de la voi și sunt extrem de încântată de produsele voastre.");}

   @Step
    public void clickShopButton(){productPage.clickShopButton();}

    @Step
    public void clickShopPage2Button(){productPage.clickShopPage2Button();}

    @Step
    public void cartButtonFinalizeStep(){productPage.clickCartButtonFinalizeStep();}
    }














package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


@DefaultUrl("https://test.shopoteque.com/")
public class ProductPage extends PageObject {


    @FindBy(css = ".dummy.text--center")
    private WebElementFacade productPageVerifyMessage;

    @FindBy(css = ".row.shop-list .col-4.col-sm-6.col-xs-12:first-child")
    private WebElementFacade product1;

    @FindBy(css = ".button--icon.js-btn-whishlist")
    private WebElementFacade productAddToWishList;

    @FindBy(css = ".row.shop-list .col-4.col-sm-6.col-xs-12:nth-child(2)")
    private WebElementFacade product2;

    @FindBy(css = ".row .col-4.col-sm-6.col-xs-12:last-child")
    private WebElementFacade product3;

    @FindBy(css = ".row.shop-list .col-4.col-sm-6.col-xs-12:nth-child(6)")
    private WebElementFacade product4;

    @FindBy(css = ".row.shop-list .col-4.col-sm-6.col-xs-12:nth-child(14)")
    private WebElementFacade product5;

    @FindBy(css = "a.button.button--primary.js-btn-cart")
    private WebElementFacade productAddToCartButton;

    @FindBy(css = "li #cartDropdown")
    private WebElementFacade productCartButton;

    @FindBy(css = ".button--tertiary.button--fluid")
    private WebElementFacade productViewCartButton;

    @FindBy(css = ".buttons-grid.buttons-260 .button--primary")
    private WebElementFacade productCompleteTheOrderButton;

    @FindBy(css = "#checkout > form > div:nth-child(3) > div > table > tbody > tr:nth-child(4) > td.px-2.py-2.font-bold.text-center")
    private WebElementFacade cartSubtotalValue;

    @FindBy(css = "#checkout > form > div:nth-child(3) > div > table > tbody > tr:nth-child(5) > td.px-2.py-2.font-bold.text-center > span")
    private WebElementFacade cartShippingValue;

    @FindBy(css = "#checkout > form > div:nth-child(3) > div > table > tbody > tr:nth-child(6) > td.px-2.py-2.font-bold.text-center > span")
    private WebElementFacade cartTotalValue;

    @FindBy(css = "#checkout > form > div:nth-child(2) > div > ul > li:nth-child(3) > label > span.custom-type__label")
    private WebElementFacade internationalShippingCheckboxButton;

    @FindBy(css = "#checkout > form > div:nth-child(3) > div > table > tbody > tr:nth-child(5) > td.px-2.py-2.font-bold.text-center > span")
    private WebElementFacade cartSubtotalWithoutShippingValue;

    @FindBy(css = "#checkout > form > div:nth-child(3) > div > table > tbody > tr:nth-child(6) > td.px-2.py-2.font-bold.text-center > span")
    private WebElementFacade cartTotalWithoutShippingValue;

    @FindBy(css = "#checkout > form > div.row.mt-2 > div:nth-child(2) > ul > li:nth-child(3) > div > label > span.custom-type__label")
    private WebElementFacade paymentOrderButton;

    @FindBy(css = ".input-wrapper.pt-1 .checkmark")
    private WebElementFacade iAgreeTermsAndConditionButton;

    @FindBy(css = ".button.button--primary.btn-submit")
    private WebElementFacade sendTheOrderButton;

    @FindBy(css = ".mb-0.text--success")
    private WebElementFacade checkOrderSuccessMessage;

    @FindBy(css = ".button--icon.remove-product.js-cart-remove-item")
    private WebElementFacade removeProductButton1;

    @FindBy(css = "body > main > section.js-product.pt-3 > div > div:nth-child(2) > article > div.row.align-items-center.pb-2 > div.col-6.col-sm-12 > select > option:nth-child(2)")
    private WebElementFacade selectProductAttribute1;

    @FindBy(css = "body > main > section.js-product.pt-3 > div > div:nth-child(2) > article > div.row.align-items-center.pb-2 > div.col-6.col-sm-12 > select > option:nth-child(3)")
    private WebElementFacade selectProductAttribute2;

    @FindBy(css = ".quantity-increase")
    private WebElementFacade quantityIncreaseButton;

    @FindBy(css = ".button--icon.js-cart-remove-item")
    private WebElementFacade removeProductButtonFromCartIcon;

    @FindBy(css = "body > main > section.js-product.pt-3 > div > div:nth-child(2) > article > div.row.align-items-center.pb-2 > div.col-6.col-sm-12 > select > option:nth-child(1)")
    private WebElementFacade selectProductAttribute3;

    @FindBy(css = ".button-group.mt-2 .button--primary.button--fluid")
    private WebElementFacade finalsOrderButton;

    @FindBy(css = ".js-update-person.js-update-account-wrapper [name=\"contact[first_name]\"]")
    private WebElementFacade firstNameField;

    @FindBy(css = ".js-update-person.js-update-account-wrapper [name=\"contact[last_name]\"]")
    private WebElementFacade lastNameField;

    @FindBy(css = ".js-update-person.js-update-account-wrapper [name=\"contact[email]\"]")
    private WebElementFacade emailField;

    @FindBy(css = ".js-update-person.js-update-account-wrapper [name=\"contact[mobile]\"]")
    private WebElementFacade phoneField;

    @FindBy(css = ".js-update-delivery.js-update-account-wrapper [name=\"contact[state]\"]")
    private WebElementFacade stateField;

    @FindBy(css = ".js-update-delivery.js-update-account-wrapper [name=\"contact[suburb]\"]")
    private WebElementFacade cityField;

    @FindBy(css = ".js-update-delivery.js-update-account-wrapper [name=\"contact[postal_code]\"]")
    private WebElementFacade postalCodeField;

    @FindBy(css = ".js-update-delivery.js-update-account-wrapper [name=\"contact[address]\"]")
    private WebElementFacade addressField;

    @FindBy(css = ".custom-type.required span.checkmark")
    private WebElementFacade iAgreeTermsButton2;

    @FindBy(css = ".product-thumbnail .icon-eye")
    private WebElementFacade previewIconEyeButton;

    @FindBy(css = ".product-thumbnail .icon-heart")
    private WebElementFacade previewWishListButton;

    @FindBy(css = ".button.button--primary")
    private WebElementFacade previewAddToCartButton;

    @FindBy(css = "body > main > section.js-product.pt-3 > div > div:nth-child(2) > article > div.row.align-items-center.pb-2 > div.col-6.col-sm-12 > select > option:nth-child(2)")
    private WebElementFacade selectProductAttribute4;

    @FindBy(css = "body > main > section.js-product.pt-3 > div > div:nth-child(2) > article > div:nth-child(7) > div.col-6.col-sm-12 > select > option:nth-child(1)")
    private WebElementFacade selectProductAttribute5;

    @FindBy(css="body > main > section.pt-3 > div > div > article > div.row.shop-list > div:nth-child(1) > div > div.product-thumbnail > ul > li:nth-child(1) > a")
    //a[data-product-id="6"]
    private WebElementFacade previewGetAttribute1;

    @FindBy(css="body > main > section.js-product.pt-3 > div > div:nth-child(2) > article > div.input-wrapper.inputs-group.pt-2 > a.button.button--primary.js-btn-cart")
    private WebElementFacade shopAttribute1;

    @FindBy(css = "a#reviews-tab.nav-link")
    private WebElementFacade reviewProductButton;

    @FindBy(css = "#reviews > form > div.rating-widget > div > label:nth-child(4)")
    private WebElementFacade ratingProduct;

    @FindBy(css = ".input-row input.input--fluid")
    private WebElementFacade ratingProductTitle;

    @FindBy(css = ".input-row textarea.input--fluid")
    private WebElementFacade ratingProductDescription;

    @FindBy(css="#header > div > div > nav > ul > li:nth-child(4) > button")
    private WebElementFacade hoverShopButton;

    @FindBy(css="#header > div > div > nav > ul > li:nth-child(4) > div > ul > li:nth-child(1) > a")
    private WebElementFacade clickShopButton;

    @FindBy(css="body > main > section.pt-3 > div > div > article > ul > li:nth-child(2) > a")
    private WebElementFacade clickShopPage2Button;

    @FindBy(css=".button--primary.button--fluid")
    private WebElementFacade cartButtonFinalizeStep;






    public String getProductPageVerifyMessage() {
        return productPageVerifyMessage.getText();
    }

    public void clickProduct1() {
        clickOn(product1);
    }

    public void clickProductAddToWishList() {
        clickOn(productAddToWishList);
    }

    public void clickProduct2() {
        clickOn(product2);
    }

    public void clickProduct3() {
        clickOn(product3);
    }

    public void clickProduct4() {
        clickOn(product4);
    }
    public void clickProduct5() {
        clickOn(product5);
    }

    public void clickProductAddToCartButton() {
        clickOn(productAddToCartButton);
    }

    public void clickProductCartButton() {
        clickOn(productCartButton);
    }

    public void clickProductViewCartButton() {
        clickOn(productViewCartButton);
    }

    public void clickProductCompleteTheOrderButton() {
        clickOn(productCompleteTheOrderButton);
    }

    public float getCartTotalValue() {
        String cartTotal = cartTotalValue.getText();
        float cartTotalFloat = Float.parseFloat(cartTotal);
        return cartTotalFloat / 100f;
    }

    public float checkoutCartCalculateWithShipping() {

        String CartSubtotalValue = cartSubtotalValue.getText().trim();
        int IntCartSubtotalValue = Integer.parseInt(CartSubtotalValue.replaceAll("\\D+", ""));
        float floatCartSubtotalValue = IntCartSubtotalValue / 100f;
        System.out.println("Subtotal Value: " + floatCartSubtotalValue);

        String CartShippingValue = cartShippingValue.getText().trim();
        int IntCartShippingValue = Integer.parseInt(CartShippingValue.replaceAll("\\D+", ""));
        float floatCartShippingValue = IntCartShippingValue / 100f;
        System.out.println("Shipping Value: " + floatCartShippingValue);

        String CartTotalValue = cartTotalValue.getText().trim();
        int IntCartTotalValue = Integer.parseInt(CartTotalValue.replaceAll("\\D+", ""));
        float floatCartTotalValue = IntCartTotalValue / 100f;
        System.out.println("Total Value: " + floatCartTotalValue);

        float calculatedPriceWithShipping = floatCartShippingValue + floatCartSubtotalValue;
        float roundedCalculatedPriceWithShipping = Math.round(calculatedPriceWithShipping * 100) / 100f;
        System.out.println("Calculated price with shipping: " + roundedCalculatedPriceWithShipping);


        return roundedCalculatedPriceWithShipping;

    }

    public void clickInternationalShippingCheckboxButton() {
        clickOn(internationalShippingCheckboxButton);
    }


    public void checkoutCartCalculateWithoutShipping() {

        String CartSubtotalWithoutShippingValue = cartSubtotalWithoutShippingValue.getText().trim();
        int IntCartSubtotalWithoutShippingValue = Integer.parseInt(CartSubtotalWithoutShippingValue.replaceAll("\\D+", ""));
        float floatCartSubtotalWithoutShippingValue = IntCartSubtotalWithoutShippingValue / 100f;
        System.out.println("Subtotal Without Shipping Value: " + floatCartSubtotalWithoutShippingValue);


        String CartTotalWithoutShippingValue = cartTotalWithoutShippingValue.getText().trim();
        int IntCartTotalWithoutShippingValue = Integer.parseInt(CartTotalWithoutShippingValue.replaceAll("\\D+", ""));
        float floatCartTotalWithoutShippingValue = IntCartTotalWithoutShippingValue / 100f;
        System.out.println("Total Without Shipping Value: " + floatCartTotalWithoutShippingValue);


    }

    public void clickPaymentOrderButton() {
        clickOn(paymentOrderButton);
    }

    public void clickIAgreeTermsAndConditionButton() {
        clickOn(iAgreeTermsAndConditionButton);
    }

    public void clickSendTheOrderButton() {
        clickOn(sendTheOrderButton);
    }

    public String getCheckOrderSuccessMessage() {
        return checkOrderSuccessMessage.getText();
    }

    public void clickRemoveProductButton1() {
        clickOn(removeProductButton1);
    }

    public void clickSelectProductAttribute1() {
        clickOn(selectProductAttribute1);
    }

    public void clickSelectProductAttribute2() {
        clickOn(selectProductAttribute2);
    }

    public void clickQuantityIncreaseButton(int remainingClicks) {
        if (remainingClicks > 0) {
            clickOn(quantityIncreaseButton);
            clickQuantityIncreaseButton(remainingClicks - 1);
        }
    }

    public void clickRemoveProductButtonFromCartIcon() {
        clickOn(removeProductButtonFromCartIcon);
    }

    public void clickSelectProductAttribute3() {
        clickOn(selectProductAttribute3);
    }

    public void clickFinalsOrderButton() {
        clickOn(finalsOrderButton);
    }

    public void setFirstNameField(String value) {
        typeInto(firstNameField, value);
    }

    public void setLastNameField(String value) {
        typeInto(lastNameField, value);
    }

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPhoneField(String value) {
        typeInto(phoneField, value);
    }

    public void setStateField(String value) {
        typeInto(stateField, value);
    }

    public void setCityField(String value) {
        typeInto(cityField, value);
    }

    public void setPostalCodeField(String value) {
        typeInto(postalCodeField, value);
    }

    public void setAddressField(String value) {
        typeInto(addressField, value);
    }

    public void clickIAgreeTermsButton2() {
        clickOn(iAgreeTermsButton2);
    }

    public void clickPreviewAddToWishList() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(product1).build().perform();
        clickOn(previewWishListButton);
    }


    public void clickPreviewFirstProduct() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(product1).build().perform();
        clickOn(previewIconEyeButton);
    }

    public void clickPreviewAddToCartButton() {
        clickOn(previewAddToCartButton);
    }

    public void clickSelectProductAttribute4() {
        clickOn(selectProductAttribute4);
    }

    public void clickSelectProductAttribute5() {
        clickOn(selectProductAttribute5);
    }


    public String getPreviewGetAttribute1() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(product1).build().perform();
        String productId1 = previewGetAttribute1.getAttribute("data-product-id");
        System.out.println("productId1: " + productId1);
        return productId1;
    }
    public String getPreviewModalGetAttribute2() {
        JavascriptExecutor previewModalGetAttribute2 = (JavascriptExecutor) getDriver();
        String productId2 = (String) previewModalGetAttribute2.executeScript("return document.querySelector('input[name=\"product_id\"]').value;");
        System.out.println("productId2: "+productId2);
        return productId2;
    }
    public String getPreviewGetAttribute3() {
        String productId3=shopAttribute1.getAttribute("data-product-id");
        System.out.println("productId3: " + productId3);
        return productId3;

        }

    public void clickReviewProductButton() {
        clickOn(reviewProductButton);
    }

    public void clickRatingProduct() {
        clickOn(ratingProduct);
    }

    public void setRatingProductTitle(String text) {
        typeInto(ratingProductTitle, text);
    }

    public void setRatingProductDescription(String text){typeInto(ratingProductDescription,text);}

    public void clickShopButton() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(hoverShopButton).build().perform();
        clickOn(clickShopButton);


    }

    public void clickShopPage2Button() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(hoverShopButton).build().perform();
        clickOn(clickShopButton);
        clickOn(clickShopPage2Button);
    }

    public void clickCartButtonFinalizeStep(){
        clickOn(cartButtonFinalizeStep);
    }
}






















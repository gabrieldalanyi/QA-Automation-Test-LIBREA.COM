package steps;

import net.thucydides.core.annotations.Step;

public class MyAccountSteps extends BaseSteps{

    @Step
    public void checkOrderStatus(){
        myaccountPage.getOrderStatus();}

    @Step
    public void myAccountAddressField(){
        myaccountPage.setMyAccountAddressField("Str. Iza Nr. 27 BLoc. F12 Scara. E Et. 2 Ap. 929");
    }
    @Step
    public void updateButton(){
        myaccountPage.clickUpdateButton();
    }
    @Step
    public void scrollUpButton(){
        myaccountPage.clickScrollUpButton();
    }

    @Step
    public void scrollUpButton2(){
        myaccountPage.clickScrollUpButton2();
    }

    @Step
    public void scrollDownButton(){
        myaccountPage.clickScrollDownButton();
    }
    @Step
    public void inboxMessageField(){
        myaccountPage.setInboxMessageField("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ");}
    @Step
    public void fileUploadModule() {myaccountPage.fileUploadModule();}
    @Step
    public void inboxSubmitButton() {
        myaccountPage.clickInboxSubmitButton();
    }

    @Step
    public void myAccountDropDownList(){myaccountPage.clickMyAccountDropDownList();}

    @Step
    public void myMessageDropDownList(){myaccountPage.clickMyMessageDropDownList();}

    @Step
    public void myOrderDropDownList(){myaccountPage.clickMyOrderDropDownList();}

    @Step
    public void myOrdersList(){myaccountPage.clickMyOrdersList();}

    @Step
    public void myReviewDropDownList(){myaccountPage.clickMyReviewDropDownList();}

    @Step
    public void verifyInvoiceCustomerBilling(){myaccountPage.getInvoiceCustomerBilling();}

    @Step
    public void verifyInvoiceCustomerDelivery(){myaccountPage.getInvoiceCustomerDelivery();}

    @Step
    public void verifyInvoiceDetailsWithOutShipping(){myaccountPage.getInvoiceDetailsWithOutShipping();}

    @Step
    public void verifyInvoiceDetailsWithShipping(){myaccountPage.getInvoiceDetailsWithShipping();}









}

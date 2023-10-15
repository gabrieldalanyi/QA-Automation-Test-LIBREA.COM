package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;



@DefaultUrl("https://test.shopoteque.com/")
public class MyAccountPage extends PageObject {

    @FindBy(css=".col-10.col-sm-12 h2.font-bold")
    private WebElementFacade orderStatus;

    @FindBy(css=".input-row [name=\"contact[address]\"]")
    private WebElementFacade myAccountAddressField;

    @FindBy(css="#delivery > div:nth-child(9) > div > button")
    private WebElementFacade updateButton;

    @FindBy(css=".icon-chevron-up")
    private WebElementFacade scrollUpButton;

    @FindBy(css=".breadcrumbs")
    private WebElementFacade scrollUpButton2;

    @FindBy(css=".list.d-flex")
    private WebElementFacade scrollDownButton;

    @FindBy(css = ".textarea.input--fluid ")
    private WebElementFacade inboxMessageField;

    @FindBy(id = "file")
    private WebElementFacade fileInput;

    @FindBy(css = ".button.button--primary.js-send")
    private WebElementFacade inboxSubmitButton;

    @FindBy(css = ".dropdown-wrapper .d-block.py-1:nth-child(4)")
    private WebElementFacade myAccountDropDownList;

    @FindBy(css = ".dropdown-wrapper .d-block.py-1:nth-child(5)")
    private WebElementFacade myMessageDropDownList;

    @FindBy(css = ".dropdown-wrapper .d-block.py-1:nth-child(6)")
    private WebElementFacade myOrderDropDownList;

    @FindBy(css="body > main > section.account.pt-3 > div > div > article > div > div > table > tbody > tr:nth-child(2) > td.font-bold.px-2.py-2.text-center")
    private WebElementFacade myOrdersList;

    @FindBy(css = ".dropdown-wrapper .d-block.py-1:nth-child(7)")
    private WebElementFacade myReviewDropDownList;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-5 > div:nth-child(2) > h3")
    private WebElementFacade customerBillingName;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-5 > div:nth-child(2) > p:nth-child(3)")
    private WebElementFacade customerBillingEmailAddress;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-5 > div:nth-child(2) > p:nth-child(4)")
    private WebElementFacade customerBillingMobileNumber;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-5 > div:nth-child(2) > p.mb-0")
    private WebElementFacade customerBillingAddress;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div:nth-child(3) > div.col-12.col-sm-12.mt-3 > p:nth-child(2)")
    private WebElementFacade customerDeliveryName;


    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div:nth-child(3) > div.col-12.col-sm-12.mt-3 > p:nth-child(3)")
    private WebElementFacade customerDeliveryEmailAddress;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div:nth-child(3) > div.col-12.col-sm-12.mt-3 > p:nth-child(4)")
    private WebElementFacade customerDeliveryMobileNumber;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div:nth-child(3) > div.col-12.col-sm-12.mt-3 > p:nth-child(5)")
    private WebElementFacade customerDeliveryAddress;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-3 > div:nth-child(2) > h2")
    private WebElementFacade orderOfNumber;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-3 > div:nth-child(2) > p:nth-child(2)")
    private WebElementFacade orderOfData;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-3 > div:nth-child(2) > p:nth-child(3)")
    private WebElementFacade orderOfStatus;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div.row.mb-3 > div:nth-child(2) > div")
    private WebElementFacade orderOfHeaderTotalPrice;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div:nth-child(3) > div:nth-child(1) > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    private WebElementFacade orderOfShippingPrice;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div:nth-child(3) > div:nth-child(1) > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    private WebElementFacade orderOfFooterTotalPrice;

    @FindBy(css = "body > main > section.account.pt-3 > div > div > article > div:nth-child(3) > div:nth-child(1) > table > tbody > tr:nth-child(5) > td:nth-child(2)")
    private WebElementFacade orderOfFooterTotalPriceWithShipping;



    public String getOrderStatus(){return orderStatus.getText();}
    public void setMyAccountAddressField(String address){typeInto(myAccountAddressField,address);}
    public void clickUpdateButton(){
        clickOn(updateButton);
    }
    public void clickScrollUpButton(){
       clickOn(scrollUpButton);
    }

    public void clickScrollUpButton2(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(scrollUpButton2).build().perform();
        clickOn(scrollUpButton2);
    }
    public void clickScrollDownButton(){
        clickOn(scrollDownButton);
    }
    public void setInboxMessageField(String text){typeInto(inboxMessageField,text);}

    public void fileUploadModule() {
        String filePath = "C:\\like.jpg";
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("arguments[0].style.display='block';", fileInput);
        fileInput.sendKeys(filePath);
    }
    public void clickInboxSubmitButton(){
        clickOn(inboxSubmitButton);
    }

    public void clickMyAccountDropDownList(){clickOn(myAccountDropDownList);}

    public void clickMyMessageDropDownList(){clickOn(myMessageDropDownList);}

    public void clickMyOrderDropDownList(){clickOn(myOrderDropDownList);}

    public void clickMyOrdersList(){clickOn(myOrdersList);}

    public void clickMyReviewDropDownList(){clickOn(myReviewDropDownList);}

    public String getInvoiceCustomerBilling(){
        String billingName = customerBillingName.getText().trim();
        String emailBillingAddress = customerBillingEmailAddress.getText().replaceAll("E-mail:","").trim();
        String billingMobileNumber = customerBillingMobileNumber.getText().replaceAll("Mobile:","").trim();
        String billingAddress = customerBillingAddress.getText().trim();
        System.out.println("Billing Name :" + billingName + "\nBilling E-mail :" + emailBillingAddress + "\nBilling Mobile :" + billingMobileNumber +
                "\nBilling Address :" +billingAddress + "\n");
        return billingName + emailBillingAddress + billingMobileNumber + billingAddress;}

    public String getInvoiceCustomerDelivery(){
        String deliveryName = customerDeliveryName.getText().trim();
        String deliveryEmailAddress = customerDeliveryEmailAddress.getText().replaceAll("E-mail:","").trim();
        String deliveryMobileNumber = customerDeliveryMobileNumber.getText().replaceAll("Mobile:","").trim();
        String deliveryAddress = customerDeliveryAddress.getText().trim();
        System.out.println("Delivery Name :" + deliveryName + "\nDelivery E-mail :" + deliveryEmailAddress + "\nDelivery Mobile :" + deliveryMobileNumber +
                "\nDelivery Address : " + deliveryAddress);
        return deliveryName + deliveryEmailAddress + deliveryMobileNumber + deliveryAddress;

    }
    public String getInvoiceDetailsWithOutShipping(){

       String invoiceNumber=orderOfNumber.getText().trim();
       String invoiceData=orderOfData.getText().trim();
       String invoiceStatus=orderOfStatus.getText().trim();
       String invoiceHeaderTotalPrice=orderOfHeaderTotalPrice.getText().trim();
       String invoiceFooterTotalPrice=orderOfFooterTotalPrice.getText().trim();


       System.out.println("Order Number : " + invoiceNumber + "\nOrder Data :" + invoiceData + "\nOrder Status :" + invoiceStatus +
                "\nHEADER Order Total Price :" + invoiceHeaderTotalPrice + "\n\nFOOTER Order Total Price :" + invoiceFooterTotalPrice);

       return invoiceNumber + invoiceData + invoiceStatus + invoiceHeaderTotalPrice + invoiceFooterTotalPrice;


    }

    public String getInvoiceDetailsWithShipping(){

        String invoiceNumber=orderOfNumber.getText().trim();
        String invoiceData=orderOfData.getText().trim();
        String invoiceStatus=orderOfStatus.getText().trim();
        String invoiceHeaderTotalPrice=orderOfHeaderTotalPrice.getText().trim();
        String invoiceFooterTotalPriceWithShipping=orderOfFooterTotalPriceWithShipping.getText().trim();
        String invoiceFooterShippingPrice=orderOfShippingPrice.getText().trim();

        System.out.println("Order Number : " + invoiceNumber + "\nOrder Data :" + invoiceData + "\nOrder Status :" + invoiceStatus +
                "\nHEADER Order Total Price :" + invoiceHeaderTotalPrice +"\n\nOrder Shipping Price :"+ invoiceFooterShippingPrice +"\n\nFOOTER Order Total Price :" + invoiceFooterTotalPriceWithShipping);

        return invoiceNumber + invoiceData + invoiceStatus + invoiceHeaderTotalPrice + invoiceFooterShippingPrice + invoiceFooterTotalPriceWithShipping;


    }

}

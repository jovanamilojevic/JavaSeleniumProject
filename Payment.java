package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

    private WebDriver driver;



    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsService;
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")
    WebElement logIn;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]")
    WebElement billingAddress;
    @FindBy(xpath = "//input[@id='PickUpInStore']")
    WebElement pickUpinStore;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]")
    WebElement shippingAddressContinue;
    @FindBy(xpath = "//input[@id='paymentmethod_0']")
    WebElement payment;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]")
    WebElement paymentContinue;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/input[1]")
    WebElement paymentInfContinue;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/input[1]")
    WebElement confirmOrder;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]")
    WebElement confirm;
    @FindBy(xpath = "//a[contains(text(),'Click here for order details.')]")
    WebElement details;
    @FindBy(xpath = "//td[@class='a-left name']")
    WebElement selectionProducts;


    public Payment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void radioAgreeTermsService() {
        termsService.click();
    }

    public void clickCheckout() {
        checkout.click();
    }

    public void enterEmail(String Email) {
        email.sendKeys(Email);
    }

    public void enterPassword(String Password) {
        password.sendKeys(Password);
    }

    public void clickLogIn() {
        logIn.click();
    }
    public void clickBillingAddressContinue(){
        billingAddress.click();
    }
    public  void clickShippingAddressPickUpInput(){
        pickUpinStore.click();
    }
    public  void clickShippingAddressContinue(){
        shippingAddressContinue.click();
    }
    public  void clickRadioPayment(){
        payment.click();
    }
    public  void clickPaymentContinue(){
        paymentContinue.click();
    }
    public void clickPaymentInfContinue(){
        paymentInfContinue.click();
    }
    public void clickConfirmOrder(){
        confirmOrder.click();
    }
    public void clickConfirm(){
        confirm.click();
    }

    public void clickDetails(){
        details.click();
    }
    public String getOrderedProductName(){
        return selectionProducts.getText();
    }




}

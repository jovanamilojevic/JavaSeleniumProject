package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerButton;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement inputGender;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement inputFirstName;
   @FindBy(xpath = "//input[@id='LastName']")
   WebElement inputLastName;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement inputPassword;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement inputConfirmPassword;
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement inputRegister;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement message;

    public Register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
    public  void clickInputGender(){
        inputGender.click();
    }
    public  void enterFirstName(String FirstName){
        inputFirstName.sendKeys(FirstName);
    }
    public void enterLastName(String LastName){
        inputLastName.sendKeys(LastName);
    }
    public void enterEmail(String Email){
        inputEmail.sendKeys(Email);
    }
    public void enterPassword(String Password){
        inputPassword.sendKeys(Password);
    }
    public void enterConfirmPassword(String Password){
        inputConfirmPassword.sendKeys(Password);
    }
    public void clickRegister(){
        inputRegister.click();
    }
    public String Verify(){
        return message.getText();
    }
}

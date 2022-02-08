package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
    private WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement logInButton;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement inputEmail;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement inputPssword;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")
    WebElement inputLogIn;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;
    @FindBy(xpath = "//span[contains(text(),'Please enter a valid email address.')]")
    WebElement message;


    public LogIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogInButton(){
        logInButton.click();
    }
    public void enterEmail(String Email){
        inputEmail.sendKeys(Email);
    }
    public void enterPassword(String Password){
        inputPssword.sendKeys(Password);
    }
    public void clickSubmit(){
        inputLogIn.click();
    }
    public String logOut(){
        return logOutButton.getText();
    }
    public String invalidEmail(){
        return message.getText();
    }
}

package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
    private WebDriver driver;




    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;
    @FindBy(xpath = "//select[@id='CountryId']")
    WebElement country;
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement agree;
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;


    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickShoopingCart() {
        shoppingCart.click();
    }

    public void clickOnStateDropdown() {
        country.click();
    }

    public void radioAgree() {
        agree.click();
    }

    public void clickCheckout() {
        checkout.click();
    }




}

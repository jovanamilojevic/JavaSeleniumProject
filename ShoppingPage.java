package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
    private WebDriver driver;


    @FindBy(xpath = "//body/div[4]/div[1]/div[2]/ul[1]/li[2]/a[1]")
    WebElement computers;
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]")
    WebElement notebooks;
    @FindBy(xpath = "//input[@value='Add to cart']")
    WebElement addToCart;
    @FindBy(xpath = "//h2[@class='product-title']")
    WebElement productTitle;


    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickComputers() {
        computers.click();
    }

    public void clickNotebooks() {
        notebooks.click();
    }

    public void clickAddToCrt() {
        addToCart.click();
    }

    public String getProductTitle() {
        return productTitle.getText();
    }





}

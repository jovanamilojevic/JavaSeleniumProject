package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.time.Duration;

public class TestShoppingCart {

    private WebDriver wd;

    @BeforeClass
    public void init() throws IOException {

        TestShoppingPage computers = new TestShoppingPage();

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\neman\\Downloads\\chromedriver_win32\\chromedriver.exe");

        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));


    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Ovo ce se izvristi pre metode");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("ove ce se izvrsite pre suita");
    }

    @AfterClass
    public void zatvoriWebDriver() {
        //   wd.close();
    }

    @org.testng.annotations.Test
    public void AddCart() throws IOException, InterruptedException {
        System.out.println("Go to http://demowebshop.tricentis.com/");
        wd.get("http://demowebshop.tricentis.com/");
        wd.manage().window().maximize();

        Assert.assertEquals(wd.getCurrentUrl(), "http://demowebshop.tricentis.com/",
                "The current url should be equal to http://demowebshop.tricentis.com/");

        ShoppingCarts shoppingCart = new ShoppingCarts(wd);

        shoppingCart.buttonBooks();
        shoppingCart.addToCartButton();
        shoppingCart.clickJewelry();
        shoppingCart.clickDimaoundHeart();
        shoppingCart.clickShoppingCartButton();
        shoppingCart.clickRemoveInput();
        shoppingCart.clickRemoveInput2();

    }

}

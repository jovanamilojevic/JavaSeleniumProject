package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class TestLogIn {
    private WebDriver wd;

    @BeforeClass
    public void init() throws IOException {
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
         wd.close();
    }

    @org.testng.annotations.Test
    public void LogInHappyPath() throws IOException {
        System.out.println("Go to http://demowebshop.tricentis.com/login");
        wd.get("http://demowebshop.tricentis.com/login");
        wd.manage().window().maximize();

        Assert.assertEquals(wd.getCurrentUrl(), "http://demowebshop.tricentis.com/login",
                "The current url should be equal to http://demowebshop.tricentis.com/login");

        LogIn logInPage = new LogIn(wd);
        logInPage.clickLogInButton();
        logInPage.enterEmail("Jovana2@gmail.com");
        logInPage.enterPassword("Test@12345");
        logInPage.clickSubmit();
        Assert.assertEquals(logInPage.logOut(),"Log out","Successful registration");

    }

    @org.testng.annotations.Test
    public void LogInInvalidEmail() throws IOException, InterruptedException {
        System.out.println("Go to http://demowebshop.tricentis.com/");
        wd.get("http://demowebshop.tricentis.com/");
        wd.manage().window().maximize();

        Assert.assertEquals(wd.getCurrentUrl(), "http://demowebshop.tricentis.com/",
                "The current url should be equal to http://demowebshop.tricentis.com/");

      LogIn logInPage = new LogIn(wd);
      logInPage.clickLogInButton();
      logInPage.enterEmail("234");
      logInPage.enterPassword("Test2");
      Thread.sleep(2000);
      logInPage.clickSubmit();
      Assert.assertEquals(logInPage.invalidEmail(),"Please enter a valid email address.","Please enter a valid email address.");

    }
}

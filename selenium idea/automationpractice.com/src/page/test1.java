package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

public class test1 {
    public String baseUrl = "http://automationpractice.com/";
    public WebDriver driver;
    public home_page home;
    public signin_page signin;

    @BeforeMethod
    public void set() {
        System.out.println("launching chrome browser");
        load.chrome();
        driver = new ChromeDriver();
        home = new home_page(driver);
        signin = new signin_page(driver);
        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void homepage() {
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"My Store");
    }

    @Test(priority = 2,dependsOnMethods = {"homepage"})
    public void test_signin() {
        home.signinlink().click();
        System.out.println(driver.getTitle());
    }

    @Test(priority = 3, dependsOnMethods = {"homepage"})
    public void test_search() {
        home.searchbox().sendKeys("dress", Keys.ENTER);
        System.out.println(driver.getTitle());
    }
    @Test(priority = 4,dependsOnMethods = {"test_signin"})
    public void createacc() throws InterruptedException {
        home.signinlink().click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(signin);
        signin.create_email().sendKeys("456@dfg.com");
        signin.create_acc().click();
        Thread.sleep(2000);
        String st="http://automationpractice.com/index.php?controller=authentication&back=my-account";
        String st1="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
        if (st.equals(driver.getCurrentUrl())){
            System.out.println("invalid email");
        }if(st1.equals(driver.getCurrentUrl())){
            System.out.println("enter your data");
        }else {
            Assert.fail("test fail");
        }
        }

    @AfterMethod
    public void terminateBrowser() {
        driver.close();
    }
}

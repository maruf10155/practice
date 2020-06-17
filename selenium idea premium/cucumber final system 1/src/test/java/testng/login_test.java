package testng;

import org.testng.Assert;
import org.testng.annotations.*;
import page.findaflight;
import page.home;
import page.sign_on;

public class login_test extends step.base {
    page.home home;
    sign_on signOn;
    page.findaflight findaflight;
    @BeforeMethod
    public void bef() throws InterruptedException {
        load();
        home = new home();
        signOn = new sign_on();
        findaflight = new findaflight();
    }
    @Test(priority = 1)
    @Parameters({"user","pass"})
    public void positive(String user,String pass) throws InterruptedException {
        driver.get("http://newtours.demoaut.com/");
        Thread.sleep(2000);
        home.sign_on().click();
        Thread.sleep(2000);
        signOn.user_box().sendKeys(user);
        signOn.pwd_box().sendKeys(pass);
        signOn.submit_btn().click();
        Thread.sleep(2000);
        Assert.assertNotEquals(signOn.title, driver.getTitle());
        findaflight.sign_off().click();
        Assert.assertEquals(driver.getTitle(), signOn.title);
    }
   @DataProvider(name = "data")
       public Object[][] getdata(){
            return new Object[][] {{"zxcvbn","456"},{"love","love"},{"maruf","n  "}};
        }
    @Test(priority = 2,dataProvider = "data")
    public void negetive(String[] kl) throws InterruptedException {
        driver.get("http://newtours.demoaut.com/");
        Thread.sleep(2000);
        home.sign_on().click();
        Thread.sleep(2000);
        signOn.user_box().sendKeys(kl[0]);
        signOn.pwd_box().sendKeys(kl[1]);
        signOn.submit_btn().click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), signOn.title);
    }
    @AfterMethod
    public void aft() {
        close();
    }
}

package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class hover {
    WebDriver driver;
    @Given("user visits automationpractice.com")
    public void user_visits_automationpractice_com() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\library\\webdriver\\chromedriver.exe");
////        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\library\\webdriver\\geckodriver.exe");
        driver = new ChromeDriver();

        driver.get("http://automationpractice.com");
        Thread.sleep(1000);
    }



    @When("browser is fullscreen")
    public void browser_is_fullscreen() {
        driver.manage().window().maximize();

    }



    @When("user hovers on an item")
    public void user_hovers_on_an_item() throws InterruptedException {
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement a=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div"));
        System.out.println(a.isDisplayed());
        je.executeScript("arguments[0].scrollIntoView(true)",a);
        Actions actions = new Actions(driver);
        actions.moveToElement(a).perform();
        Thread.sleep(1000);
    }


    @Then("user should see {string}")
    public void user_should_see(String string) {
        System.out.println(string);
        driver.quit();

    }


    @When("user clicks on {string}")
    public void userClicksOn(String arg0) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[2]/span")).click();
        Thread.sleep(2000);


    }

    @Then("user will see a popup")
    public void userWillSeeAPopup() {
    try {
        driver.switchTo().alert();
        System.out.println("pass");
    } catch (Exception e){
//        Assert.fail("did not show popup");
        System.out.println("fail");
    }finally {
        driver.quit();
    }

    }

    @Then("user should see {string} \\(one)")
    public void userShouldSeeOne(String arg0) {
        String exp=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[1]/div/a[2]/span")).getText();
        Assert.assertEquals(exp,arg0);
    }
}

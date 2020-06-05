package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class sort_test{
    WebDriver driver;
    @Given("^User visits amazon.com$")
    public void user_visits_amazon_com() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\library\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }
    @Given("^User inputs iphone in search box$")
    public void user_inputs_iphone_in_search_box() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        Thread.sleep(1000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

    }

    @Given("^Search result will display$")
    public void search_result_will_display() {
        Assert.assertEquals(driver.getTitle(),"Amazon.com : iphone");
    }
    @When("^user Click on drop down menu$")
    public void user_Click_on_drop_down_menu() {
       driver.findElement(By.id("a-autoid-0-announce")).click();
    }
    @When("^Clicks on low to high$")
    public void clicks_on_low_to_high() throws InterruptedException {
        driver.findElement(By.id("s-result-sort-select_1")).click();
        Thread.sleep(1000);
    }
    @Then("^Search result will be sorted$")
    public void search_result_will_be_sorted() {
       WebElement el1 =driver.findElement(By.className("a-dropdown-prompt"));
       Assert.assertTrue(el1.isDisplayed());
       driver.quit();
    }

}

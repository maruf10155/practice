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

public class cart {
    WebDriver driver;
    @Given("User visits amazon.com \\(ver2)")
    public void user_visits_amazon_com_ver2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\library\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }
    @Given("serches phone")
    public void serches_phone() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
        Thread.sleep(1000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
    }

    @Given("click on first search")
    public void click_on_first_search() throws InterruptedException {
        driver.findElement(By.partialLinkText("Panasonic DECT 6.0 Expandable Cordless Phone")).click();
        Thread.sleep(1000);
    }

    @When("user click add to cart")
    public void user_click_add_to_cart() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(1000);
    }

    @Then("a page will appear with showing {string}")
    public void a_page_will_appear_with_showing(String string) throws InterruptedException {
       driver.findElement(By.id("nav-cart")).click();
       Thread.sleep(1000);
        WebElement e=driver.findElement(By.id("sc-subtotal-label-buybox"));
        Assert.assertTrue(e.getText().contains("(1 item)"));
        driver.quit();
    }
}

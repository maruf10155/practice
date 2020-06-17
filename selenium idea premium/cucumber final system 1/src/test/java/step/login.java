package step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.*;

public class login extends base {
    home home;
    sign_on signOn;
    findaflight findaflight;

    @Before
    public void bef() throws InterruptedException {
        load();
        home = new home();
        signOn = new sign_on();
        findaflight = new findaflight();

    }

    @Given("go to website")
    public void go_to_website() throws InterruptedException {
        driver.get("http://newtours.demoaut.com/");
        Thread.sleep(2000);
    }


    @Given("goto login page")
    public void goto_login_page() throws InterruptedException {
        home.sign_on().click();
        Thread.sleep(2000);
    }


    @When("user inputs valid user name {string} and password {string}")
    public void user_inputs_valid_user_name_and_password(String string, String string2) throws InterruptedException {
        signOn.user_box().sendKeys(string);
        signOn.pwd_box().sendKeys(string2);
        signOn.submit_btn().click();
        Thread.sleep(2000);
    }


    @Then("user see find a flight page")
    public void user_see_find_a_flight_page() {
        Assert.assertNotEquals(signOn.title, driver.getTitle());
    }


    @When("user clicks log-off")
    public void user_clicks_log_off() {
        findaflight.sign_off().click();
    }


    @Then("user will log out")
    public void user_will_log_out() {
        Assert.assertEquals(driver.getTitle(), signOn.title);
    }

    @Then("user stays on log on page")
    public void user_stays_on_log_on_page() {
        Assert.assertEquals(driver.getTitle(), signOn.title);
    }

    @After
    public void aft() {
        close();
    }


}


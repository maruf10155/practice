package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
    @Given("^given name is \"([^\"]*)\"$")
    public void given_name_is(String string) {
        System.out.println("name "+string);
    }

    @When("^password is \"([^\"]*)\"$")
    public void password_is(String string) {
        System.out.println("password "+string);
    }

    @Then("^print all$")
    public void print_all() {
        System.out.println("final step");
    }

}

package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class titletest {
    @Given("^user visits google.com$")
    public void user_visits_google_com() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(1);
    }
    @When("^user inputs phone$")
    public void user_inputs_phone() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(2);
    }

    @Then("^search page should appear$")
    public void search_page_should_appear() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(3);
    }

}

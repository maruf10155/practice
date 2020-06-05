package sample1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test1 {
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


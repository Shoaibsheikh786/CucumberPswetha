package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mynewFeatureSteps {

	@Given("user opens firefox")
	public void user_opens_firefox() {

		System.out.println("Firefox Opened");
	}

	@When("user enters to url {string}")
	public void user_enters_to_url(String string) {
		System.out.println("This is the url  " + string);
	}

	@Then("use is redirected to the login page")
	public void use_is_redirected_to_the_login_page() {
		System.out.println("User riderected to login page");
	}

	@When("user enters to this url {string}")
	public void user_enters_to_this_url(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Scenario 2 url " + string);
	}

	@Then("use is redirected to the logout page")
	public void use_is_redirected_to_the_logout_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User riderected to logout page");
	}

	@Then("use is redirected to the abc page")
	public void use_is_redirected_to_the_abc_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user reidrected to some abc page");
	}
	
	@Then("use is redirected to the xyz page")
	public void use_is_redirected_to_the_xyz_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user reidrected to some xyz page");
	}

}

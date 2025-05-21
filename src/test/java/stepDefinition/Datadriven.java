package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datadriven {
	
	@Given("user open edge")
	public void user_open_edge() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Edge browser open");
	}
	@When("user enter this url {string}")
	public void user_enter_this_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User enter url "+string);
	}
	@When("user enter username as {string}")
	public void user_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("user enter username "+string);
	}
	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("user enters password "+string);
	}
	@Then("user will be on login page only")
	public void user_will_be_on_login_page_only() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("user will be on login page");
	 
	 
	 //apache poi --> read 
	}


}

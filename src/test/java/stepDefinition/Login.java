package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;

	@Given("open chrome")
	public void openChrome() {
		driver = new ChromeDriver();
	}

	@When("user enters url {string}")
	public void user_enters_url(String u ) {
		
		driver.get(u);
 	}
	@When("user enters username abc@gmail.com")
	public void user_enters_username_abc_gmail_com() {
		// Write code here that turns the phrase above into concrete actions
   //driver.findElement(By.xpath("").sendKeys(...);
	}

	@When("user enters password abc@aapas")
	public void user_enters_password_abc_aapas() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("user is redirected to logout page")
	public void user_is_redirected_to_logout_page() {
		// Write code here that turns the phrase above into concrete actions
	}

}

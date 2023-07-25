package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Outline {
	@Given("user is on the login screen outline")
	public void user_is_on_the_login_screen_outline() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("GIVEN");
	}
	@When("user provides correct username outline={string}")
	public void user_provides_correct_username_outline(String user) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("USERNAME: "+user);
	}
	@When("user provides correct password outline={string}")
	public void user_provides_correct_password_outline(String pass) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("PASSWORD: "+pass);
	}
	@Then("user must login outline")
	public void user_must_login_outline() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("THEN");
	}

}

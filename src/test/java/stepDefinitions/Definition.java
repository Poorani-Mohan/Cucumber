package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Definition {
	@Given("User is on the login screen")
	public void user_is_on_the_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("**GIVEN**");
	}
	@When("User provides correct username")
	public void user_provides_correct_username(DataTable data) {
	    List<String> table=data.asList();
	    System.out.println(table.get(0));
	}
//	@When("User provides correct password=")
//	public void user_provides_correct_password_pass(DataTable pass) {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("PASSWORD: "+pass);
//	}	@Then("User must login")
//	public void user_must_login() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("**THEN**");	
//	    }
//	@Then("error should not be there")
//	public void error_should_not_be_there() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("**BUT**");	}
}
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundEg {
	@Given("First")
	public void first() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("First");
	}
	@When("Second")
	public void second() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Second");
	}
	@Then("Third")
	public void third() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Third");
	}
	@Given("background given one")
	public void background_given_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("***GIVEN 1***");
	}
	@When("backgorund when one")
	public void backgorund_when_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("***WHEN 1***");
	}
	@Then("background then one")
	public void background_then_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("***THEN 1***");
	}
	@Given("background given two")
	public void background_given_two() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("***GIVEN 2***");
	}
	@When("background when two")
	public void background_when_two() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("***WHEN 2***");
	}
	@Then("background then two")
	public void background_then_two() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("***THEN 2***");
	}
}

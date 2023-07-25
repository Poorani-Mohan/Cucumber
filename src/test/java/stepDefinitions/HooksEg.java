package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksEg {
	@Before("@SmokeTest")
	public void beforeFeature()
	{
		System.out.println("Before each scenario");
	}
	@After("@SmokeTest")
	public void afterFeature()
	{
		System.out.println("After each scenario");
	}
	@Given("example of given one")
	public void example_of_given_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given One Mobile");
	}
	@When("example of when one")
	public void example_of_when_one() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When One Mobile");
	}
	@Then("example of then one")
	public void example_of_then_one() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then One Mobile");
	}
	@Given("example of given two")
	public void example_of_given_two() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given two Website");	
	    }
	@When("example of when two")
	public void example_of_when_two() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When two Website");
	}
	@Then("example of then two")
	public void example_of_then_two() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then two Website");
	}
}

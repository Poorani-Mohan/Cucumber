package stepDefinitions;

import io.cucumber.java.en.*;

public class PaymentDefinition {
	@Given("user already has an account on Gpay")
	public void user_already_has_an_account_on_gpay() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Payment Given");
	}
	@When("userid is correct")
	public void userid_is_correct() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Payment When");
	}
	@Then("Gpay message should be sent")
	public void gpay_message_should_be_sent() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Payment Then");
	}
	@Given("user already has an account on PhonePe")
	public void user_already_has_an_account_on_phone_pe() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("PhonePe Given");
	}
	@Then("PhonePe message should be sent")
	public void phone_pe_message_should_be_sent() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("PhonePe Then");
	}

}

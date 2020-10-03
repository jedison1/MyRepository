package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 {

	@Given("sj")
	public void sj() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("J1");
	}

	@When("sa")
	public void sa() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("J2");
	}

	@Then("sk")
	public void sk() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("J3");
	}
}

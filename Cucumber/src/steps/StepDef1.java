package steps;

import static org.testng.Assert.assertEquals;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.internal.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDef1 {
	Response response;
	RequestSpecification reqSpec;
	
	@Before
	public void setup()
	{
		 
	}
	
	@Given("the endpoint {string}")
	public void getEndpointURL(String arg) {
		response=RestAssured.given().get(arg);
	}

	@When("the body is present")
	public void getBody() {
		
	   System.out.println(response.getBody().asString());
	}

	@Then("verify the status code is {int}")
	public void verifyStatusCode(Integer statusCode) {
	     assertEquals(response.getStatusCode(), statusCode.intValue(), "james");	   
	}
	
	@Given("the endpoint for post is {string}")
	public void getEndpointURLForPost(String arg) {
		reqSpec=RestAssured.given();
		JsonObject json=new JsonObject();
		
	}

	
	@When("the user doing post operation")
	public void postOperation() {
		
	}
	
	
}

package nz.co.zufang.steps;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.google.gson.Gson;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import nz.co.zufang.model.Customer;

public class FeatureDefinitions {
	
	private String endpointUrl;
	private Customer customer;
	private String message;

	@Given("^The Server URL \"([^\"]*)\"$")
	public void The_Server_URL(String url) {
		endpointUrl = url;
	}
	
	@Given("^create a new customer with name \"([^\"]*)\", address \"([^\"]*)\" and phone \"([^\"]*)\"$")
	public void create_a_new_customer_with_name_address_and_phone(String name,String address,String phone){
		customer = new Customer();
		customer.setUsername(name);
		customer.setAddress(address);
		customer.setTelephoneNumber(phone);
	}


	@When("^the client sends the POST request$")
	public void the_client_sends_the_POST_request() {
		Gson gson = new Gson();
		String json = gson.toJson(customer);
		Response response = given()
        .contentType("application/json")
        .body(json)
        .when().post(endpointUrl);
		message = response.getBody().asString();
		
	}
	
	@Then("^the client should receive the following message$")
	public void the_client_should_receive_the_following_message(String featureMsg) {
		Assert.assertEquals(featureMsg,message);
	}	
}

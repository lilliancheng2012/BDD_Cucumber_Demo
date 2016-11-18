package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class UserListDefinitions {

	// List<User> userList;
	Response response;
	String endpoint;

	@Given("^The Server endpoint list users URL \"([^\"]*)\"$")
	public void the_Server_endpoint_list_users_URL(String url) throws Throwable {
		endpoint = url;
	}

	
	@When("^send the GET request$")
	public void SEND_THE_GET_request() throws Throwable {

		response = expect()
				.given()
				.contentType("application/json")
				.get(endpoint);
	}

	
	@Then("^the response status should be \"([^\"]*)\"$")
	public void the_response_status_should_be(String expectedValue) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

}

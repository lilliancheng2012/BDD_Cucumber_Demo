package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

public class InfoListDefinition {

	String endpoint;
	Response response;
	
	@Given("^The Server endpoint list info URL \"([^\"]*)\"$")
	public void the_Server_endpoint_list_info_URL(String url) throws Throwable {
		endpoint = url;		
	}

	@When("^send the GET request for list info$")
	public void send_the_GET_request_for_list_info() throws Throwable {
		response = expect()
				.given()
				.contentType("application/json")
				.get(endpoint);
	}

	@Then("^the response status for list info should be \"([^\"]*)\"$")
	public void the_response_status_for_list_info_should_be(String arg1) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}
	
}

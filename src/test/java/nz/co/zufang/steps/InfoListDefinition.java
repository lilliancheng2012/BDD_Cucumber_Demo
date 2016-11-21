package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

/**
 * The Class InfoListDefinition.
 */
public class InfoListDefinition {

	/** The endpoint. */
	String endpoint;
	
	/** The response. */
	Response response;
	
	/**
	 * The server endpoint list info URL.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^The Server endpoint list info URL \"([^\"]*)\"$")
	public void the_Server_endpoint_list_info_URL(String url) throws Throwable {
		endpoint = url;		
	}

	/**
	 * Send the GE T request for list info.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^send the GET request for list info$")
	public void send_the_GET_request_for_list_info() throws Throwable {
		response = expect()
				.given()
				.contentType("application/json")
				.get(endpoint);
	}

	/**
	 * The response status for list info should be.
	 *
	 * @param arg1 the arg 1
	 * @throws Throwable the throwable
	 */
	@Then("^the response status for list info should be \"([^\"]*)\"$")
	public void the_response_status_for_list_info_should_be(String arg1) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}
	
}

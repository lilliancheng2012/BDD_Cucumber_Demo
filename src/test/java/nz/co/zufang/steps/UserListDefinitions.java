package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

/**
 * The Class UserListDefinitions.
 */
public class UserListDefinitions {

	/** The response. */
	// List<User> userList;
	Response response;
	
	/** The endpoint. */
	String endpoint;

	/**
	 * The server endpoint list users URL.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^The Server endpoint list users URL \"([^\"]*)\"$")
	public void the_Server_endpoint_list_users_URL(String url) throws Throwable {
		endpoint = url;
	}

	
	/**
	 * SEN D TH E GE T request.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^send the GET request$")
	public void SEND_THE_GET_request() throws Throwable {

		response = expect()
				.given()
				.contentType("application/json")
				.get(endpoint);
	}

	
	/**
	 * The response status should be.
	 *
	 * @param expectedValue the expected value
	 * @throws Throwable the throwable
	 */
	@Then("^the response status should be \"([^\"]*)\"$")
	public void the_response_status_should_be(String expectedValue) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

}

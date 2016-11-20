package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import nz.co.zufang.model.User;

/**
 * The Class UserDeleteDefinitions.
 */
public class UserDeleteDefinitions {
	
	/** The endpoint. */
	String endpoint;
	
	/** The response. */
	Response response;
	
	/** The delete response. */
	Response deleteResponse;
	
	/**
	 * The server endpoint delete user URL.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^The Server endpoint delete user URL \"([^\"]*)\"$")
	public void the_Server_endpoint_delete_user_URL(String url) throws Throwable {
		endpoint = url;
	}
	

	/**
	 * Delete an exist user name is.
	 *
	 * @param username the username
	 * @throws Throwable the throwable
	 */
	@Given("^Delete an exist user name is \"([^\"]*)\"$")
	public void delete_an_exist_user_name_is(String username) throws Throwable {
		 
		deleteResponse = expect()
				.given()
				.contentType("application/json")
				.get("http://localhost:5000/rent/findUserByUsername/" + username)
				.andReturn();
		User user = deleteResponse.getBody().as(User.class);
		
		endpoint = endpoint + user.getUid();
	}
	
	
	/**
	 * Delete a invalid user id is.
	 *
	 * @param id1 the id 1
	 * @throws Throwable the throwable
	 */
	@Given("^Delete a invalid user id is \"([^\"]*)\"$")
	public void delete_a_invalid_user_id_is(String id1) throws Throwable {
		endpoint = endpoint + id1;
	}
	

	/**
	 * Send the DELET E request.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^send the DELETE request$")
	public void send_the_DELETE_request() throws Throwable {
		response = expect()
				.given()
				.contentType("application/json")
				.delete(endpoint)
				.andReturn();
	}

	
	/**
	 * The success response should be.
	 *
	 * @param arg1 the arg 1
	 * @throws Throwable the throwable
	 */
	@Then("^the success response should be \"([^\"]*)\"$")
	public void the_success_response_should_be(String arg1) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}
	
	
	/**
	 * The failure response message and status code should be.
	 *
	 * @param expectedValue the expected value
	 * @throws Throwable the throwable
	 */
	@Then("^the failure response message should be:$")
	public void the_failure_response_message_and_status_code_should_be(String expectedValue) throws Throwable {
		assertEquals(400, response.getStatusCode());
	}
}

package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

/**
 * The Class InfoDeleteDefinition.
 */
public class InfoDeleteDefinition {
	
	/** The endpoint. */
	String endpoint;
	
	/** The response. */
	Response response;
	
	/**
	 * The server endpoint delete info URL.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^The Server endpoint delete info URL \"([^\"]*)\"$")
	public void the_Server_endpoint_delete_info_URL(String url) throws Throwable {
	    endpoint = url;
	}

	
	/**
	 * Delete an exist info id.
	 *
	 * @param Uid the uid
	 * @throws Throwable the throwable
	 */
	@Given("^Delete an exist info id \"([^\"]*)\"$")
	public void delete_an_exist_info_id(String Uid) throws Throwable {
		endpoint = endpoint + Uid;
	}
	
	
	/**
	 * Delete a invalid info id.
	 *
	 * @param InvalidUid the invalid uid
	 * @throws Throwable the throwable
	 */
	@Given("^Delete a invalid info id \"([^\"]*)\"$")
	public void delete_a_invalid_info_id(String InvalidUid) throws Throwable {
		endpoint = endpoint + InvalidUid;
	}

	
	/**
	 * Send the DELET E info request.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^send the DELETE info request$")
	public void send_the_DELETE_info_request() throws Throwable {
		response = expect()
				.given()
				.contentType("application/json")
				.delete(endpoint)
				.andReturn();
	}

	
	/**
	 * The delete success response status is.
	 *
	 * @param arg1 the arg 1
	 * @throws Throwable the throwable
	 */
	@Then("^the delete success response status is \"([^\"]*)\"$")
	public void the_delete_success_response_status_is(String arg1) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

	
	/**
	 * The failure delete response status is.
	 *
	 * @param arg1 the arg 1
	 * @throws Throwable the throwable
	 */
	@Then("^the failure delete response status is \"([^\"]*)\"$")
	public void the_failure_delete_response_status_is(String arg1) throws Throwable {
		assertEquals(400, response.getStatusCode());
	}

}

package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;

import java.util.List;

import com.google.gson.Gson;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import nz.co.zufang.model.InfoCreateRequest;

/**
 * The Class InfoCreateDefinition.
 */
public class InfoCreateDefinition {
	
	/** The endpoint. */
	String endpoint;
	
	/** The info create request. */
	InfoCreateRequest infoCreateRequest;
	
	/** The response. */
	static Response response;
	
	/**
	 * The create info endpoint URL.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^The create info endpoint URL \"([^\"]*)\"$")
	public void the_create_info_endpoint_URL(String url) throws Throwable {
		endpoint = url;
	}
	
	/**
	 * Creates the a new info as below.
	 *
	 * @param dataTable the data table
	 * @throws Throwable the throwable
	 */
	@Given("^create a new info as below:$")
	public void create_a_new_info_as_below(DataTable dataTable) throws Throwable {
		List<InfoCreateRequest> infoList = dataTable.asList(InfoCreateRequest.class);
		infoCreateRequest = infoList.get(0);
	}

	/**
	 * Send the POS T request to create info rest API.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^send the POST request to create info restAPI$")
	public void send_the_POST_request_to_create_info_restAPI() throws Throwable {
		Gson gson = new Gson();
		String body = gson.toJson(infoCreateRequest);
		
		response = expect()
		.given()
        .contentType("application/json")
        .body(body)
        .post(endpoint)
        .andReturn();
	}

	/**
	 * Creates the info response status should be.
	 *
	 * @param arg1 the arg 1
	 * @throws Throwable the throwable
	 */
	@Then("^create info response status should be \"([^\"]*)\"$")
	public void create_info_response_status_should_be(String arg1) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

}

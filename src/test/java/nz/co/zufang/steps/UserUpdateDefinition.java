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
import nz.co.zufang.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Class UserUpdateDefinition.
 */
public class UserUpdateDefinition {
	
	/** The endpoint. */
	String endpoint;
	
	/** The user. */
	User user;
	
	/** The response. */
	Response response; 
	
	/**
	 * The server endpoint update user URL.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^The Server endpoint update user URL \"([^\"]*)\"$")
	public void the_Server_endpoint_update_user_URL(String url) throws Throwable {
		endpoint = url;
	}

	/**
	 * The update details for the user as below.
	 *
	 * @param dataTable the data table
	 * @throws Throwable the throwable
	 */
	@Given("^the update details for the user as below:$")
	public void the_update_details_for_the_user_as_below(DataTable dataTable) throws Throwable {
		List<User> userList = dataTable.asList(User.class);
		user = userList.get(0);
	}

	/**
	 * Send the POS T request to update user rest API.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^send the POST request to update user restAPI$")
	public void send_the_POST_request_to_update_user_restAPI() throws Throwable {
		
		Gson gson = new Gson();
		String body = gson.toJson(user);
		
		response = expect()
				.given()
		        .contentType("application/json")
		        .body(body)
		        .post(endpoint);
	}

	/**
	 * The response code should be.
	 *
	 * @param expectedValue the expected value
	 * @throws Throwable the throwable
	 */
	@Then("^the response success code should be \"([^\"]*)\"$")
	public void the_response_success_code_should_be(String expectedValue) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

	
	/**
	 * The response failure code should be.
	 *
	 * @param expectedValue the expected value
	 * @throws Throwable the throwable
	 */
	@Then("^the response failure code should be \"([^\"]*)\"$")
	public void the_response_failure_code_should_be(String expectedValue) throws Throwable {
		assertEquals(400, response.getStatusCode());
	}
}

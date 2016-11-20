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

/**
 * The Class UserUpdateDefinition.
 */
public class UserUpdateDefinition {
	
	/** The endpoint. */
	String endpoint;
	
	/** The user. */
	User user;
	
	/** The user 1. */
	User user1;
	
	/** The find user by username response. */
	Response findUserByUsernameResponse;
	
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
	 * Exsiting user.
	 *
	 * @param username the username
	 * @throws Throwable the throwable
	 */
	@Given("^exsiting user \"([^\"]*)\"$")
	public void exsiting_user(String username) throws Throwable {
		findUserByUsernameResponse = expect()
				.given()
				.contentType("application/json")
				.get("http://localhost:5000/rent/findUserByUsername/" + username)
				.andReturn();
		user1 = findUserByUsernameResponse.getBody().as(User.class);
		
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
		user.setUid(user1.getUid());
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
	 * The response success code should be.
	 *
	 * @param expectedValue the expected value
	 * @throws Throwable the throwable
	 */
	@Then("^the response success code should be \"([^\"]*)\"$")
	public void the_response_success_code_should_be(String expectedValue) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

}

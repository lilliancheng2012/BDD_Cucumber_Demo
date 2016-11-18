package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;
import java.util.List;
import com.google.gson.Gson;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nz.co.zufang.model.BasicUserReg;
import nz.co.zufang.model.GenericResponse;

/**
 * The Class UserStepDefinitions.
 */
public class UserStepDefinitions {
	
	/** The user. */
	BasicUserReg user;
	
	/** The endpoint. */
	String endpoint;
	
	/** The response. */
	GenericResponse response;

	/**
	 * The server endpoint URL.
	 *
	 * @param url the url
	 * @throws Throwable the throwable
	 */
	@Given("^The Server endpoint URL \"([^\"]*)\"$")
	public void the_Server_endpoint_URL(String url) throws Throwable {
		endpoint = url;
	}

	/**
	 * Creates the a new user as below.
	 *
	 * @param dataTable the data table
	 * @throws Throwable the throwable
	 */
	@Given("^create a new user as below:$")
	public void create_a_new_user_as_below(DataTable dataTable) throws Throwable {
		List<BasicUserReg> userList = dataTable.asList(BasicUserReg.class);
		user = userList.get(0);
	}

	/**
	 * Send the POS T request to rest API.
	 *
	 * @throws Throwable the throwable
	 */
	@When("^send the POST request to restAPI$")
	public void send_the_POST_request_to_restAPI() throws Throwable {
		
		Gson gson = new Gson();
		String body = gson.toJson(user);
		
		response = expect()
		.given()
        .contentType("application/json")
        .body(body)
        .post(endpoint)
        .andReturn()
		.body()
		.as(GenericResponse.class);
	}

	/**
	 * Should receive the following message.
	 *
	 * @param expectedValue the expected value
	 * @throws Throwable the throwable
	 */
	@Then("^should receive the following message$")
	public void should_receive_the_following_message(String expectedValue) throws Throwable {
		assertEquals(expectedValue,response.getMessage());
	}
	
}

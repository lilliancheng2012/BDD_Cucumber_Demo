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

public class UserStepDefinitions {
	
	BasicUserReg user;
	String endpoint;
	GenericResponse response;

	@Given("^The Server endpoint URL \"([^\"]*)\"$")
	public void the_Server_endpoint_URL(String url) throws Throwable {
		endpoint = url;
	}

	@Given("^create a new user as below:$")
	public void create_a_new_user_as_below(DataTable dataTable) throws Throwable {
		List<BasicUserReg> userList = dataTable.asList(BasicUserReg.class);
		user = userList.get(0);
	}

	@When("^send the POST request to restAPI$")
	public void send_the_POST_request_to_restAPI() throws Throwable {
		
		Gson gson = new Gson();
		String body = gson.toJson(user);
		
		response = expect()
		.statusCode(200)
		.given()
        .contentType("application/json")
        .body(body)
        .post(endpoint)
        .andReturn()
		.body()
		.as(GenericResponse.class);
		
	}

	@Then("^should receive the following message$")
	public void should_receive_the_following_message(String expectedValue) throws Throwable {
		assertEquals(expectedValue,response.getMessage());
	}

}

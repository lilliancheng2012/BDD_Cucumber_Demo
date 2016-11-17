package nz.co.zufang.steps;

import static io.restassured.RestAssured.expect;
import static org.junit.Assert.assertEquals;
import java.util.List;
import com.google.gson.Gson;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nz.co.zufang.model.BasicUserLogin;
import nz.co.zufang.model.GenericResponse;

public class UserLoginStepDefinitions {

	BasicUserLogin user;
	String endpoint;
	GenericResponse response;
	
	@Given("^The Server endpoint login URL \"([^\"]*)\"$")
	public void the_Server_endpoint_login_URL(String url) throws Throwable {
		endpoint = url;
	}
	
	@Given("^user name and password as below:$")
	public void user_name_and_password_as_below(DataTable dataTable) throws Throwable {
		List<BasicUserLogin> userList = dataTable.asList(BasicUserLogin.class);
		user = userList.get(0);
	}
	
	@When("^send the POST request to login restAPI$")
	public void send_the_POST_request_to_login_restAPI() throws Throwable {
		
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

	@Then("^should receive the following login success message$")
	public void should_receive_the_following_login_success_message(String expectedValue) throws Throwable {
		assertEquals(expectedValue,response.getMessage());
	}
	
}

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

public class InfoCreateDefinition {
	
	String endpoint;
	InfoCreateRequest infoCreateRequest;
	static Response response;
	
	@Given("^The create info endpoint URL \"([^\"]*)\"$")
	public void the_create_info_endpoint_URL(String url) throws Throwable {
		endpoint = url;
	}
	
	@Given("^create a new info as below:$")
	public void create_a_new_info_as_below(DataTable dataTable) throws Throwable {
		List<InfoCreateRequest> infoList = dataTable.asList(InfoCreateRequest.class);
		infoCreateRequest = infoList.get(0);
	}

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

	@Then("^create info response status should be \"([^\"]*)\"$")
	public void create_info_response_status_should_be(String arg1) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

}

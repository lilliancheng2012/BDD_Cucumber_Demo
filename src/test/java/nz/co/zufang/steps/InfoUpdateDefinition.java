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
import nz.co.zufang.model.InfoUpdateRequest;

public class InfoUpdateDefinition {

	String endpoint;
	InfoUpdateRequest infoUpdateRequest;
	Response response;
	
	@Given("^The Server endpoint update Info URL \"([^\"]*)\"$")
	public void the_Server_endpoint_update_Info_URL(String url) throws Throwable {
		endpoint = url;
	}

	
	@Given("^the update details for the info as below:$")
	public void the_update_details_for_the_info_as_below(DataTable dataTable) throws Throwable {
		List<InfoUpdateRequest> userList = dataTable.asList(InfoUpdateRequest.class);
		infoUpdateRequest = userList.get(0);
	}
	

	@When("^send the POST request to update Info restAPI$")
	public void send_the_POST_request_to_update_Info_restAPI() throws Throwable {
		Gson gson = new Gson();
		String body = gson.toJson(infoUpdateRequest);
		
		response = expect()
				.given()
		        .contentType("application/json")
		        .body(body)
		        .post(endpoint);
	}

	
	@Then("^the response success status is \"([^\"]*)\"$")
	public void the_response_success_status_is(String arg1) throws Throwable {
		assertEquals(200, response.getStatusCode());
	}

}

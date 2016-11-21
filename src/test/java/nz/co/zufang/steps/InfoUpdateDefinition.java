package nz.co.zufang.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InfoUpdateDefinition {

	String endpoint;
	
	@Given("^The Server endpoint update Info URL \"([^\"]*)\"$")
	public void the_Server_endpoint_update_Info_URL(String url) throws Throwable {
		endpoint = url;
	}

	
	@Given("^the update details for the info as below:$")
	public void the_update_details_for_the_info_as_below(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	

	@When("^send the POST request to update Info restAPI$")
	public void send_the_POST_request_to_update_Info_restAPI() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	
	@Then("^the response success status is \"([^\"]*)\"$")
	public void the_response_success_status_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}

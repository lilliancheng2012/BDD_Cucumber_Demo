# Feature/Users Feature
Feature: Register new user
		 Create new user with rest api

	Background:
		Given The Server endpoint URL "http://localhost:8080/rent/register"
		
	
	Scenario: Create a new user
		Given create a new user as below:
		| username | password | email                       | phone      | address    | imAccount |
    	| lillian  | pass2016 | lillian.cheng2012@gmail.com | 0222762000 | penrose rd | 634500997 |
		When send the POST request to restAPI
	    Then should receive the following message
	    """
	    Register successfully
	    """
	    
	 
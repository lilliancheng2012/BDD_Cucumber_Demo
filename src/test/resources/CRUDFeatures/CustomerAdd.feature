# Feature/Customer Add Feature

Feature: Create new customer
		 Create customer with rest api

	Background:
		Given The Server URL "http://localhost:8080/api/customer/create"
		
	
	Scenario: Create a new customer
		Given create a new customer with name "Lillian", address "Auckland" and phone "093552000"
		When the client sends the POST request
	    Then the client should receive the following message
	    """
	    Customer added successfully
	    """
	    
	 
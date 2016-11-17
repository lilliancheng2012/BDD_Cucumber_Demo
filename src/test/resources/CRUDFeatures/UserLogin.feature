# Feature/User Login Feature
Feature: Login user 
	Login user with rest api

Background: 
	Given The Server endpoint login URL "http://localhost:8080/rent/login" 
	
	
Scenario: Login with correct user name and password 
	Given user name and password as below: 
		| userName | password |
		| lillian  | pass2016 |
	When send the POST request to login restAPI 
	Then should receive the following login success message 
	"""
	Login successfully
	"""
	
	
Scenario: Login with incorrect user name and password
#Login with incorrect user name and password
	Given user name and password as below: 
		| userName | password |
		| lillian1 | passpass |
	When send the POST request to login restAPI 
	Then should receive the following login success message 
	"""
	The resource you requested does not exist
	"""
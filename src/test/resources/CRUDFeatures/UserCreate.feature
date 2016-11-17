# Feature/Users Create Feature
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
		
Scenario: Create a new user with exist username
#Create a new user with exist user name
	Given create a new user as below:  
		| username | password | email                   | phone      | address      | imAccount  |
		| lillian  | pass2017 | lillian.cheng@gmail.com | 0222762001 | penrose road | 6345009971 |
	When send the POST request to restAPI 
	Then should receive the following message 
	"""
	The user is already registered.
	"""
	    
Scenario: Create a new user with exist email
#Create a new user with exist email
	Given create a new user as below:  
		| username  | password | email                       | phone      | address | imAccount  |
		| lillian1  | pass2015 | lillian.cheng2012@gmail.com | 0222762002 | penrose | 6345009972 |
	When send the POST request to restAPI 
	Then should receive the following message 
	"""
	The user is already registered.
	"""

	
	
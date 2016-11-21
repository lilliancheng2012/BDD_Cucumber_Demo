# Feature/User List Feature
Feature: List all user 
	List user with rest api

Background: 
	Given The Server endpoint list users URL "http://localhost:5000/rent/listUsers"  
	
	
Scenario: List all users 
	When send the GET request 
	Then the response status should be "200"  
# Feature/User Delete Feature
Feature: Delete a user 
	Delete a user with rest api

Background: 
	Given The Server endpoint delete user URL "http://localhost:5000/rent/deleteUser/" 
	
	
Scenario: Delete an exist user 
	Given Delete an exist user name is "lillian"
	When send the DELETE request
	Then the success response should be "true" 
	

Scenario: Delete a invalid user
	Given Delete a invalid user id is "0123"
	When send the DELETE request
	Then the failure response message should be:
	"""
	No class nz.co.zufang.model.User entity with id 0123 exists!
	"""
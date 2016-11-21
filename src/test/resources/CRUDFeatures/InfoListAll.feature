# Feature/Info list all Feature
Feature: List all info 
	List all info with rest api

Background: 
	Given The Server endpoint list info URL "http://localhost:5000/list"
	
	
Scenario: List all infos 
	When send the GET request for list info
	Then the response status for list info should be "200"
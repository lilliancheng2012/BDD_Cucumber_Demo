# Feature/Info Delete Feature
Feature: Delete a Info 
	Delete a Info with rest api

Background: 
	Given The Server endpoint delete info URL "http://localhost:5000/deleteInfo/" 
	
	
#Scenario: Delete an exist info 
#	Given Delete an exist info id "4028d081588659f00158866541c80003"
#	When send the DELETE info request
#	Then the delete success response status is "200"
	

Scenario: Delete a invalid info
	Given Delete a invalid info id "01234567890"
	When send the DELETE info request
	Then the failure delete response status is "400" 
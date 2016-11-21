# Feature/Update Info Feature
Feature: Update an exist Info 
	Update an exist Info with rest api

Background: 
	Given The Server endpoint update Info URL "http://localhost:5000/updateInfo/"
	
Scenario: Update an exist Info 
	Given the update details for the info as below:
		| id                               | address        | content        | description        | email                 | fee   | keywords        | linkMan     | mapPoint      | phone      | postArea        | qq        | title        |
		| 4028d081588659f00158866ad2e90006 | update address | update content | update description | updateemail@gmail.com | 99.00 | update keywords | Mrs Lillian | test mapPoint | 0225647776 | update postArea | 331991079 | update title |

	When send the POST request to update Info restAPI
	Then the response success status is "200"
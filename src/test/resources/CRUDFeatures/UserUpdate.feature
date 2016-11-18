# Feature/User Update Feature
Feature: Update an exist user 
	Update an exist user with rest api

Background: 
	Given The Server endpoint update user URL "http://localhost:8080/rent/updateUser" 
	
	
Scenario: Update an exist user 
	Given the update details of the user as below: 
		| uid                              | username | password | email                       | phone      | address    | imAccount |
		| 4028d081586a10560158705918c70013 | lillian  | pass2016 | lillian.cheng2012@gmail.com | 0222762000 | penrose rd | 634500997 |

	When send the POST request to update user restAPI 
	Then a 200 response is returned
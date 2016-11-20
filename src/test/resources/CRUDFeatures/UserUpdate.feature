# Feature/User Update Feature
Feature: Update an exist user 
	Update an exist user with rest api

Background: 
	Given The Server endpoint update user URL "http://localhost:5000/rent/updateUser"  
	
Scenario: Update an exist user 
	Given exsiting user "testuser"
	Given the update details for the user as below:  
		| username | password | email                       | phone      | address      | imAccount  |
		| lillian1 | pass2015 | lillian.cheng2017@gmail.com | 0222762001 | penrose road | 6345009971 |

	When send the POST request to update user restAPI  
	Then the response success code should be "200"
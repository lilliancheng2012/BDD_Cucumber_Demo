# Feature/User Update Feature
Feature: Update an exist user 
	Update an exist user with rest api

Background: 
	Given The Server endpoint update user URL "http://localhost:8080/rent/updateUser"  
	
Scenario: Update an exist user 
	Given the update details for the user as below:  
		| uid                              | username | password | email                       | phone      | address      | imAccount  |
		| 4028d081586a10560158705918c70013 | lillian1 | pass2015 | lillian.cheng2017@gmail.com | 0222762001 | penrose road | 6345009971 |

	When send the POST request to update user restAPI  
	Then the response success code should be "200"
	

Scenario: Update a user which is not exist
	Given the update details for the user as below:  
		| uid | username | password | email                       | phone      | address      | imAccount  |
		| 123 | lillian  | pass2015 | lillian.cheng2017@gmail.com | 0222762001 | penrose road | 6345009971 |

	When send the POST request to update user restAPI  
	Then the response failure code should be "400"
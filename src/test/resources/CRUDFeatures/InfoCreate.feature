# Feature/Info Create Feature
Feature: Create new info 
	Create new info with rest api

Background: 
	Given The create info endpoint URL "http://localhost:5000/createInfo/"
	
	
Scenario: Create a new info 
	Given create a new info as below:
		| address      | content  | description      | email          | fee   | keywords   | linkMan | mapPoint     | phone | qq        | postArea | title      |
		| penrose road | pass2016 | test description | test@gmail.com | 12.00 | Good House | Lillian | testMapPoint | 01234 | 634500997 | testArea | rent house |
	When send the POST request to create info restAPI 
	Then create info response status should be "200" 
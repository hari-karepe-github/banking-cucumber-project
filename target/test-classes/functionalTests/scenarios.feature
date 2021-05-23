Feature: City National Bank scenarios
	Description: The purpose of this feature is to test End 2 End integration.
 
Scenario Outline: Customer validates login information for different suites 
	Given user is on Home Page 
	And he taps on signIn page
	When choose to login City National Online
	And validates City National Online login information
	And moves to Business Suite
	And choose to login into Business Suite
	And validates Business Suite login information
	And moves to Business Essentials
	And choose to login into Business Essentials
	And validates Business Essentials login information
	Then chooses forgot UserID
	And enter forgot UserID details
	And chooses forgot password
	And enter forgot password details
	And choose contact us
	And enter "<customer>" details on contact us page
	And browser close

	Examples: 
		|customer|
		|Hari|
		
		
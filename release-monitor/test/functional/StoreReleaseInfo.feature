Feature: Storing key pieces of release information
	As a user 
	I want to see key release information captured
	So that I can validate the intended release for an application
	
Scenario: 
	Given a component has observed release information
	When viewing the component detailed history page
	Then it should show "Build Id", "Timestamp", "Annotations"
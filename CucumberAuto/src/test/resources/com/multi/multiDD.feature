Feature: Title of your featured
  I want to use this template for my feature file

  Scenario Outline: validate first name fieldd
 		* User needs to be on the homepage
    * User enters a value on search field
    * User checks the search value is present
    * User selects "<select>" from the "Company" dropdown menu
		* Close driver
    #* User pauses the test
Examples: 
	|	select	|menu		|
	|About Us	|Company|
	|Clients	|Company|
	|Careers	|Company|
	|Charity	|Company|
  
   
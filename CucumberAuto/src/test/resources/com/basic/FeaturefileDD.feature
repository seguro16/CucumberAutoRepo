Feature: Title of your feature2
  I want to use this template for my feature file2

  Scenario Outline: validate first name field2
 		* User needs to be on the homepage
    * User enters a value on search field
    * User checks the search value is present
    * User selects "<select>" from the "Company" dropdown menu

    #* User pauses the test
Examples: 
	|	select	|menu		|
	|About Us	|Company|
	|Clients	|Company|
	|Careers	|Company|
	|Charity	|Company|


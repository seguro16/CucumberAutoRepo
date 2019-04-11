Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: validate first name field
    * User need to be on the homepage
    * User enters user first name
    * User checks user first name is present
    * User selects "<select>" from the "Company" dropdown menu

    #* User pauses the test
Examples: 
	|	select	|menu		|
	|About Us	|Company|
	|Clients	|Company|
	|Careers	|Company|
	|Charity	|Company|


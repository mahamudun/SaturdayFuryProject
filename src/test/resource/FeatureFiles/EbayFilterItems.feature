@regression @smoke

Feature: Filter items by size

Description: User should be able to filter items by size

	Background: 
		Given Open Ebay Homepage
		
	Scenario Outline: Filter items by size
		Given Search for "<Items>"
		When User select "<Size>"
		Then Item list should have size of "<Size>"
	
	Examples:
		|Items		|Size		|
		|Shoes		|10			|
		|Shirts		|L			|
		|Pants		|Tall		|
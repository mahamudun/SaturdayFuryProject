@regression @smoke @SKYW-15 @E2E

Feature: eBay Search Functionality

	Background: 
		Given Open eBay Homepage

	Scenario: Search for Shoes
		Given Open eBay Homepage
		When Search for shoes
		Then Item list should have only shoes related products

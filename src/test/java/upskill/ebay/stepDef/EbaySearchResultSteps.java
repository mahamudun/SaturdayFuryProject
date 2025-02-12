package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {

	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShoesItems();
	}

	@Then("^Item list should have only Pants related products$")
	public void item_list_should_have_only_Pants_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyPantsItems();
	}

	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShirtsItems();
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbaySearchResultActionsObj.filterBrand(brand);
	}
	
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		EbaySearchResultActionsObj.verifyBrandItems(brand);
	}
	
	@When("^User select \"([^\"]*)\"$")
	public void user_select(String size) throws Throwable {
		EbaySearchResultActionsObj.filterSize(size);
	}
	
	@Then("^Item list should have size of \"([^\"]*)\"$")
	public void item_list_should_have_size_of(String size) throws Throwable {
		EbaySearchResultActionsObj.verifyItemsSize(size);
	}
	
	@Then("^Item list should have Starwars related Books$")
	public void item_list_should_have_Starwars_related_Books() throws Throwable {
	  
	}


}
package tek.dragons.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class ShoppinCartSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@Then("User searches {string} in search box")
	public void userSearchesInSearchBox(String string) {
		sendText(factory.shoppingCart().searchBox, string);
	}

	@Then("User clicks on search button")
	public void userClicksOnSearchButton() {
		slowDown();
		click(factory.shoppingCart().searchBtn);
	}
	
	@Then("User clicks on product in product log")
	public void userClicksOnProductInProductLog() {
		slowDown();
		click(factory.shoppingCart().ps5); 
	}
	
	@Then("Verify product web page is loaded")
	public void verifyProductWebPageIsLoaded() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.shoppingCart().addToCartText));
	}
	
	@Then("User adds product to shopping cart")
	public void userAddsProductToShoppingCart() {
		slowDown();
		click(factory.shoppingCart().addToCartBtn);
		slowDown();
		takeScreenShotAsBytes();
	}
	
	


}

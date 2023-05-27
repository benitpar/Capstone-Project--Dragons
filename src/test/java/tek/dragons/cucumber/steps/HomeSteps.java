package tek.dragons.cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website home page")
	public void userIsOnRetailWebsiteHomePage() {
		Assert.assertTrue(factory.homePage().tekschoolLogo.isDisplayed());
		logger.info("Tekschool logo is present");
	}
	@Then("User verify retail website title")
	public void userVerifyRetailWebsiteTitle() {
	    String expectedTitle = "React App";
	    String actualTitle = getTitle();
	    Assert.assertEquals(expectedTitle, actualTitle);
	    logger.info("Expected and Actual Page title are the same" + actualTitle);
	}
	@When("User changes category to {string}")
	public void userChangesCategoryTo(String string) {
		slowDown();
		selectByVisibleText(factory.homePage().allDepartments, string);
		logger.info(string+": Selected from dropdown ");
	}
	@When("User enter name item name {string}")
	public void userEnterNameItemName(String string) {
		slowDown();
		sendText(factory.homePage().searchTextBox,string);
		logger.info(string+" : value was entered successfully");
	}
	@When("User click on search button")
	public void userClickOnSearchButton() {
		slowDown();
		click(factory.homePage().searchBttn);
		logger.info("Search button was clicked successfully");
	}
	@Then("Item should be present on the page")
	public void itemShouldBePresentOnThePage() {
	    Assert.assertTrue(isElementDisplayed(factory.homePage().playStationItem));
	    logger.info("Item is present");
	}
	@Then("User can see the title {string}")
	public void userCanSeeTheTitle(String string) {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePage().shopBycategoryTitle));
	   
	}
}

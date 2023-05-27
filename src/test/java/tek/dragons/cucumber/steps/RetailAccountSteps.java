package tek.dragons.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;

import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Then("User clicks on Create New Account")
	public void userClicksOnCreateNewAccount() {
		click(factory.retailAccount().accountBtn);
		slowDown();
	    
	}
	@Then("User will enter {string} and {string} and {string} and {string}")
	public void userWillEnterAndAndAnd(String name, String email, String password, String confirmPassword) {
		sendText(factory.retailAccount().nameField,name);
		slowDown();
		sendText(factory.retailAccount().emailField,email);
		slowDown();
		sendText(factory.retailAccount().passwordField,password);
		slowDown();
		sendText(factory.retailAccount().confirmPassword,confirmPassword);
		slowDown();
		
	}
	@Then("User will click on Sign Up button")
	public void userWillClickOnSignUpButton() {
		click(factory.retailAccount().signUpBtn);
		slowDown();
	 
	}
	@Then("User will verify that Account is created")
	public void userWillVerifyThatAccountIsCreated() {
		String expectedText = "Your Profile";
		String actualText=factory.retailAccount().profileText.getText();
		Assert.assertEquals(expectedText,actualText);
	    
	}


}

package tek.dragons.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class LoginSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();

	@Then("I click on sign in button")
	public void iClickOnSignInButton() {
		click(factory.loginPage().signinBttn);
		logger.info("User clicked on Sign in Button successfully");
	}
	@Then("I click on create new account button")
	public void iClickOnCreateNewAccountButton() {
		click(factory.loginPage().newAccountBtn);
		logger.info("User clicked on New Account Button");    
	}
	@Then("I enter user {string} and {string} and {string} and {string}")
	public void iEnterUserAndAndAnd(String name, String email, String password, String confirmPass) {
		sendText(factory.loginPage().nameInputField, name);
		logger.info("User entered name successfully");
		sendText(factory.loginPage().emailInputField, email);
		logger.info("User entered email sucessfully");
		sendText(factory.loginPage().passwordInputField, password);
		logger.info("Password field enterd successfully");
		sendText(factory.loginPage().confirmPassInputField, confirmPass);
		logger.info("Confirm password field entered successfully");
	}
	@Then("I click on signup button")
	public void iClickOnSignupButton() {
		click(factory.loginPage().signupBttn);
		logger.info("Sign Up button successfully clicked");
	}
	
	@Then("I should see my profile page")
	public void iShouldSeeMyProfilePage() {
		slowDown();
		String expectedText="Your Profile";
		String actualText=factory.loginPage().yourProfileText.getText();
		Assert.assertEquals(expectedText, actualText);
		logger.info(actualText+" : was verified successfully");
	}

}

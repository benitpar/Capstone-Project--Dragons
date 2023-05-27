package tek.dragons.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@Then("User clicks on sign in button")
	public void userClicksOnSignInButton() {
		click(factory.signIn().signInBtn);
	    slowDown();
	}
	@Then("User enters {string} and {string}")
	public void userEntersAnd(String email, String password) {
		sendText(factory.signIn().emailField, email);
		slowDown();
		sendText(factory.signIn().passwordField, password);
	   
	}
	@Then("clicks on Login button")
	public void clicksOnLoginButton() {
		click(factory.signIn().logInBtn);
		slowDown();
	   
	}
	@Then("User should see their profile page")
	public void userShouldSeeTheirProfilePage() {
		click(factory.signIn().accountBtn);
		slowDown();
		String expectedText="Your Profile";
		String actualText= factory.signIn().profileText.getText();
		Assert.assertEquals(expectedText, actualText);
	}

}

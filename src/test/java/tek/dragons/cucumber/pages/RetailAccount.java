package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import tek.dragons.cucumber.base.BaseSetup;

public class RetailAccount extends BaseSetup {
	
	POMFactory factory = new POMFactory();
	
	public RetailAccount() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="signinLink")
	public WebElement signIn;
	@FindBy(id="newAccountBtn")
	public WebElement accountBtn;
	@FindBy(id="nameInput")
	public WebElement nameField;
	@FindBy(id="emailInput")
	public WebElement emailField;
	@FindBy(id="passwordInput")
	public WebElement passwordField;
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPassword;
	@FindBy(id="signupBtn")
	public WebElement signUpBtn;
	@FindBy(xpath="//h1[text()='Your Profile']")
	public WebElement profileText;
	

}

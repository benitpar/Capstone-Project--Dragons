package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="signinLink")
	public WebElement signInBtn;
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailField;
	@FindBy(xpath="//input[@id='password']")
	public WebElement passwordField;
	@FindBy(xpath="//button[@id='loginBtn']")
	public WebElement logInBtn;
	@FindBy(id="accountLink")
	public WebElement accountBtn;
	@FindBy(xpath="//h1[text()='Your Profile']")
	public WebElement profileText;
	

}

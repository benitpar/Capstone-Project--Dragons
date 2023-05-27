package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class LoginPage extends BaseSetup{
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="signinLink")
	public WebElement signinBttn;
	@FindBy(id="newAccountBtn")
	public WebElement newAccountBtn;
	@FindBy(id="nameInput")
	public WebElement nameInputField;
	@FindBy(id="emailInput")
	public WebElement emailInputField;
	@FindBy(id="passwordInput")
	public WebElement passwordInputField;
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPassInputField;
	@FindBy(id="signupBtn")
	public WebElement signupBttn;
	@FindBy(xpath="//div[@class='account__personal']//h1")
	public WebElement yourProfileText;
	
	

}

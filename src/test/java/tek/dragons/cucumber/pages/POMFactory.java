package tek.dragons.cucumber.pages;

public class POMFactory {
	
	private HomePage homePage;
	private LoginPage loginPage;
	private ShoppingCart shoppingCart;
	private RetailSignInPage signIn;
	private RetailAccount retailAccount;
	
	public POMFactory() {
		this.homePage = new HomePage();
		this.loginPage = new LoginPage();
		this.shoppingCart = new ShoppingCart();
		this.signIn = new RetailSignInPage();
		this.retailAccount = new RetailAccount();
	}
	public HomePage homePage() {
		return this.homePage;
	}
	
	public LoginPage loginPage() {
		return this.loginPage;
	}
	
	public ShoppingCart shoppingCart() {
		return this.shoppingCart;
	}
	
	public RetailSignInPage signIn() {
		return this.signIn;
	}
	
	public RetailAccount retailAccount() {
		return this.retailAccount;
		
	}

}

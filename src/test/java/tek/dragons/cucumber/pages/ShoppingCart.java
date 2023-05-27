package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class ShoppingCart extends BaseSetup {
	
	public ShoppingCart() {
		PageFactory.initElements(getDriver(),this);
	}
	
	@FindBy(id="searchInput")
	public WebElement searchBox;
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	@FindBy(xpath="//p[text()='PlayStation 5 Console']")
	public WebElement ps5;
	@FindBy(xpath="//span[text()='Add to Cart']")
	public WebElement addToCartText;
	@FindBy(id="addToCartBtn")
	public WebElement addToCartBtn;
	@FindBy(css="svg.product__cart-tick")
	public WebElement cartTick;

}

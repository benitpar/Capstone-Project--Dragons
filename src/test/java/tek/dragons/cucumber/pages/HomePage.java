package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class HomePage extends BaseSetup {
	
	public HomePage() {
		PageFactory.initElements(getDriver(),this);
	}

	@FindBy(linkText ="TEKSCHOOL")
	public WebElement tekschoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartments;
	
	@FindBy(id ="searchInput")
	public WebElement searchTextBox;
	
	@FindBy(id ="searchBtn")
	public WebElement searchBttn;
	
	@FindBy(xpath ="//img[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;
	
	@FindBy(id="categoryTitle")
	public WebElement shopBycategoryTitle;
	
}

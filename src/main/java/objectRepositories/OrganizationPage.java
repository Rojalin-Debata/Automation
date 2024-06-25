package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateOrgLookUpImg;
	//Initialization
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getCreateOrgLookUpImg() {
		return CreateOrgLookUpImg;
	}
	//Business Library
	// This method will click on create contact look up image
	
	public void clickonCreateOrgLookUpImg() {
		CreateOrgLookUpImg.click();
	}

}

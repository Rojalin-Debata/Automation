package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OragnizationInfoPage {
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement OrgHeaderText;

	//Initialization
	public OragnizationInfoPage(WebDriver driver) // test script
	{
		PageFactory.initElements(driver, this);
	}
   //Utilization
	public WebElement getOrgHeaderText() {
		return OrgHeaderText;
	}

	//Business Library
	/**
	 * This method will get the organization header text
	 * @return
	 */
	public String getHeader()
	{
		return OrgHeaderText.getText();
	}
}

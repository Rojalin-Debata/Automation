package objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebdriverUtility;

public class CreateNewOrganizationPage extends WebdriverUtility {
	// Declaration
		@FindBy(name = "accountname")
		private WebElement OrgNameEdt;

		@FindBy(name = "industry")
		private WebElement IndustryDropDwn;

		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement SaveBtn;

		// initializations
		public CreateNewOrganizationPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// utilization
		public WebElement getOrgNameEdt() {
			return OrgNameEdt;
		}

		public WebElement getIndustryDropDwn() {
			return IndustryDropDwn;
		}

		public WebElement getSaveBtn() {
			return SaveBtn;
		}

		//Business Library
		/**
		 * This method will create a new organization
		 * @param ORGNAME
		 */
		public void createNewOrganization(String ORGNAME)
		{
			OrgNameEdt.sendKeys(ORGNAME);
			SaveBtn.click();
		}
		
		
		}
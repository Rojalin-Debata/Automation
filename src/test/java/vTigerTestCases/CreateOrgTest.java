package vTigerTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericUtility.ExcelfileUtility;
import genericUtility.JavaUtility;
import genericUtility.PropertyfileUtility;
import genericUtility.WebdriverUtility;
import objectRepositories.CreateNewOrganizationPage;
import objectRepositories.HomePage;
import objectRepositories.LoginPage;
import objectRepositories.OragnizationInfoPage;
import objectRepositories.OrganizationPage;

public class CreateOrgTest {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= null;
		PropertyfileUtility putil= new PropertyfileUtility();
		ExcelfileUtility eutil= new ExcelfileUtility();
		WebdriverUtility wutil= new WebdriverUtility();
		JavaUtility jutil= new JavaUtility();
		//Fetch Browser Name
		
		String BROWSER = putil.readDatafromPropertyfile("Browser");
		System.out.println(BROWSER);
		//LAUNCH BROWSER
		
		if(BROWSER.equals("Edge")) {
			 driver= new EdgeDriver();
		}
		else if(BROWSER.equals("Chrome")) {
			 driver= new ChromeDriver();
		}
		else if(BROWSER.equals("Firefox")) {
			 driver= new FirefoxDriver();
		}
		else {
			System.out.println("INVALID BROWSER");
		}
		wutil.maximizeWindow(driver);
		wutil.waitForPageLoad(driver);
		String URL=putil.readDatafromPropertyfile("url");
		driver.get(URL);
		// Login to App
		String UN=putil.readDatafromPropertyfile("un");
		String PWD=putil.readDatafromPropertyfile("pwd");
		LoginPage Log = new LoginPage(driver);
		Log.loginToApp(UN, PWD);
		//Create Object of Homepage
		HomePage h = new HomePage(driver);
		h.clickOnOrganizationLink();
		//Click on Organization Look up image
		OrganizationPage org= new OrganizationPage(driver);
		org.clickonCreateOrgLookUpImg();
		
		
		String ORGNAME=eutil.readDatafromExcel("Sheet1", 0, 0);
		CreateNewOrganizationPage oip= new CreateNewOrganizationPage(driver);
		oip.createNewOrganization(ORGNAME + jutil.getRandomnNum());
		
		oip.getSaveBtn();
		
		OragnizationInfoPage oinfo= new OragnizationInfoPage(driver);
		
		String HEADER=oinfo.getHeader();
		
		if(HEADER.contains(ORGNAME)) {
			System.out.println("Organization created and Test case is passed");
		}
		
		HomePage Home = new HomePage(driver);
		Home.logOutOfApp(driver);
		System.out.println("Hi This is the change made by Team Lead");
		
	}

}

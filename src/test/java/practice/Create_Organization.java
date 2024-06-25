package practice;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Create_Organization {
	public static void main(String[] args) {
		//Launch Browser
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Login app with valid credentials
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin",Keys.TAB,"admin", Keys.TAB, Keys.ENTER);
		//Navigate to Organization link
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		//Click on organization look up image
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		//Create Organization with Mandatory Fields
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Molcon");
		driver.findElement(By.xpath("//input[@name='button']")).click();
		//Verify the Heading
		String actH = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(actH.contains("Molcon")) {
			System.out.println("Organization is created and Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		//Logout
		WebElement Admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a= new Actions(driver);
		a.moveToElement(Admin).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}

}

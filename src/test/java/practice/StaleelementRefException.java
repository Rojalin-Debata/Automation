package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleelementRefException {
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		WebElement UN = driver.findElement(By.xpath("//input[@id='user-name']"));
		//refresh the page
		driver.navigate().refresh();
		UN.sendKeys("admin");
		
	}

}

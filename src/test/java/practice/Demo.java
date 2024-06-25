package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}

}

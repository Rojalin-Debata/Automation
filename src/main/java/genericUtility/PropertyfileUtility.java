package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyfileUtility {
	
	public String readDatafromPropertyfile(String Key) throws Throwable {
		FileInputStream fis= new FileInputStream(IconstantUtility.propertypath);
		Properties p= new Properties();
		p.load(fis);
		String value=p.getProperty(Key);
		return value;
		
		
	}

}

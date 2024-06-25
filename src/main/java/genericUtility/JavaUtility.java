package genericUtility;

import java.util.Random;

public class JavaUtility {
	public int getRandomnNum() {
		Random ran= new Random();
		int r= ran.nextInt(100);
		return r;
	}

}

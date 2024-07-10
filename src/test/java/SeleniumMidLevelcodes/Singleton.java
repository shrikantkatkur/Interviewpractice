package SeleniumMidLevelcodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton {

	private static WebDriver driver;
	static {
		driver=new FirefoxDriver();
	}
	private Singleton() {
	}
	public static WebDriver instanceMethod() {
		return driver;
	}

}

package SeleniumMidLevelcodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton {

	private static WebDriver driver;
	static {//to excecute only once
		driver=new FirefoxDriver();
	}
	private Singleton()//to stop inheritence 
	{
	}
	public static WebDriver instanceMethod() {
		return driver;
	}

}

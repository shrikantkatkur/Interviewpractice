package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
	static WebDriver  driver;
	
	public static void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else
			throw new InvalidBroError(browserName);

	}

	public static void main(String[] args) {
		CrossBrowserTesting.openBrowser("gfh");
	}

}

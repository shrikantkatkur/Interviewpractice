package SeleniumMidLevelcodes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Exceptions.InvalidBrowserNameError;

public class CrossBrowserTesting {
	static WebDriver  driver;
	
	public static void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver(); 
		}else if (browserName.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
		} else 
			throw new InvalidBrowserNameError(browserName);

	}
	public static void main(String[] args) throws IOException {
		//Config cnf=new Config();
		//openBrowser(cnf.getBrowserName());
		openBrowser("Chrome");
		System.out.println("opening myntra");
		driver.get("https://www.myntra.com/");
	}
	
}

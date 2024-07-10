package globantinterview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import seleniumBasicCoding.JavaScriptExecuter;

public class JavaScriptExcecuter {

	public static void usingWebdr() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
	}

	public static void usingRemoteWB() {
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.executeScript("window.scrollBy(0,1500)");
		driver.executeScript("window.scrollBy(0,1500)");
		driver.executeScript("window.scrollBy(0,1500)");
	}

	public static void main(String[] args) {
		//JavaScriptExcecuter.usingRemoteWB();
		JavaScriptExcecuter.usingWebdr();
	}

}

package seleniumBasicCoding;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecuter {
	public void usingRemoteWebDriver() {
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.executeScript("window.scrollBy(0,1500)");
		driver.executeScript("window.scrollBy(0,1500)");
		driver.executeScript("window.scrollBy(0,1500)");
		driver.executeScript("window.scrollBy(0,-1500)");//TO SCROLL UP
//JSQUERY TO GET TEXT- return document.querySelector(css selector of element).textContent
		String msg=(String) driver.executeScript("return document.querySelector(\"a[href='/shop/kids']\").textContent");
	//to click
		driver.executeScript("return document.querySelector(\"a[href='/shop/kids']\").click()");
		//driver.executeScript("arguments[0].click()",element);
		//driver.executeScript("scrollToView", element);
	System.out.println(msg);
		}
	
	public void usingWebDriver() {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.myntra.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		jse.executeScript("window.scrollBy(0,1500)");
		jse.executeScript("window.scrollBy(0,-1500)");//TO SCROLL UP
		//jse.executeScript("arguments[0].click()",WebElement e);TO CLICK
		

	}

	public static void main(String[] args) {
		new JavaScriptExecuter().usingRemoteWebDriver();
		//new JavaScriptExecuter().usingWebDriver();
	}

}

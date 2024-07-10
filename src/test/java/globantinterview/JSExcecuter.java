package globantinterview;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSExcecuter {

	public static void main(String[] args) {
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.executeScript("window.scrollBy(0,1500)");
		driver.executeScript("window.scrollBy(0,1500)");
		driver.executeScript("window.scrollBy(0,1500)");
		
	}

}

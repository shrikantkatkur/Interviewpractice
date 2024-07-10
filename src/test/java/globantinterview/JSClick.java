package globantinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSClick {

	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(6000);
	JavascriptExecutor js=((JavascriptExecutor)driver);
	//Method 1-dont use generally
//		js.executeScript("document.getElementById('persistent').click(​)");
	//Method 2-easy to use and work 100%
	WebElement e=driver.findElement(By.xpath("//input[@id=\"persistent\"]"));
	js.executeScript("arguments[0].click()",e);
	
	
	}

}

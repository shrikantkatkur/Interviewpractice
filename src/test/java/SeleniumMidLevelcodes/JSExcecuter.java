package SeleniumMidLevelcodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSExcecuter {

	public static void main(String[] args) {
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		//driver.executeScript("window.scrollBy(0,1500)");
		//driver.executeScript("window.scrollBy(0,1500)");
		//driver.executeScript("window.scrollBy(0,1500)");
		WebElement kids=driver.findElement(By.xpath("//div[@data-reactid=\"14\"]/descendant::a[@data-reactid=\"335\"]"));
		driver.executeScript("arguments[0].click()", kids);
	}

}

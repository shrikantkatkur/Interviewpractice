package seleniumBasicCoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {
public static RemoteWebDriver driver;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("www.myntra.com");
		//driver.get("www.interviewbit.com");
	}

}

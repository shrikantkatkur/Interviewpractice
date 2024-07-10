package seleniumBasicCoding;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class NotificationHandling {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications","--start-maximized","--incognito");
		
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://www.lokmat.com/#vignette");
	}

}

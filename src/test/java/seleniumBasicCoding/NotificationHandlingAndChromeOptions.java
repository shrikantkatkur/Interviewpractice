package seleniumBasicCoding;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationHandlingAndChromeOptions {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();//FirefoxOptions,internetExFirefoxOptions
		option.addArguments("--disable-notifications","--start-maximized","--incognito");
		//To handle SSL or Your Connection is Private Error
		option.setAcceptInsecureCerts(true);
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://www.lokmat.com/#vignette");
	}

}

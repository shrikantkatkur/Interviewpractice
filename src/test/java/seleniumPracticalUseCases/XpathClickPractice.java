package seleniumPracticalUseCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class XpathClickPractice {
	//cradekho -//section[@data-track-component="The most searched cars"]/descendant::ul[@class="gsc-ta-clickWrap "]/li
	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement en = driver.findElement(By.xpath("//div[text()=\"EN\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(en).perform();
		
		List<WebElement> langlist = driver.findElements(By.xpath("//div[@id=\"nav-flyout-icp\"]/descendant::a"));
		for (WebElement lang : langlist) {
			if (lang.getText().contains("PT")) {
				lang.click();
			}

		}

	}

}

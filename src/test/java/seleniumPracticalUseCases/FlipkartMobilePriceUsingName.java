package seleniumPracticalUseCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobilePriceUsingName {

	public static void getPrice(String mobName) {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String price = driver
				.findElement(By.xpath("//div[text()='" + mobName
						+ "']/parent::div/parent::div/child::div[2]/descendant::div[contains(text(),'₹')][1]"))
				.getText();
		System.out.println(price);

	}

	public static void main(String[] args) {
		getPrice("Apple iPhone 14 Plus (Midnight, 128 GB)");
	}

}

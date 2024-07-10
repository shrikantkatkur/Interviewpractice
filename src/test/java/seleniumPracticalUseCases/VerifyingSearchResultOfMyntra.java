package seleniumPracticalUseCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyingSearchResultOfMyntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("Shirts for men", Keys.ENTER);
		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		List<WebElement> productList = driver.findElements(By.xpath("//h4[@class=\"product-product\"]"));
		for (WebElement element : productList) {
			String productTitle = element.getText();
			System.out.println(productTitle);
			if (productTitle.contains("Shirt")) {
				System.out.println("Test Case is Pass");
			} else if (productTitle.contains("Unisex")) {
				System.out.println("Test Case is Pass");
			} else {
				System.out.println("Test Case is FAIL");
			}
		}
		driver.close();

	}
}

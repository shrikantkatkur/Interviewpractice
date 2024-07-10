package seleniumPracticalUseCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GoogleDynamicSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("testing");
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@id=\"Alh6id\"]/descendant::li"));
		System.out.println(suggestionList.size());

		for (WebElement list : suggestionList) {
			String listName = list.getText();
			if (listName.equalsIgnoreCase("testing powder")) {
				System.out.println("clicking on testing shastra ");
				list.click();
			}
		}
	}
}

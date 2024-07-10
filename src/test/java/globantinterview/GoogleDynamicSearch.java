package globantinterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GoogleDynamicSearch {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Pizza");
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@jsname=\"erkvQe\"]/descendant::li"));
		//div[@jsname="erkvQe"]/descendant::li
		//jsname="aajZCb"
		System.out.println(suggestionList.size());
		
		for (WebElement list : suggestionList) {
			System.out.println(list.getText());
			System.out.println(list.getText().contains("pizza"));	
		}
	}
}

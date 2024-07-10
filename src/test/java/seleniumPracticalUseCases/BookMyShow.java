package seleniumPracticalUseCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
//
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/national-capital-region-ncr");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@id=\"common-header-region\"]/span")).click();
		List<WebElement> cities=driver.findElements(By.xpath("//div[@class=\"bwc__sc-ttnkwg-4 Ettpg\"]/ul/li"));
		for(WebElement city:cities) {
			if(city.getText().equalsIgnoreCase("pune")) {
				System.out.println("Found city'");
				city.click();
			}
		}
	}

}

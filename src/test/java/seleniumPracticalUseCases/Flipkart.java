package seleniumPracticalUseCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		List<WebElement> lList=driver.findElements(By.xpath("//div[@class=\"_1Us3XD\"]/ul/a"));
		for(WebElement l:lList) {
			if(l.getText().equalsIgnoreCase("orders")) {
				System.out.println("got orders button'");
				l.click();
			}
		}
	}

}

package ltimindtree2ndround;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmzonTC {

	public static void main(String[] args) {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement en = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(en).perform();
		
		driver.findElement(By.xpath("//span [text() ='Your Orders']")).click();

		}
}

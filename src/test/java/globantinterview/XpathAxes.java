package globantinterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class XpathAxes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);
		fwait.withTimeout(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		WebElement fashion= driver.findElement(By.xpath("(//img[@class=\"_2puWtW _3a3qyb\"])[3]"));
		act.moveToElement(fashion);
		act.perform();
		fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"_1wE2Px\"]/preceding-sibling::div[@class=\"_1UgUYI _2eN8ye\"]/descendant::a[text()='Men Footwear']/ancestor::div[@class=\"_1UgUYI _2eN8ye\"]/child::div[@class=\"_31z7R_\"]/descendant::a[6]")));
		driver.findElement(By.xpath("//div[@class=\"_1wE2Px\"]/preceding-sibling::div[@class=\"_1UgUYI _2eN8ye\"]/descendant::a[text()='Men Footwear']/ancestor::div[@class=\"_1UgUYI _2eN8ye\"]/child::div[@class=\"_31z7R_\"]/descendant::a[6]")).click();
	}

}

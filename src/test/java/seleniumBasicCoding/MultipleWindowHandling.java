package seleniumBasicCoding;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WaitsDemo wait = new WaitsDemo();
		wait.driver.get("https://www.lokmat.com/");
		wait.driver.manage().window().maximize();
		String parentWindow = wait.driver.getWindowHandle();
		wait.driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-fb\"])[1]")).click();
		wait.driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-tw\"])[1]")).click();
		//wait.driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-insta\"])[1]")).click();
		//wait.driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-yt\"])[1]")).click();
		//wait.driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-tg\"])[1]")).click();
		Set<String> allHandles = wait.driver.getWindowHandles();
		for (String handle : allHandles) {
			if (handle.equalsIgnoreCase(parentWindow)) {
				wait.driver.switchTo().window(handle);
				System.out.println("closing parent window");
				wait.driver.close();
			} else {
				//wait.driver.switchTo().window(handle);
				//String windowTtitle = wait.driver.getTitle();
				//System.out.println(windowTtitle);
			}
		}
	}

}

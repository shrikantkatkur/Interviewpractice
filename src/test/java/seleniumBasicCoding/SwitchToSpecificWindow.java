package seleniumBasicCoding;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToSpecificWindow {
	static WebDriver driver;
	public static boolean switchToRightWindow(String windowTilte,List<String> hlist) {
		for (String hl : hlist) {
			String title=driver.switchTo().window(hl).getTitle();
			if(title.contains(windowTilte)) {
				System.out.println("Found right window....");
				return true;
			}
		}
	return false;
		 
	}
	
	public static void switchToParentWindow(String parentWindowHandle ) {
		driver.switchTo().window(parentWindowHandle);
	}
	public void closeAllWindow(String parentWindowHandle,List<String> hlist) {
		for (String h : hlist) {
			if(!h.equals(parentWindowHandle)) {
				driver.switchTo().window(h).close();
			}
			
		}

	}

	public static void main(String[] args) {
		driver= new FirefoxDriver();
		driver.get("https://www.lokmat.com/");
		String parentWindowHandle = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-fb\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-tw\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-yt\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@class=\"mobile-sprite footer-tg\"])[1]")).click();
		Set<String> handles=driver.getWindowHandles();
		List<String> hlist=new ArrayList<String>(handles);
		if(switchToRightWindow("You Tube",hlist)) {
			System.out.println(driver.getCurrentUrl()+" :"+driver.getCurrentUrl());
		}
		switchToParentWindow(parentWindowHandle);
		System.out.println(driver.getCurrentUrl()+" :"+driver.getCurrentUrl());
	}

}

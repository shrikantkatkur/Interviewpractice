package seleniumPracticalUseCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LokmatWindowHandling {
////
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lokmat.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parentWindow=driver.getWindowHandle();
		List<WebElement> socialList=driver.findElements(By.xpath("//div[@id=\"parimary_drawer\"]/descendant::p[@class=\"follow-icons\"]/a"));
		for(WebElement l:socialList) {
			l.click();
		}
		
		Set<String> wHandles=driver.getWindowHandles();
		for(String w:wHandles) {
			if(w.equals(parentWindow)) {
				
			}else {
				String wTitle=driver.switchTo().window(w).getTitle();
				System.out.println(wTitle);
				if(wTitle.contains("Facebook")) {
					driver.switchTo().window(w);
					System.out.println("now on facebook");
					break;
				}
			}
		}
		driver.close();
		System.out.println("closed facebook");
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		System.out.println("switch to lokama again");
		

	}

}

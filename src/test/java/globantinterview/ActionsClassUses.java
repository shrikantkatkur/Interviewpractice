package globantinterview;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class ActionsClassUses {
	WebDriver driver=new ChromeDriver();
	public  void dragDrop() {
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(5000));
		wait.withTimeout(Duration.ofMillis(5000));
		WebElement source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement traget=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		act.dragAndDrop(source, traget);
		act.perform();
		}
	
	public  void actionClassUse() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(5000));
		wait.withTimeout(Duration.ofMillis(5000));
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.moveToElement(mobile);
		//act.click();
		act.contextClick();
		act.perform();
		
	}
	
	

	public static void main(String[] args) {
		ActionsClassUses ac=new ActionsClassUses();
		ac.dragDrop();
		
	}

}

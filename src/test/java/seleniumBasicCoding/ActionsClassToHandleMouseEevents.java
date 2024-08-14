package seleniumBasicCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassToHandleMouseEevents {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		action.doubleClick();
		WebElement kids=driver.findElement(By.xpath("//a[@data-group=\"kids\"]"));
		action.moveToElement(kids);
		//action.click(kids);
		action.contextClick(kids);
		//action.sendKeys(args);
		action.keyDown(Keys.PAGE_DOWN);
		//HOW TO PERFORM CNTL + A
		/*action.keyUp(Keys.CONTROL);
		action.sendKeys("a");
		action.keyDown(Keys.CONTROL);
		action.perform();*/
		
		//action.keyDown(null);
		//action.dragAndDrop(element1,element2);
		//action.contextClick();
		//action.build();
		action.perform();//write without fail,otherwise it will not work
		
		action.mo
		
		
	}

}

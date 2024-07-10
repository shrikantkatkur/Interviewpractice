package seleniumBasicCoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FrameHandling {

	public void frameHandling() throws InterruptedException {
		WaitsDemo wait = new WaitsDemo();
		wait.driver.get("https://www.testingshastra.com/parent-window/");
		wait.driver.manage().window().maximize();
		wait.driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		// driver.findElement(By.xpath("//button[@class=\"pum-close
		// popmake-close\"]")).click();
		// switching inside the frame
		wait.driver.switchTo().frame(0);// using index,Element is present in FRAME
		// driver.switchTo().frame("//iframe[@id=\"frame_1\"]");//using id
		// driver.switchTo().frame("//iframe[@src=\"/assignments-files/frame-handling/innerdom.html\"]");//using
		// WebEelement
		wait.driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Shrikant");
		// switching inside the INNER frame
		wait.driver.switchTo().frame(wait.driver.findElement(By.xpath("//iframe[@id=\"frame-2\"]")));// using
		// xpath,Element is present in INNER FRAME
		// wait.driver.switchTo().frame(0);// using index,Element is present in inside
		// FRAME therfore indexis zero not1 beacuse it is not new frame
		wait.driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("Katkur");
		// switching oustside the INNER frame
		wait.driver.switchTo().parentFrame();
		// wait.fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name=\"ok-btn\"]")));
		// explicit wait not working therfore applyin thread.sleep,not recommended
		Thread.sleep(5000);
		wait.driver.findElement(By.xpath("//button[@name=\"ok-btn\"]")).click();
		String finalMessage = wait.driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(finalMessage);
		//wait.driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		new FrameHandling().frameHandling();
	}

}

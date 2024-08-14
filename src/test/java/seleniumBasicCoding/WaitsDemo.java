package seleniumBasicCoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitsDemo {
	WebDriver driver;
	FluentWait<WebDriver> fwait;
//FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);,to define fluentwait
	public WaitsDemo() {//always define fluentwait in constructor,so thwt we can avoid multiple drivers
		driver = new FirefoxDriver();
		fwait = new FluentWait<WebDriver>(driver);
		fwait.pollingEvery(Duration.ofMillis(250));// 1.it will poll the DOM for every 250msec
		fwait.withTimeout(Duration.ofSeconds(60));// 2.it will wait upto 60 sec,then throw timeout exception
		fwait.ignoring(ElementClickInterceptedException.class);// 3.it will ignore the exception
		fwait.withMessage("Oho element didnt appear in 60 seconds as well");// 4.if timeouts appear it will display the
																			// message
	}

	public void implecitWait() {

		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		// Q1 Write the implicite Wait Syntax-it will only wait for presence of wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Shrikant KATKUR");
		driver.findElement(By.xpath("//button[@id='btn-1']")).click();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);// click me element is not clickable we have to unitl is cliable ,so we have to
									// use explicite wait
	}

	public void explicitWait() {
		// Q2 Write the Explicit Wait Syntax a)Fluent Wait b)Webdriver Wait -it will
		// only wait until for particular state of element
		// tell me the methods of Explicite wait

		driver.get("https://www.testingshastra.com/implicit-wait-demo-assignment/");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Shrikant KATKUR");
		driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn-1']")));// 5.it will wait until
																								// the element is
																								// clickable
		driver.findElement(By.xpath("//button[@id='btn-1']")).click();
		String text1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("//button[@style=\"margin-top: -160px; margin-left: 118px; position: absolute;\"]"))
				.click();
		String text2 = driver.findElement(By.xpath("//p[@id='demo2']")).getText();
		System.out.println(text2);
		driver.close();
	}

	public void main(String[] args) {
		//new WaitsDemo().implecitWait();
		new WaitsDemo().explicitWait();

	}

}

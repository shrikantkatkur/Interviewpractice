package seleniumBasicCoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.navigate().to("https://www.testingshastra.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());
		driver.findElement(By.xpath("//span[text()='Date']")).sendKeys(Keys.F5);
		driver.navigate().back();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.navigate().forward();
		driver.manage().window().fullscreen();
		driver.close();
	}

}

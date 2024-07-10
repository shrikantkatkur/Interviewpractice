package seleniumBasicCoding;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
//aUTHENTICATION ALERT https://userid::password@www.myntra.com
public class AlertHandling {
	public void simpleAlert() {
		WaitsDemo wait = new WaitsDemo();
		wait.driver.get("https://www.testingshastra.com/simple-alert/");
		wait.driver.manage().window().maximize();
		wait.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait.driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		wait.driver.findElement(By.xpath("//input[@id=\"user\"]")).sendKeys("Shrikant");
		wait.driver.findElement(By.xpath("//button[@class=\"card-btn two bold-font\"]")).click();
		Alert alert = wait.driver.switchTo().alert();
		String mesg = alert.getText();
		System.out.println(mesg);
		alert.accept();

	}
		public void promtAlert() throws InterruptedException {
			WaitsDemo wait = new WaitsDemo();
			wait.driver.get("https://www.testingshastra.com/prompt/");
			wait.driver.manage().window().maximize();
			wait.driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
			//wait.fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"card-btn two bold-font\"]")));
			Thread.sleep(3000);
			wait.driver.findElement(By.xpath("//button[@class=\"card-btn two bold-font\"]")).click();
			Alert alert = wait.driver.switchTo().alert();
			alert.sendKeys("Shrikant");
			alert.accept();
			alert.sendKeys("35");
			alert.accept();
			//alert.dismiss();
			String msg=wait.driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
			System.out.println(msg);
		}
		public void confirmationAlert() throws InterruptedException {
			WaitsDemo wait = new WaitsDemo();
			wait.driver.get("https://www.testingshastra.com/confirmation-alert/");
			wait.driver.manage().window().maximize();
			wait.driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
			//wait.fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"card-btn two bold-font\"]")));
			Thread.sleep(3000);
			wait.driver.findElement(By.xpath("//button[@class=\"card-btn two bold-font\"]")).click();
			Alert alert = wait.driver.switchTo().alert();
			alert.accept();
			String msg=wait.driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
			System.out.println(msg);
		}
	

	public static void main(String[] args) throws InterruptedException {
		new AlertHandling().simpleAlert();
		//w AlertHandling().promtAlert();
		//new AlertHandling().confirmationAlert();
	}

}

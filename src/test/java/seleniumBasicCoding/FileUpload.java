package seleniumBasicCoding;

import org.openqa.selenium.By;

public class FileUpload {
//Using AutoIt ,we can handle System Windows
	// Drawback of AutoIt,it only on windows operating system,NOT on Mac,jenkins
	// because os of jenkins is linux
	public static void main(String[] args) throws InterruptedException {
		WaitsDemo wait = new WaitsDemo();
		wait.driver.get("www.interviewbit.com"); 
//		wait.driver.get("https://www.testingshastra.com/file-upload-assignment/");
//		Thread.sleep(2000);
//		wait.driver.manage().window().maximize();
//		wait.driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
//		wait.driver.findElement(By.xpath("//input[@Type=\"File\"]")).sendKeys("D:\\Testing Project Jan 2024\\LATEST RESUME FEB 2024\\ShrikantKatkur_AutomationQA_3.5Years_RESUME.pdf");
		}

}

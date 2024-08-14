package SeleniumMidLevelcodes;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class VerifyDownloadFile {

		public static void main(String[] args) {

			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notifications","--start-maximized");
			RemoteWebDriver driver = new ChromeDriver(options);
			driver.get("https://www.jenkins.io/download/#downloading-jenkins");
			driver.findElement(By.xpath("//a[@href=\"https://get.jenkins.io/war-stable/2.452.3/jenkins.war\"]")).click();
			String downloadPath = "C:\\Users\\Downloads";
			String fileName = "jenkins.war";

			File file = new File(downloadPath, fileName);

			FluentWait<File> wait = new FluentWait<File>(file);
			wait.pollingEvery(Duration.ofMillis(500));
			wait.withTimeout(Duration.ofMinutes(3));
			wait.ignoring(Exception.class);
			wait.withMessage("file is not downloaded");

			boolean isDownLoaded = wait.until(g -> g.exists() && g.canRead());
			
			if(isDownLoaded) {
				System.out.println("complete 100% downloaded");
			}else
				System.out.println("not downloaded");

		}

	}



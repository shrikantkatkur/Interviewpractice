package SeleniumMidLevelcodes;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.utils.FileUtil;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot1 {
//RC-createScreenCapture(rect);
//AT-takeScreenshot(driver),
//SG-getScreenshotAs(OutputType.FILE);
	public static void usingAShot() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		AShot ashot=new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot sc= ashot.takeScreenshot(driver);
		BufferedImage image= sc.getImage();
		ImageIO.write(image, "jpg", new File("shrikant.jpg"));
		driver.close();
	}

	public static void usingRobot() throws AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Robot robo = new Robot();
		Rectangle rect = new Rectangle();
		rect.width = 1920;
		rect.height = 1080;
		BufferedImage image = robo.createScreenCapture(rect);
		ImageIO.write(image,"jpg", new File("RobotScreenshot1.jpg"));
		driver.close();
	}

	public static void usingSelenium() throws IOException {
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); if we use Webdriver
		File file=driver.getScreenshotAs(OutputType.FILE);//OutputType.FILE
		FileUtils.copyFile(file, new File("usingSelenium.jpg"));//FileUtils.copyFile
		driver.close();
	}

	public static void main(String[] args) throws IOException, AWTException {
		 usingAShot();
		// usingRobot();
		//usingSelenium();

	}
}

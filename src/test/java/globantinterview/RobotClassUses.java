package globantinterview;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class RobotClassUses {
	
		public void takeScrenShotUsingRobot()throws AWTException, IOException   {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.pollingEvery(Duration.ofMillis(5000));
			wait.withTimeout(Duration.ofMillis(5000));
			Robot robo=new Robot();
			Rectangle rec=new Rectangle();
			rec.height=1920;
			rec.width=1080;
		BufferedImage image=robo.createScreenCapture(rec);
		ImageIO.write(image, "png", new File("Ttesingbuddies.png"));

		}
		public void actionClassUse() throws AWTException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Robot robot=new Robot();
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.pollingEvery(Duration.ofMillis(5000));
			wait.withTimeout(Duration.ofMillis(5000));
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.mouseMove(400,400);
			robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
			robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK);
			//robot.mousePress(MouseEvent.BUTTON2_MASK);
			//robot.mouseRelease(MouseEvent.BUTTON2_MASK);
		}

	

	public static void main(String[] args) throws AWTException, IOException {
		
		RobotClassUses rb=new RobotClassUses();
		rb.takeScrenShotUsingRobot();
	}

}

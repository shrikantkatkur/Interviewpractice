package seleniumBasicCoding;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import javax.imageio.ImageIO;

public class RobotClassUses {
//Best Suited for Keyboard Events--keypress,KeyRelease,Mousemove
	WaitsDemo wait = new WaitsDemo();
	
	private void useTAB(int keyTohandle) throws AWTException {
		wait.driver.get("https://www.myntra.com/");
		wait.driver.manage().window().maximize();
		Robot robot=new Robot();                   
		//keyTohandle=KeyEvent.VK_TAB;
		robot.keyPress(keyTohandle);
		robot.keyRelease(keyTohandle);
		robot.keyPress(keyTohandle);
		robot.keyRelease(keyTohandle);
	}
	public void robotScreenshot() throws AWTException, IOException {
		wait.driver.get("https://www.myntra.com/");
		wait.driver.manage().window().maximize();
		Robot robot =new Robot();
		Rectangle rect=new Rectangle();
		rect.width=1920;
		rect.height=1080;
		BufferedImage image=robot.createScreenCapture(rect);
		ImageIO.write(image, "jpg",new File("Output.jpg"));
		wait.driver.close();


	}
	private void mouseMove(int x,int y) throws AWTException {
		wait.driver.get("https://www.myntra.com/");
		wait.driver.manage().window().maximize();
		Robot robot=new Robot();
		robot.mouseMove(x, y);
		robot.mousePress(MouseEvent.ALT_DOWN_MASK);
		robot.mouseRelease(MouseEvent.ALT_DOWN_MASK);
	}
	public static void main(String[] args) throws AWTException, IOException {
		RobotClassUses rb= new RobotClassUses();
		//rb.mouseMove(1000,200);
		//rb.useTAB(KeyEvent.VK_TAB);
		rb.robotScreenshot();
	}

}

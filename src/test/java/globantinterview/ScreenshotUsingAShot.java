package globantinterview;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotUsingAShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		AShot ashot=new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(1500));
		Screenshot sc=ashot.takeScreenshot(driver);
		BufferedImage image=sc.getImage();
		ImageIO.write(image, "jpg",new 	File("BuddiesASHOT.jpg"));
		driver.close();

	}

}

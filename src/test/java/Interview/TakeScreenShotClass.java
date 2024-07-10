package Interview;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenShotClass {
	RemoteWebDriver driver = new ChromeDriver();
	
	public void usingAshot() {
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(3000));
		Screenshot sc = ashot.takeScreenshot(driver);
		BufferedImage image = sc.getImage();
		try {
			ImageIO.write(image, "jpg", new File("result10.06.2024.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	public void usingSELENIUM() {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.getScreenshotAs(output.f));
	}

	public static void main(String[] args) {
		TakeScreenShotClass tc = new TakeScreenShotClass();
		tc.usingAshot();
	}

}

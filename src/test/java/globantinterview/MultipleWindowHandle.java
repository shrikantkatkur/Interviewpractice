package globantinterview;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class MultipleWindowHandle {

	public static void multipleWindowHandle() {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d);

		d.get("https://www.lokmat.com/");
		String originalwindow = d.getWindowHandle();
		wait.withTimeout(Duration.ofSeconds(30));
		wait.withMessage("Oh element not appeared within stipulated time");
		wait.pollingEvery(Duration.ofMillis(250));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(By.xpath("(//a[@title=\"facebook\"])[1]")).click();
		d.findElement(By.xpath("(//a[@title=\"twitter\"])[1]")).click();
		d.findElement(By.xpath("(//a[@title=\"instagram\"])[1]")).click();
		d.findElement(By.xpath("(//a[@title=\"youtube\"])[1]")).click();
		
		Set<String> allwindow = d.getWindowHandles();
		for (String w : allwindow) {
			if (originalwindow.equalsIgnoreCase(w)) {
				System.out.println("original window");
				
			} else {
				d.switchTo().window(w);
				String title = d.getTitle();
				System.out.println(" windows Title "+title);
				if (title.contains("youtube")) {
					d.switchTo().window(w);
					System.out.println(d.getCurrentUrl());
					break;
				}	
			}
		}
		d.close();
		d.switchTo().window(originalwindow);
		System.out.println(d.getTitle());
	}

	public static void main(String[] args) {
		multipleWindowHandle();
	}
}

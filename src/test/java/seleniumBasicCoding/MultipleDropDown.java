package seleniumBasicCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	static WebDriver driver;

	public static void selectOptionFromDropDown(WebElement element, String value) {
		Select drp = new Select(element);
		List<WebElement> allOption = drp.getOptions();
		for (WebElement option : allOption) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}

		}

	}

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//div[@id='popmake-22568']//button[@class='pum-close popmake-close' and @type='button']"))
				.click();
		WebElement courses = driver.findElement(By.xpath("//select[@id='input_5_4']"));
		selectOptionFromDropDown(courses,"Automation Testing (Python Selenium)");

	}

}

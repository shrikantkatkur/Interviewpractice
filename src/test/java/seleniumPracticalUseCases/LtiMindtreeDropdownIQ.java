package seleniumPracticalUseCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LtiMindtreeDropdownIQ {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// driver.get("https://www.testingshastra.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Select catList = new Select(element);
		List<WebElement> allOptions = catList.getOptions();
		List<String> actList = new ArrayList<>();
		

		// CONVERTING List<WebElement> into List<String>
		for (WebElement option : allOptions) {
			actList.add(option.getText());
		}
		Collections.sort(actList);
		System.out.println(actList);

		ArrayList<String> expList = new ArrayList<String>(Arrays.asList("All Categories", "Alexa Skills",
				"Amazon Devices", "Amazon Fashion", "Amazon Pharmacy", "Appliances", "Apps & Games",
				"Audible Audiobooks", "Baby", "Beauty", "Books", "Car & Motorbike", "Clothing & Accessories",
				"Collectibles", "Computers & Accessories", "Deals", "Electronics", "Furniture", "Garden & Outdoors",
				"Gift Cards", "Grocery & Gourmet Foods", "Health & Personal Care", "Home & Kitchen",
				"Industrial & Scientific", "Jewellery", "Kindle Store", "Luggage & Bags", "Luxury Beauty",
				"Movies & TV Shows", "MP3 Music", "Music", "Musical Instruments", "Office Products", "Pet Supplies",
				"Prime Video", "Shoes & Handbags", "Software", "Sports, Fitness & Outdoors", "Subscribe & Save",
				"Tools & Home Improvement", "Toys & Games", "Under ₹500", "Video Games", "Watches"));
		//Collections.sort(expList);
		//Assert.assertEquals(actList, expList);
		System.out.println(actList.equals(expList));
		driver.close();
		
	}
	
	

}

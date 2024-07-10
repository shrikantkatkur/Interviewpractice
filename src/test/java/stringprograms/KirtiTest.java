package stringprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KirtiTest {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("testing");
	
		/*String s = "nitin";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is NOT Palindrome");
		}*/


	}
}

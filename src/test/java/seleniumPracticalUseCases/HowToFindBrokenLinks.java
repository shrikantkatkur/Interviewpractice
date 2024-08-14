package seleniumPracticalUseCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToFindBrokenLinks {
	
	public static void main(String[] args) throws IOException
	{

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();

			List<WebElement> links = driver.findElements(By.tagName("a"));
			//As we know all links will have tagname as a so we are locating each one of them
			int links_Count = links.size();
			//calculating the size of each links
			System.out.println("Total Links are ->"+links_Count);

			for(int i = 0; i<links_Count; i++)
			{
				WebElement eachLink = links.get(i);
				String url = eachLink.getAttribute("href");
				//all the links will have one thing in common that is their attribute name href
				verify_links(url);
				//calling  a method called verify_links
				System.out.println(url);
			}
		}

		public static void verify_links(String url) throws IOException
		{
			URL ul = new URL(url);
	//Creating an Object of URL class
			HttpURLConnection c = (HttpURLConnection) ul.openConnection();
	//upcasting to HttpURLConnection Interface
			c.connect();
			if(c.getResponseCode() == 200)
			{
				System.out.println(c.getResponseCode()+" -> "+c.getResponseMessage()+" -> "+"Link is valid");
			}
			else
			{
				System.out.println(c.getResponseCode()+" -> "+c.getResponseMessage()+" -> "+"Link is Invalid");
			}
		}
}


	

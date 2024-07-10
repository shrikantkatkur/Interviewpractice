package seleniumBasicCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusDatePicker {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		String year="2025";
		String month="Jan";
		String date="26";
		while (true) {
			String data=driver.findElement(By.xpath("//div[@class=\"DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr\"]//div[2]")).getText();
			String[] arr=data.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			if(mon.equals(month)&& yr.equals(yr))
				break;
			else 
				driver.findElement(By.xpath("(//div[@class=\"DayNavigator__IconBlock-qj8jdz-2 iZpveD\"])[3]")).click();//clciking on <
		}
		driver.findElement(By.xpath("//span[normalize-space()="+date+"]")).click();

	}

}

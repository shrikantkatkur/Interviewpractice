package SeleniumMidLevelcodes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws IOException {
		Config con = new Config();
		System.out.println(con.getAppUrl());
		System.out.println(con.getBrowserName());
		System.out.println(con.getEmail());
	}

}

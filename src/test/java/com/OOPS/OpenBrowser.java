package com.OOPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	static WebDriver  driver;

	public static void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.myntra.com/");
		} else
			throw new InvalidBrowserException(browserName);

	}

	public static void main(String[] args) {
		openBrowser("firefox12");
	}

}

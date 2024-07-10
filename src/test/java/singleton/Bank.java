package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bank {
	 static Bank b;
	static {
		b=new Bank();
	}
	public Bank() {
		
	}
	public static Bank instanceMethod() {
		return b;
	}
}
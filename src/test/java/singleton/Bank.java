package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bank {
	 static Bank b;
	static {
		b=new Bank();
	}
	public Bank() {//to stop inheritence,cant value
		// code, useless code
	}
	
	public int addition(int a,int b) {
		int result=a+b;
		return result;
	}
	public static Bank instanceMethod() {
		return b;
	}
}
package javaBasicMathCoding;

public class LeapYear {
	// conditions for leap year
	// 1. divisible by 400 and 4 ,but not divisble by 100
	public static void checkLeapYear(int year) {
		if ((year%400==0)||(year%4==0 && year%100!=0)) {
			System.out.println(year + " is  a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

	public static void main(String[] args) {
		checkLeapYear(2008);
	}

}

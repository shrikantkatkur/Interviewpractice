package rdautomationprograms;

public class I7LeapYear {

	public static void isLeapYear(int year) {
		// conditions for leap year
		// 1. divisible by 400 and 4 ,but not divisble by 100
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " is  a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

	public static void main(String[] args) {
		isLeapYear(3000);
	}

}

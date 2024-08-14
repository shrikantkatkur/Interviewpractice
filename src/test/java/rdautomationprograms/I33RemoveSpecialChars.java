package rdautomationprograms;

import java.util.Scanner;

public class I33RemoveSpecialChars {

	public static void removeSpecialChars(String s) {
		String s1 = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s1);
	}

	public static void printSpecialChars(String s) {
		String s1 = s.replaceAll("[A-Za-z0-9]", "");
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		String s = "Shri$^&$%*^$askant";
		removeSpecialChars(s);
		printSpecialChars(s);
	}

}

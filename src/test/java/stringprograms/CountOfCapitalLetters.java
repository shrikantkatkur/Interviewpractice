package stringprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOfCapitalLetters {

	public static void countCapital() {
		String s = "aeA1FGHL253ou";
		String count="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count=count+s.charAt(i);
			}
		}
		System.out.println(count.length());
	}
	
	public static void removeNumberFromString() {
		String s = "45764SHRI78KANT";
		String output="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
				continue;
			}else {
				output=output+s.charAt(i);
			}
		}
		System.out.println(output);
	}
	
	public static void printNumberFromString() {
		String s = "45764SHRI78KANT";
		String output="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
				output=output+s.charAt(i);
				
			}else {
				continue;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		removeNumberFromString();
		countCapital();
		printNumberFromString();
	}
}

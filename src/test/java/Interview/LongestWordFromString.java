package Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LongestWordFromString {

	public static void stringSubsetOccuerence(String str) {
		String[] words = str.split(" ");
		String longword="";
		for (String word : words) {
			if(word.length()>longword.length()) {
				longword=word;
			}
		}
		System.out.println(longword);
		
	}

	public static void main(String[] args) {
		LongestWordFromString.stringSubsetOccuerence("M5asdjkjadjlaksjdlsa namefgghgfh is Shg Kkat56");
	}

}

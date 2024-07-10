package stringprograms;

import java.util.Scanner;

  class CountWordInString {
	public static void countWord(String s) {
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println("No of words in String :" + count);

	}
	
	public static  void usingSplit(String s) {
		String[] words=s.split(" ");
		System.out.println(words.length);

	}

	public static void main(String[] args) {
		CountWordInString.countWord("My name");
		usingSplit("My name is shrikant");
	}
}

package javaBasicMathCoding;

import java.util.Arrays;

public class AnagramPairs {
//Anagram means string with same no of char,with same letters with meaningful word,that pair is called anagram pairs
	//ex CAT&ACT.LISTEN &SILENT
			public static boolean isAnagram(String str1,String str2) {
				str1=str1.replaceAll(" ", "").toLowerCase();
				str2=str2.replaceAll(" ", "").toLowerCase();
				if(str1.length()!=str2.length()) {
					return false;
				}
				else {
					char[] ch1=str1.toCharArray();
					char[] ch2=str2.toCharArray();
					Arrays.sort(ch1);
					Arrays.sort(ch2);
					return ch1.equals(ch2);
				}
				

			}
	public static void main(String[] args) {
		System.out.println(isAnagram("AC T","cat"));
		System.out.println(isAnagram("RAM","MAr "));
		System.out.println(isAnagram("ACT12","cat"));
		System.out.println(isAnagram("SILENT","LITSEN"));

	}

}

package mustdohandon;

import java.util.Arrays;

public class AnagramPairs {
//Anagram means string with same no of char,with same letters with meaningful word,that pair is called anagram pairs
	//ex CAT&ACT.LISTEN &SILENT
	
	
	public static boolean isAnagram(String s1,String s2) {
		
		String str1 =s1.replaceAll(" ", "").toLowerCase();
		String str2=s2.replaceAll(" ", "").toLowerCase();
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
		char c1[]=str1.toCharArray();
		char c2[]=str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("AC T","cat"));
		System.out.println(isAnagram("RAM","MAr "));
		System.out.println(isAnagram("ACT12","cat"));
		System.out.println(isAnagram("SILENT","LITSEN"));

	}

}

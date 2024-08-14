package rdautomationprograms;

import java.util.Arrays;

public class I35Anagram {
	public static boolean isAnagram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);

	}

	public static void main(String[] args) {
		boolean res = isAnagram("act", "cat");
		System.out.println(res);
	}
}

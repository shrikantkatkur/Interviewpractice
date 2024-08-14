package stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class ToRemoveDupCharFromString {

	public static void main(String[] args) {

		// 1.approach using Set Interface
		String str1 = "momimmggg1233";
		Set<Character> set = new LinkedHashSet();
		for (int i = 0; i < str1.length(); i++) {
			set.add(str1.charAt(i));
		}
		String s = "";
		for (Character ch : set) {
			s = s + ch;
		}
		System.out.println(s);
		System.out.println(set);

	}

}

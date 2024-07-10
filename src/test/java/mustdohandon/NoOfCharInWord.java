package mustdohandon;

import java.util.HashMap;

public class NoOfCharInWord {

	public static void main(String[] args) {
		String s = "Shrikantt";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			} else {
				charMap.put(c, 1);
			}

		}
		System.out.println(charMap);

	}

}

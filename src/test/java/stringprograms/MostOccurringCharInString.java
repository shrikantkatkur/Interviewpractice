package stringprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostOccurringCharInString {
	public static void usingForLoop(String s) {
		
		char mostFrequentChar = ' ';
		int maxCount = 0;
		char[] chr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			char c = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (c == chr[j]) {
					count++;
					chr[j] = 0;
				}
			}
			if (count > 0) {
				//System.out.println(c +"=" + count);
			}
			if(count>maxCount) {
				maxCount=count;
				mostFrequentChar=c;
			}
			
			}
		System.out.println("Most occured char is "+mostFrequentChar);

	}

	public static void getMostFrequentCharacter(String s) {
		s = s.toLowerCase();
		char[] chr = s.toCharArray();
		Map<Character, Integer> cMap = new LinkedHashMap<Character, Integer>();
		for (Character c : chr) {
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				cMap.put(c, 1);
			}
		}
		// System.out.println(cMap);
		char mostFrequentChar = 0;
		int maxCount = 0;
		// Set<Entry<Character, Integer>> es = cMap.entrySet();
		for (Map.Entry<Character, Integer> entry : cMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				mostFrequentChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		System.out.println("The most frequent character is: " + mostFrequentChar);
	}

	public static void main(String[] args) {
		// getMostFrequentCharacter("ajhsdjkkkkkkkkahdajd");
		usingForLoop("ajhsdjkkkkkkkkahdajd");

	}

}

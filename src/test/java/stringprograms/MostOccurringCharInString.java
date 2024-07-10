package stringprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostOccurringCharInString {

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
//		String s="TestingmmMMMM";
//		s=s.toLowerCase();
//		int result =s.length()-s.replaceAll("t","").length();
//		System.out.println("Character m "+"occures "+result+" times");
		// usingHashMap("TestingmmMMMM");
		getMostFrequentCharacter("ajhsdjkkkkkkkkahdajd");

	}

}

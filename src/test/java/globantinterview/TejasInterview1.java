package globantinterview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TejasInterview1 {
	public static void noOfChar(String s) {
		// s1=s.split(" ");
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		System.out.println(map);

	}

	public static void noOfWords(String s) {
		String [] s1=s.split(" ");		
		System.out.println("No of Words in String are " + s1.length);
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
		char mostFrqChar =' ';
		int maxCount = 0;
		for (Map.Entry<Character, Integer> e : cMap.entrySet()) {
			if (e.getValue() > maxCount) {
				maxCount = e.getValue();
				mostFrqChar = e.getKey();
			}
		}

		System.out.println("The most frequent character is: " + mostFrqChar);
	}

	public static void main(String[] args) {
		 TejasInterview1.noOfWords("hellllllo world this varsha");
		TejasInterview1.noOfChar("hellllllo world this varsha");
		TejasInterview1.getMostFrequentCharacter("hellllllo world this varsha");

	}

}

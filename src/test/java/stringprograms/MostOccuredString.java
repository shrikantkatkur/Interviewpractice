package stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostOccuredString {
	public static void getMostFrequentString(String [] s) {
		
		Map<String, Integer> cMap = new LinkedHashMap<String, Integer>();
		for (String c : s) {
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				cMap.put(c, 1);
			}
		}
		// System.out.println(cMap);
		String mostFrequentString = "";
		int maxCount = 0;
		// Set<Entry<Character, Integer>> es = cMap.entrySet();
		for (Map.Entry<String, Integer> entry : cMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostFrequentString = entry.getKey();
			}
		}
		System.out.println("The most frequent String is: " + mostFrequentString);
	}

	public static void main(String[] args) {
//		String s="TestingmmMMMM";
//		s=s.toLowerCase();
//		int result =s.length()-s.replaceAll("t","").length();
//		System.out.println("Character m "+"occures "+result+" times");
		// usingHashMap("TestingmmMMMM");
		String [] s= {"java","java","c++","c"};
		getMostFrequentString(s);

	}
	

}

package mustdohandon;

import java.util.HashMap;

public class RepeatedWordsInSentence {

	public static void main(String[] args) {
		String s = "I Love My India My Love I";
		String[] words = s.split(" ");
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String c : words) {
			if (wordMap.containsKey(c)) {
				wordMap.put(c,wordMap.get(c)+1);
			} else {
				wordMap.put(c, 1);
			}
		}
		
		System.out.println(wordMap);

	}
}

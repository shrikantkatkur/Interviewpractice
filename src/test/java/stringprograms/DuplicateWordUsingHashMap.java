package stringprograms;

import java.util.HashMap;

public class DuplicateWordUsingHashMap {
	

	public static void main(String[] args) {
		String[] x= {"Shrikant","Kavita","shri","Supriya","Suhasini","Supriya","Kavita","Kavita","Shrikant"};
		HashMap<String,Integer> wordMap=new HashMap<String,Integer>();
		int count=0;
		for (String s : x) {
			if(wordMap.containsKey(s)) {
				wordMap.put(s, wordMap.get(s)+1);
				count++;
			}else {
				wordMap.put(s,1);
			}
			
		}
		for (String word : wordMap.keySet()) {
		if(wordMap.get(word)>1) {
			System.out.println(word);
			
		}
		}
	}


}

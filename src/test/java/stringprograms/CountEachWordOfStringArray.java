package stringprograms;

import java.util.HashMap;

public class CountEachWordOfStringArray {

	public static void main(String[] args) {
		String[] x= {"Shrikant","Kavita","Supriya","Suhasini","Shrikant","Kavita"};
		HashMap<String,Integer> wordMap=new HashMap<String,Integer>();
	
		for (String string : x) {
			if(wordMap.containsKey(string)) {
				wordMap.put(string, wordMap.get(string)+1);
				}
			else {
				wordMap.put(string,1);
			}
			
		}
		System.out.println(wordMap);
	
		}
}

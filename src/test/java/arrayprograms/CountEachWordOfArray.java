package arrayprograms;

import java.util.HashMap;

public class CountEachWordOfArray {

	public static void main(String[] args) {
		String[] x= {"Shrikant","Kavita","Supriya","Suhasini","Shrikant","Kavita"};
		HashMap<String,Integer> wordMap=new HashMap<String,Integer>();
	
		for (String s : x) {
			if(wordMap.containsKey(s)) {
				wordMap.put(s, wordMap.get(s)+1);
				}
			else {
				wordMap.put(s,1);
			}
			
		}
		System.out.println(wordMap);
	
		}
}

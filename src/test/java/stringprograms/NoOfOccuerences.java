package stringprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfOccuerences {

	public static void usingForloop(String s) {
		char[] chr=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=0;
			char c=s.charAt(i);
			for(int j=0;j<s.length();j++) {
				if(c==chr[j]) {
					count++;
					chr[j]=0;
				}	
			}
			if(count>0) {
				System.out.println(c+"="+count);
			}
		}

		}

	public static void usingHashMap(String s) {
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
		System.out.println(cMap);
	}

	public static void main(String[] args) {
//		String s = "TestingmmMMMM";
//		s = s.toLowerCase();
//		int result = s.length() - s.replaceAll("t", "").length();//to find specific char occuerence
//		System.out.println("Character m " + "occures " + result + " times");
		//usingHashMap("TestingmmMMMM");
		usingForloop("tessssssting");

	}

}

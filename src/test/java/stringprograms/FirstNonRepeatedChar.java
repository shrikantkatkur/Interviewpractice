package stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
	
	public static void usingRegular(String str) {
		for (int i = 0; i < str.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		
	}

	public static void usingHashMap(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	      for(Entry<Character, Integer>e: map.entrySet()) {
	    	  if(e.getValue()==1) {
	    		  System.out.println(e.getKey());
	    		  break;
	    	  }
	      }
	}

	public static void main(String[] args) {
		usingRegular("AABCDBMMQCDO");
		usingHashMap("ABamACDDDDDD");
	}

}

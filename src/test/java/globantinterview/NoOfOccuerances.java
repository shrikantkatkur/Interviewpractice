package globantinterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NoOfOccuerances {

	public static void noOfOccurence(String s) {
		char[] ch = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}
	public static void main(String [] args){
		NoOfOccuerances.noOfOccurence("shrikantTT");
	}
}
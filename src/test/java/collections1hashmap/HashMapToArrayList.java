package collections1hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		Map<String,Integer> rollMap=new HashMap<String,Integer>();
		rollMap.put("Shrikant", 11);
		rollMap.put("svk", 30);
		rollMap.put("svk", 20);
		rollMap.put("kant", 20);
		System.out.println(rollMap);
		//how to convert Hashmap key  into ArrayList
		List<String> keyal= new ArrayList<String>(rollMap.keySet());
		for (String string : keyal) {
			System.out.println(string);
		}
		
		//how to convert Hashmap Value  into ArrayList
		List<Integer> valuelist= new ArrayList<Integer>(rollMap.values());
		for (Integer i : valuelist) {
			System.out.println(i);
		}
	}

}

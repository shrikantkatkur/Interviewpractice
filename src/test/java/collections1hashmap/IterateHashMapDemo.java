package collections1hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> rollMap=new HashMap<String,Integer>();
		//Stores value in key and value
		//Dont allow duplicate keys,but duplicates values are allowed
		//dosent preserves insertion order
		rollMap.put("Shrikant", 11);
		rollMap.put("svk", 30);
		rollMap.put("svk", 20);
		rollMap.put("kant", 20);
		rollMap.put("Shrit", 17);
		rollMap.put("Shrit123", 1);
		System.out.println(rollMap);
		//How to iterate Hashmap 1. using iterator
		Iterator<String> itr=rollMap.keySet().iterator();//dont apply iterator directly on map,first on keyset,then apply iterator
		while(itr.hasNext()) {
			String key=itr.next();
			Integer value=rollMap.get(key);
			System.out.println("Value: "+value+"Key: "+key);
		}
		System.out.println("-----");
		//How to iterate Hashmap 2. using entryset
		Set<Entry<String, Integer>> entry=rollMap.entrySet();
		for (Entry<String, Integer> e : entry) {//use foreach loop 
			System.out.print(e+",");
		}
		System.out.println("-----");
		
		//How to iterate Hashmap 3. using foreach and lamda->	very famous
						System.out.println("-----");
				 rollMap.forEach((k,v) ->System.out.print("Key:"+k+"," +"Value:"+v));
				}
	
	}




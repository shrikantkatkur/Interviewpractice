package collections1hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ComapareHashmaps {

	public static void main(String[] args) {
		//1. sort collections and then use sort 
				Map<String,Integer> map1=new HashMap<String, Integer>();
				map1.put("A",1);
				map1.put("B",2);
				map1.put("C",3);
				Map<String,Integer> map2=new HashMap<String, Integer>();
				map2.put("A",1);
				map2.put("B",2);
				map2.put("C",3);
				Map<String,Integer> map3=new HashMap<String, Integer>();
				map3.put("A",1);
				map3.put("B",2);
				map3.put("C",3);
				map3.put("C",4);
				//1.Compare entire Hashmap
				System.out.println(map1.equals(map2));
				System.out.println(map1.equals(map3));
				// compare only keyset
				System.out.println(map1.keySet().equals(map2.keySet()));
				System.out.println(map1.keySet().equals(map3.keySet()));
				// compare only value
				System.out.println(map1.values().equals(map2.values()));
				System.out.println(map1.values().equals(map3.values()));
				//HOW TO FIND EXTRA KEY
				Map<String,Integer> map4=new HashMap<String, Integer>();
				map3.put("A",1);
				map3.put("B",2);
				map3.put("C",3);
				map3.put("D",4);
				//USE HASHSET
				Set<String> hs=new HashSet<String>(map1.keySet());
				hs.addAll(map4.keySet());
				hs.removeAll(map1.keySet());
				System.out.println(hs);
				
				
	}

}

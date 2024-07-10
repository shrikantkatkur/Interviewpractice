package collections1hashmap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysOfCreatingHashMap {
	public static Map<String,Integer> map1;
	static {
		map1=new HashMap<String, Integer>();
		map1.put("Shrikant", 1);
		map1.put("Sanavi", 2);
	}

	public static void main(String[] args) {
		//1.0 using HashMap Classs
		Map<String,Integer> rollMap=new HashMap<String,Integer>();
		rollMap.put("Shrikant", 11);
		rollMap.put("svk", 30);
		rollMap.put("svk", 20);
		System.out.println(rollMap);
		//2.0 using static hashmap
		System.out.println(WaysOfCreatingHashMap.map1);
		//3.0 Immutable map with one single entry
		Map<String,Integer> map2=Collections.singletonMap("Svk", 10);
		//map2.put("ss",20);//UnsupportedOperationException,we can only one element
		System.out.println(map2);
		//4.0 using Simple Entry
		//5.0 how to create multimap
		//Map<String,Integer> multimap=Map.of("k1",1,"k1","k1",2,"k1",3);
		

	}

}

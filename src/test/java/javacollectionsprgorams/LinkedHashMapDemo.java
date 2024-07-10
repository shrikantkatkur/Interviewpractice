package javacollectionsprgorams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> rollMap=new LinkedHashMap<String,Integer>();
		//Stores value in key and value
		//Dont allow duplicate keys,but duplicates values are allowed
		//Maintain Insertion order
		rollMap.put("Shrikant", 11);
		rollMap.put("Svk", 30);
		rollMap.put("Svk", 20);
		rollMap.put("Kant", 20);
		rollMap.put("Ahrit", 17);
		rollMap.put("Shrit123", 1);
		System.out.println(rollMap);
	}

}

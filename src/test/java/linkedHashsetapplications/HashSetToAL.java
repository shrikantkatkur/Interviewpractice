package linkedHashsetapplications;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashSetToAL {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(11);
		hs.add(30);
		hs.add(20);
		List<Integer> al= new ArrayList<Integer>(hs);
		
		System.out.println(al);
		
	

	}

}

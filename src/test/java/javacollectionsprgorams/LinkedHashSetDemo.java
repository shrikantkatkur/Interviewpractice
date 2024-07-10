package javacollectionsprgorams;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Main diff bet hashset and linkedhashset is hashset not presereved inserntion order and linked hashset preserer insersition order
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();// Homogeneous object can store
		hs.add(10);
		hs.add(10);
		hs.add(15);
		hs.add(35);
		hs.add(25);
		System.out.println(hs);//preserves insertion order whereas in hashset insertion order not preserev
		System.out.println(hs.contains(15));
		System.out.println(hs.isEmpty());
		// how to read Hashset
		for (Integer integer : hs) {
			System.out.print(integer + ";");
		}
		System.out.println();
		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

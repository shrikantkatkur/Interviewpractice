package javacollectionsprgorams;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Main diff bet hashset and treeset is hashset not sorted and Treeset is sorted
		TreeSet<Integer> hs = new TreeSet<Integer>();// Homogeneous object can store
		hs.add(10);
		hs.add(10);
		hs.add(15);
		hs.add(35);
		hs.add(25);
		System.out.println(hs);// sorted order whereas in hashset insertion order not preserev
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

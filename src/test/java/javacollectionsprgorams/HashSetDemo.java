package javacollectionsprgorams;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
//Duplicates are NOT ALLOWED,Insertion order not maintained
	public static void main(String[] args) {
		// types of constructors of HashSet
		// 1.0 HashSet hs=new HashSet();//Default capacity 16 and load factor is 0.75
		// 2.0 HashSet hs1=new HashSet(20);//Initial capacity 20 and load factor is 0.75
		// 3.0 HashSet hs2=new HashSet(30,(float)0.90);//Default capacity 30 and load
		// factor is 0.90
		Set<Integer> hs = new TreeSet<Integer>();// Homogeneous object can store
		hs.add(10);
		hs.add(16);
		hs.add(15);
		hs.add(35);
		hs.add(35);
		hs.add(25);
		System.out.println(hs);
		System.out.println(hs.contains(15));
		System.out.println(hs.isEmpty());
		// how to read Hashset
		for (Integer integer : hs) {
			System.out.print(integer + ";");
		}
		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		HashSet<Integer> hs1 = new HashSet<Integer>();// Homogeneous object can store
		hs1.add(101);
		hs1.add(103);
		hs1.add(102);
		hs1.add(102);
		hs1.add(102);
		hs.addAll(hs1);
		System.out.println("Union:"+hs);
		//hs.removeAll(hs1);//removes common elements
		//System.out.println(hs);
		System.out.println(hs.containsAll(hs1));
		 hs.retainAll(hs1);//remove uncommon elements
		 System.out.println(hs);

	}

}

package javacollectionsprgorams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 1.Default Generics-Not recommended
		ArrayList al = new ArrayList(20);
		System.out.println(al.size());
		al.add(10);
		al.add(11);
		al.add(11);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2);
		System.out.println(al);
		System.out.println(al.get(1));
		// 2.Generics type-to remove warnings
		ArrayList<Object> al1 = new ArrayList<Object>();// only objects are added
		al1.add(11);
		al1.add("11");
		System.out.println(al1);
		ArrayList<Integer> al2 = new ArrayList<Integer>();// only integer type data allowed
		al2.add(12);
		al2.add(13);
		al2.add(14);
		// al2.add("c"); wiil give error as al2 Integera type homogenous using java
		// generics
		// How to Iterate Arraylist
		// 1. for loop
		for (int i = 0; i < al2.size(); i++) {
			System.out.print(al2.get(i) + ",");
		}
		System.out.println();
		for (Integer i : al2) {
			System.out.print(i + ",");
		}
		System.out.println();
		Iterator<Integer> itr=al2.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+",");
			
		}
		
		ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(100,2,3,4,5));
		Iterator<Integer> itr3=al3.iterator();
		while (itr3.hasNext()) {
			System.out.print(itr3.next()+",");
			
		}
	}

}

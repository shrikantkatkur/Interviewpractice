package javacollectionsprgorams;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	//In linked Manipulation or Data insertion is easy, beacuse we dont need any shifting
		public static void main(String[] args) {
			LinkedList<String> names= new LinkedList<String>();
			System.out.println(names.size());
			names.add("Tom");
			names.add("Tom1");
			names.add("Tom2");
			names.add("Tom3");
			System.out.println(names.size());
			//how to Iterate LinkedList
			Iterator<String> itr =names.iterator();
			while (itr.hasNext()) {
				//String string = (//String) itr.next();
				System.out.println(itr.next());
			}
			names.add(2,"Shri");
			System.out.println(names);
			LinkedList<String> users= new LinkedList<String>();
			users.add("user1");
			users.add("user3");
			users.add("user4");
			//names.addAll(users);
			//System.out.println(names);
			//System.out.println(names.containsAll(users));
			//System.out.println(names.removeAll(users));//removes common elements 
			//System.out.println(names);
			//System.out.println(names.retainAll(users));//remove uncommon elements
			//System.out.println(names);
			//How to reverse LinkedlIst
			Iterator<String> itr1=users.descendingIterator();
			while(itr1.hasNext()) {
				System.out.print(itr1.next());

	}

		}}

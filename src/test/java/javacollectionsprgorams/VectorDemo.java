package javacollectionsprgorams;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	//Vector is Legacy class and main diff bet al and vector is vector is Synchroinized,therfore perforamce is slow
	//no generics support
		public static void main(String[] args) {
			Vector<Integer> myVector=new Vector<Integer>();	
			myVector.add(50);
			myVector.add(20);
			myVector.add(40);
			System.out.println(myVector);
			System.out.println(myVector.get(1));
			Vector<Integer> yourVector=new Vector<Integer>();
			yourVector.add(55);
			yourVector.add(56);
			myVector.addAll(yourVector);
			System.out.println(myVector);
			//How to iterate
			for (Integer integer : yourVector) {
				System.out.println(integer);
				
			}
			Iterator<Integer> itr=yourVector.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			//how to sort
			Collections.sort(myVector);
			System.out.println(myVector);

	}

}

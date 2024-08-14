package collections1arraylist;

import java.util.ArrayList;

public class ALAllMethods {

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {6,7,8,9,3,4,10};
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for (Integer i : ar1) {
			al1.add(i);
		}
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for (Integer i : ar2) {
			al2.add(i);
		}
		//al1.addAll(al2);
		al1.removeAll(al2);//it will remove common elemnt from 1st array 
		//al1.retainAll(al2);//it will retain uncomman element or simply remove elements from 1st array which are present in second also
		
		System.out.println(al1);

	}

}

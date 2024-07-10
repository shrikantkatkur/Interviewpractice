package collections1arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		//1. sort collections and then use sort 
		ArrayList<String> al1= new ArrayList<String>(Arrays.asList("A","B","N","C"));
		ArrayList<String> al2= new ArrayList<String>(Arrays.asList("A","B","N","D"));
		ArrayList<String> al3= new ArrayList<String>(Arrays.asList("A","N","B","C"));
		Collections.sort(al1);
		Collections.sort(al2);
		Collections.sort(al3);
		System.out.println(al1.equals(al2));
		System.out.println(al1.equals(al3));
		//1. sort collections and then use sort
	}

}

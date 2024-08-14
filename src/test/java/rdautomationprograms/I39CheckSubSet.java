package rdautomationprograms;

import java.util.ArrayList;
import java.util.List;

public class I39CheckSubSet {

	public static boolean isSubset() {
		int [] a1= {1,2,3,4,5,6,7};
		int [] a2= {2,3,4,6,7};
		
		List<Integer> al1=new ArrayList<Integer>();
		for(int a:a1) {
			al1.add(a);
		}
		List<Integer> al2=new ArrayList<Integer>();
		for(int a:a2) {
			al2.add(a);
		}
		
		return al2.containsAll(al1);

	}
	public static void main(String[] args) {
		boolean result=isSubset();
		System.out.println(result);
	}

}

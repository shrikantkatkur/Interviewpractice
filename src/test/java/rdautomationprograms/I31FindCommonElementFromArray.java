package rdautomationprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class I31FindCommonElementFromArray {

	public static void usingRegularMethod(int[] a1, int[] a2) {
		int count = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					count++;
					System.out.print(a1[i] + ",");
				}
			}
		}
		if (count == 0) {
			System.out.println("No common Elements");
		}

	}
	
	public static void usingCollection(int[] a1, int[] a2) {
		
		List<Integer> al1=new ArrayList<Integer>();
		for(int a:a1) {
			al1.add(a);
		}
		List<Integer> al2=new ArrayList<Integer>();
		for(int a:a2) {
			al2.add(a);
		}
		
		//al1.removeAll(al2); output[2, 4, 1]--to find uncommon elements from 1st Array
		al1.retainAll(al2);//output [3, 8]-to find common/duplicate elements from both Array
		//al1.addAll(al2);//[2, 4, 3, 1, 8, 10, 0, 3, 6, 8] will join 2 arrays or append
		//al1.containsAll(al2);//check al2 is subset of al1 or not
		
		System.out.println(al1);
		
		
	}

	public static void main(String[] args) {
		int[] a1 = { 2, 4, 3, 1, 8 };
		int[] a2 = { 10, 0, 3, 6, 8 };
		usingRegularMethod(a1, a2);
		usingCollection(a1,a2);
	}

}

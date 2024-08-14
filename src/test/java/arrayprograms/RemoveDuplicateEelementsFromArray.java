package arrayprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateEelementsFromArray {

	
	public static void usingHashSet(int[] a) {
		Set<Integer> hs = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (Integer i : hs) {
			System.out.print(i + ",");
		}
		int l = hs.toArray().length;
		System.out.println();
		System.out.println("After removing dup length is :" + l);

	}

	public static void main(String[] args) {
		// Approach Array elements are sorted
		int[] a = { 1, 2, 3, 37, 7, 5, 5, 6, 6, 7, 8 };
		
		usingHashSet(a);

	}
}

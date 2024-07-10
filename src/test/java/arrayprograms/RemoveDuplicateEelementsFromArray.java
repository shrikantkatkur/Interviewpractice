package arrayprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateEelementsFromArray {

	public static int regularMethod(int[] a) {
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			a[i++] = a[j];
			while (j != a.length - 1 && a[j] == a[j + 1]) {
				j++;
			}
		}
		System.out.println(i);
		return i;
	}

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
		regularMethod(a);
		//usingHashSet(a);

	}
}

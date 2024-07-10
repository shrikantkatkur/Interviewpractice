package mustdohandon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateEelementsFromArray {

	public static void usingHashSet(int[] a) {
		Set<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for (Integer i : hs) {
			System.out.print(i + ",");
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 5, 6, 6, 7 };
		usingHashSet(a);

	}
}

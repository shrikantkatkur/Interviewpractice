package globantinterview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupFromArray {
	public static void removeDupFromArray(int[] x) {
		Set<Integer> hs = new TreeSet<Integer>();
		for (int i = 0; i < x.length; i++) {
			hs.add(x[i]);
		}
		for (Integer i : hs) {
			System.out.print(i + ",");
		}

	}

	public static void main(String[] args) {
		int[] x = { 1, 2, 22,144, 2, 3, 4, 5, 6, 6, 10 };
		RemoveDupFromArray.removeDupFromArray(x);
	}
}

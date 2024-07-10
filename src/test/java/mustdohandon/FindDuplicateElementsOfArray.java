package mustdohandon;

import java.util.HashSet;

public class FindDuplicateElementsOfArray {
	public static void usingRegularMethod(int[] x) {
		boolean flag = false;
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.print("Dupliacte element: "+x[i] + ",");
					flag = true;
				}
			}

		}
		if (flag == false)
			System.out.println("No Duplicate Elemets");

	}

	public static void usingHashSet(int[] x) {
		HashSet<Integer> hs = new HashSet<Integer>();
		boolean flag = false;
		for (int i = 0; i < x.length; i++) {
			if (hs.add(x[i]) == false) {
				flag = true;
				System.out.print("Dupliacte element:"+x[i] + ",");
			}

		}
		if (flag == false)
			System.out.println("No Duplicate Elements");

	}

	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40, 50,40,60,50 };
		usingRegularMethod(x);
		usingHashSet(x);

	}

}

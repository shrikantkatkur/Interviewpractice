package arrayprograms;

import java.util.Arrays;

public class HowToCheckEqualityOfArray {
	public static void usinginbuilt(int[] a1, int[] a2) {
		Arrays.sort(a1);
		Arrays.sort(a2);
		if (Arrays.equals(a1, a2)) {
			System.out.println("2 Arrays are equal");
		} else
			System.out.println("2 Arrays are NOT equal");

	}


	public static void usingRegularMethod(int[] a1, int[] a2) {
		boolean flag = true;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i]) {
				flag = false;
				System.out.println("2 Arrays are NOT equal");
			}

		}
		if (flag) {
			System.out.println("2 Arrays are equal");

		}

	}

	public static void main(String[] args) {
		int[] a1 = { 1, 2,4,3,5};
		int[] a2 = { 1, 2, 3, 4 ,5};
		usinginbuilt(a1, a2);
		usingRegularMethod(a1, a2);
	}

}

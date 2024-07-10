package arrayprograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingOfArray {
	public static void usingRegularMethod(int[] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {// < descending Order
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		//System.out.println(Arrays.toString(x));
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+",");
		}
	}

	public static void usingBuiltIn1(int[] x) {
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}

	public static void usingBuiltIn2(int[] x) {
		Arrays.parallelSort(x);
		System.out.println(Arrays.toString(x));
	}
	
	public static void usingBuiltIn3(Integer [] a) {
		Arrays.sort(a,Collections.reverseOrder());
		System.out.print(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int [] x = { 10, 12, 13, 17, 11, 4, 14, 15 };
		Integer[] a = { 10, 12, 13, 17, 11, 4, 14, 15,16};//to sort in desceding order Integer we have to take ,Collections.reverseorder
		 usingRegularMethod(x);
		// usingBuiltIn1(x);
		//usingBuiltIn2(x);
		//usingBuiltIn3(a);

	}

}

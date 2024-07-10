package arrayprograms;

import java.util.Arrays;
//prerquesite is elements are in sorted order
//Diff bet binaray and linear search
//binary is fast,binary cond element are in sorted order

public class BinarySearchAlgorithm {
	public static void usingRegularMethod(int[] x, int searchElement) {
		boolean flag = false;
		int l = 0;
		int h = x.length - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (searchElement == x[m]) {
				flag = true;
				System.out.println("Element Found");
			}
			if (searchElement < m) {
				h = m - 1;
			}
			if (searchElement > m) {
				l = m + 1;
			}

		}
		if (flag == false)
			System.out.println("Element Not found");

	}
	public static void usingBuiltInMethod(int[]x,int searchElement) {
		System.out.println(Arrays.binarySearch(x, searchElement));//return the index if found,if not found return any negative value
	}

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5};
		int searchElement=3;
		//usingRegularMethod(x, searchElement);
		usingBuiltInMethod(x, searchElement);
		

}
}

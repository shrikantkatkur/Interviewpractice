package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveArrayElement {

	public static void usingForLoop(int[] x, int element) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (element == x[i]) {
				for (int j = i; j < x.length - 1; j++) {// -1 because aray index of out of bound
					x[j] = x[j + 1];
				}
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Element not fount");
		} else {
			for (int i = 0; i < x.length - 1; i++) {
				System.out.print(x[i] + ",");
			}
		}
	}

	public static void usingCollection(int[] x, int element) {
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < x.length; i++) {
			al.add(x[i]);
		}
		int e = al.indexOf(element);
		al.remove(e);
		System.out.println(al);
	}

	public static void main(String[] args) {
		int[] x = { 1, 23, 44, 10, 44, 50, 60 };
		RemoveArrayElement.usingForLoop(x, 1);
	   RemoveArrayElement.usingCollection(x, 1);

	}

}

package rdautomationprograms;

import java.util.ArrayList;
import java.util.List;

import arrayprograms.RemoveArrayElement;

public class I34RemoveArrayElement {
	public static void usingForLoop(int[] x, int element) {
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (element == x[i]) {
				for (int j = i; j < x.length-1 ; j++) {// -1 because aray index of out of bound
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
		for (int s:x) {
			if(element!=s) {
				al.add(s);
			}
		}
		System.out.println(al);
		
	}

	public static void main(String[] args) {
		int[] x = { 1, 23, 44, 10, 44, 50, 60 };
		usingForLoop(x, 111);
	 // usingCollection(x, 1);

	}

}

package arrayprograms;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hpsf.Array;

public class ArrayAppend {
	public static void usingRegularMethod() {
		// Using Literals
				int[] x = { 1, 2, 3, 4, 5 };
				// 2 using New keyword
				int[] y = new int[5];
				y[0] = 6;
				y[1] = 7;
				y[2] = 8;
				y[3] = 9;
				y[4] = 10;
				int z[] = new int[x.length + y.length];
				int i = 0;
				for (; i < x.length; i++) {
					z[i] = x[i];
				}
				for (int j = 0; j < y.length; j++) {
					z[i] = y[j];// z[6]=y[0]
					i++;// i=7
				}
				for (int j = 0; j < z.length; j++) {
					System.out.print(z[j] + ",");
				}

	}
	
	public static void  usingAl() {
		int ar1[]= {1,2,3,4,5};
		int ar2[]= {6,7,8,9,10};
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for (Integer i : ar1) {
			al1.add(i);
		}
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for (Integer i : ar2) {
			al2.add(i);
		}
		al1.addAll(al2);
		System.out.println(al1);
	}
	
	

	public static void main(String[] args) {
		usingRegularMethod();
		usingAl();
	}

}
